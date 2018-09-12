package com.power.bank.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.power.bank.common.utils.CookieUtil;
import com.power.bank.common.utils.JsonResultHandler;
import com.power.bank.common.utils.SessionUtil;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

@RestController
@RequestMapping("/home")
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    private static final String VERIFY_CODE_KEY = "verifyCode";

    @Resource
    DefaultKaptcha defaultKaptcha;

    @Autowired
    SessionUtil sessionUtil;

    @Autowired
    CookieUtil cookieUtil;

    @RequestMapping(value = "/get-verify-code",method = RequestMethod.GET)
    public String getVerifyCode(HttpServletRequest request, HttpServletResponse response){
        JSONObject jsonObject = new JSONObject();
        JsonResultHandler.handlerObject(jsonObject,"0","获取成功");
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            String createText = defaultKaptcha.createText();
            logger.info("current VerifyCode is {}", createText);
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
            captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
            String base64Img = Base64.encodeBase64String(captchaChallengeAsJpeg);
            jsonObject.put("code", "0");
            jsonObject.put("msg", "获取验证码成功");
            jsonObject.put("base64_img_code", base64Img);
            jsonObject.put("verifyCode",createText);
            String id = request.getSession().getId();
            System.out.println("sessionId="+id);
            sessionUtil.addAttribute(id + VERIFY_CODE_KEY, createText, 60 * 5);
            String cpcSessionId = cookieUtil.getCookieByName(request, SessionUtil.CPC_LOGIN_SESSION);
            if (StringUtils.isEmpty(cpcSessionId)) {
                cpcSessionId = request.getSession().getId();
                Cookie cookie = new Cookie(SessionUtil.CPC_LOGIN_SESSION, cpcSessionId);
                cookie.setPath("/");
                response.addCookie(cookie);
            }
        } catch (Exception e) {
            logger.error("GET_VERIFY_CODE_ERROR:", e);
            JsonResultHandler.handlerObject(jsonObject,"-9001","系统异常");
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password, String verifyCode, HttpServletRequest request, HttpServletResponse response) {
        logger.info("login------username={},password={},verifyCode={}", username, password, verifyCode);
        JSONObject jsonObject = new JSONObject();
        try {
            String id = request.getSession().getId();
            System.out.println("sessionId="+id);
            Object targetVerifyCode = sessionUtil.getAttribute(id + VERIFY_CODE_KEY);
            if (StringUtils.isEmpty(verifyCode) || StringUtils.isEmpty(verifyCode) || !targetVerifyCode.toString().equals(verifyCode)) {
                getVerifyCode(request, response);
                return JsonResultHandler.handler(jsonObject, "-1001", "验证码输入错误");
            }
            if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
                getVerifyCode(request, response);
                return JsonResultHandler.handler(jsonObject, "-1001", "用户名或者密码不能为空");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonObject.toString();
    }

}

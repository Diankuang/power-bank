package com.power.bank.controller;

import com.alibaba.fastjson.JSONObject;
import com.power.bank.dto.LoginDto;
import com.power.bank.dto.RegisterDto;
import com.power.bank.dto.WishListDto;
import com.power.bank.entity.TUser;
import com.power.bank.service.UserService;
import com.power.bank.utils.JsonResultHandler;
import com.power.bank.utils.SessionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
    SessionUtil sessionUtil;
    /**
     * 检验email是否已经注册
     * @param email
     * @return
     */
    @RequestMapping(value = "/check-email-exist",method = RequestMethod.GET)
    public String checkEmailExust(String email){
        logger.info("/check-email-exist,email={}",email);
        JSONObject jsonObject = new JSONObject();
        try {
            boolean b = userService.checkEmalExistEmail(email);
            if(b == true){
                JsonResultHandler.handler(jsonObject,"-1001","this email has exist,using another please");
            }else{
                JsonResultHandler.handler(jsonObject,"0","useable");
            }
        } catch (Exception e) {
            logger.info("e={}",e);
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }

    /**
     * 注册
     * @param dto
     * @return
     */
    @RequestMapping(value="/register",method = RequestMethod.POST)
    public String register(@RequestBody RegisterDto dto){
        logger.info("/register,registerDto={}",dto);
        JSONObject jsonObject = new JSONObject();
        try {
            if(StringUtil.isEmpty(dto.getEmail())||StringUtil.isEmpty(dto.getFirstName())||StringUtil.isEmpty(dto.getLastName())
                    ||StringUtil.isEmpty(dto.getPassword())||dto.getUserClass()==null){
                return JsonResultHandler.handler(jsonObject,"-1001","UesrInfo can not be null");
            }
            boolean b = userService.checkEmalExistEmail(dto.getEmail());
            if(b){
                return JsonResultHandler.handler(jsonObject,"-1001","This email has been registed,please change anothe");
            }
            TUser tUser = userService.userRegister(dto);
            JsonResultHandler.handler(jsonObject,"0","注册成功");
            jsonObject.put("user",tUser);

        } catch (Exception e) {
            JsonResultHandler.handler(jsonObject,"-9001","系统异常");
        }
        return jsonObject.toString();
    }

    /**
     * 登录
     * @param dto
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody LoginDto dto, HttpServletRequest request, HttpServletResponse response){
        logger.info("/login,LogiinDto={}",dto);
        JSONObject jsonObject = new JSONObject();
        try {
            if(StringUtil.isEmpty(dto.getEmail())||StringUtil.isEmpty(dto.getPassword())){
                return JsonResultHandler.handler(jsonObject,"-1001","email or pwssword can't be null!");
            }
            jsonObject = userService.userLogin(dto);
//            if(jsonObject.get("code").equals("0")){
//                sessionUtil.addAttribute(request.getSession().getId(),jsonObject.get("user"));
//            }
        } catch (Exception e) {
            logger.info("e={}",e);
            JsonResultHandler.handlerObject(jsonObject,"-9001","System Error!");
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request,HttpServletResponse response){
        String sessionId = request.getSession().getId();
        logger.info("/logout,sessionId={}",sessionId);
        JSONObject jsonObject = new JSONObject();
        try {
//            sessionUtil.clearSession(sessionId);
            JsonResultHandler.handler(jsonObject,"0","You are signed out");
        } catch (Exception e) {
            JsonResultHandler.handler(jsonObject,"0","System Error");
        }
        return jsonObject.toString();
    }
    /**
     * 添加收藏产品
     * @param dto
     * @return
     */
    @RequestMapping(value = "/add-or-update-wish-list",method = RequestMethod.POST)
    public String addOrUpdateWishList(@RequestBody WishListDto dto){
        logger.info("/add-or-update-wish-list,WishListDto={}",dto);
        JSONObject jsonObject = new JSONObject();
        try {
            if(StringUtil.isEmpty(dto.getUserId())||StringUtil.isEmpty(dto.getProductId())|| dto.getFlag() == null){
                return JsonResultHandler.handler(jsonObject,"-1001","参数异常");
            }
            userService.addOrUpdateWishList(dto);
        } catch (Exception e) {
            logger.info("e={}",e);
            JsonResultHandler.handler(jsonObject,"-9001","System Error!");
        }
        return jsonObject.toString();
    }
}

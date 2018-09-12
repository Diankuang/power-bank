package com.power.bank.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class SessionUtil {

    private Logger logger = LoggerFactory.getLogger(SessionUtil.class);

    public static final String CPC_LOGIN_SESSION="cpcSessionId";

    @Autowired
    RedisUtil redisUtil;

   // private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();


    public SessionUtil(){}

    public SessionUtil(HttpServletRequest request){
//        logger.info("request.getSession().getId()={}",request.getSession().getId());
//        threadLocal.set(request.getSession().getId());
    }

    public void addAttribute(String key,Object obj) {
        logger.info("======================set key={}",key);
        redisUtil.set(key,obj,60*60*24);
    }

    public void addAttribute(String key,Object obj,Integer second) {
        logger.info("======================set key={}",key);
        redisUtil.set(key,obj,second);
    }

    public Object getAttribute(String key) {
        logger.info("======================get key={}",key);
        return redisUtil.get(key);
    }

    public boolean clearSession(String key){
        return redisUtil.delete(key);
    }

}

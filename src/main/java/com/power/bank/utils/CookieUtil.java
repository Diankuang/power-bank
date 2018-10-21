package com.power.bank.utils;

import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author xiedishi
 * @date 2018/7/3
 */
@Component
public class CookieUtil {
    public String getCookieByName(HttpServletRequest request, String name){
        if (request.getCookies()!=null){
            for (Cookie cookie : request.getCookies()){
                if (cookie.getName().equals(name)){
                    return cookie.getValue();
                }
            }
        }
        return "";
    }

}

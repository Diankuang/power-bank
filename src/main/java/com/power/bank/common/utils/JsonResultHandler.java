package com.power.bank.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xiedishi
 * @date 2018/7/3
 */
public class JsonResultHandler {

    private static Logger logger = LoggerFactory.getLogger(JsonResultHandler.class);
    public static final String SUCCESS = "0";
    public static final String PARAM_EMPTY="-1001";
    public static final String SYS_ERROR = "-9001";

    public static String handler(JSONObject jsonObject,String code,String msg){
        jsonObject.put("code",code);
        jsonObject.put("msg",msg);
        return jsonObject.toJSONString();
    }

    public static JSONObject handlerObject(JSONObject jsonObject,String code,String msg){
        jsonObject.put("code",code);
        jsonObject.put("msg",msg);
        return jsonObject;
    }
}

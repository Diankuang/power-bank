package com.power.bank.utils;

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
    public static final String SYS_EMPTY = "-2001";
    public static final String SYS_ERROR = "-9001";

    private String error_code;
    private String error_msg;
    private String data;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    public static String handleSuccessResult(JSONObject jsonObject,String errorMsg,String data){
        jsonObject.put("code","0");
        jsonObject.put("msg",errorMsg);
        jsonObject.put("data",data);
        return jsonObject.toJSONString();
    }

    public static String handlerCommonResult(JSONObject jsonObject){
        logger.info("resultJson={}",jsonObject);
        if (null == jsonObject){
            jsonObject = new JSONObject(4);
            jsonObject.put("code","-3001");
            jsonObject.put("msg","操作失败,请重新操作");
            return jsonObject.toJSONString();
        }
        return jsonObject.toJSONString();
    }

    public static String handlerEmptyParam(JSONObject jsonObject,String errorMsg){
        return handler(jsonObject,PARAM_EMPTY,errorMsg);
    }

    public static String handlerEmptyParam(JSONObject jsonObject){
        return handlerEmptyParam(jsonObject,"参数为空");
    }

    public static String handlerSystemError(JSONObject jsonObject,String errorMsg){
        return handler(jsonObject, SYS_ERROR,errorMsg);
    }

    public static String handlerSystemError(JSONObject jsonObject){
        return handlerSystemError(jsonObject,"系统错误");
    }

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

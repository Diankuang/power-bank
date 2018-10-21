package com.power.bank.utils;

import java.util.Random;

public class ToolsUtil {

    public static String getUUID(){
        Random rand=new Random();//生成随机数
        String uuid="";
        for(int a=0;a<10;a++){
            uuid+=rand.nextInt(10);//生成6位数字
        }
        return uuid;
    }
}

package com.power.bank.utils;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterUtil {

    /**
     * 将byte数组转换成十六进制
     * @param bytes
     * @return
     */
    public static List<String> bytesToHexadecimal (byte[] bytes) {
        List<String> list = new ArrayList<>();
        for(byte b : bytes) { // 使用String的format方法进行转换
            list.add(String.format("%02x", new Integer(b & 0xff)));
        }

        return list;
    }

    public static String characterModify(String str,String oldSimbol,String newSimbol){
        String s = str.replaceAll(oldSimbol, newSimbol);
        s+="cosntant";
        return s;
    }

    public static String getUserId(){
        Random random = new Random();
        String str = "";
        for(int a=0;a<8;a++){
            str += random.nextInt(10);
        }

        return str;
    }
}

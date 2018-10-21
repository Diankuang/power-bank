package com.power.bank.controller;

import com.alibaba.fastjson.JSONObject;
import com.power.bank.utils.JsonResultHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileController {

    private Logger logger = LoggerFactory.getLogger(FileController.class);

    @RequestMapping(value = "/upload-img",method = RequestMethod.POST)
    public String uploadImg(MultipartFile file){
        logger.info("/upload-img,file={}",file.getName());
        JSONObject jsonObject = new JSONObject();
        try {
            if(file == null){
                return JsonResultHandler.handler(jsonObject,"-1001","文件不能为空");
            }
            String filePath = "uploadFile/";
            String fileName = file.getName();
            File fl = new File(filePath+fileName);
            file.transferTo(fl);
        } catch (IOException e) {
            logger.info("系统异常,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }
}

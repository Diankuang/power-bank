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
import java.util.logging.Filter;

@RestController
@RequestMapping("/file")
public class FileController {

    private Logger logger = LoggerFactory.getLogger(FileController.class);

    private static String uploadPath = "D:\\opt\\data\\fileUpload\\";

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String uploadImg(MultipartFile file,String productId,String type){
        logger.info("/upload-img,file={}",file.getOriginalFilename());
        JSONObject jsonObject = new JSONObject();
        try {
            if(file == null){
                return JsonResultHandler.handler(jsonObject,"-1001","文件不能为空");
            }
            String filePath = uploadPath+type+"\\";
            File fl = new File(filePath);
            if(!fl.exists()){
                fl.mkdir();
            }
            String fileName = filePath+file.getOriginalFilename();
            System.out.println(fileName);
            File f = new File(fileName);
            file.transferTo(f);
            jsonObject.put("fileName",file.getOriginalFilename());
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (IOException e) {
            logger.info("系统异常,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }
}

package com.power.bank.controller;

import com.alibaba.fastjson.JSONObject;
import com.power.bank.dto.QueryTemDto;
import com.power.bank.dto.TemperDto;
import com.power.bank.entity.TTemper;
import com.power.bank.entity.TTemperPicture;
import com.power.bank.service.TemperService;
import com.power.bank.utils.JsonResultHandler;
import com.power.bank.utils.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

@RestController
@RequestMapping("/temper")
public class TemperController {

    private static Logger logger = LoggerFactory.getLogger(TemperController.class);

    @Autowired
    TemperService temperService;

    @RequestMapping(value = "/add-temper",method = RequestMethod.POST)
    public String addTemper(@RequestBody TemperDto dto){
        logger.info("/add-temper,TemperDto={}",dto);
        JSONObject jsonObject = new JSONObject();
        try {
            temperService.addTemper(dto);
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (Exception e) {
            logger.info("System Error,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "/query-temper",method = RequestMethod.POST)
    public String queryTemperList(@RequestBody QueryTemDto dto){
        logger.info("query-temper,QueryTemDto={}",dto);
        JSONObject jsonObject = new JSONObject();
        try {
            List<TTemper> list = temperService.queryTemperList(dto);
            if(list!=null&&list.size()>0){
                jsonObject.put("list",list);
                jsonObject.put("total",list.size());
            }
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (Exception e) {
            logger.info("System Error,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "/query-Temper-detail",method = RequestMethod.POST)
    public String queryTemperDetail(String temperId){
        logger.info("/query-Temper-detail,temperId={}",temperId);
        JSONObject jsonObject = new JSONObject();
        try {
            if(StringUtil.isEmpty(temperId)){
                return JsonResultHandler.handler(jsonObject,"-1001","temperId can't be null");
            }
            TTemper tTemper = temperService.queryTemByTemperId(temperId);
            if(tTemper == null){
                return JsonResultHandler.handler(jsonObject,"-1001","tTemper not exist");
            }
            List<TTemperPicture> tTemperPictures = temperService.queryTemPicByTemperId(temperId);
            if(tTemperPictures!=null && tTemperPictures.size()>0){
                jsonObject.put("tTemperPic",tTemperPictures);
            }
            jsonObject.put("tTemper",tTemper);
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (Exception e) {
            logger.info("System Error,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }
}

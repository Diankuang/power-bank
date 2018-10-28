package com.power.bank.controller;

import com.alibaba.fastjson.JSONObject;
import com.power.bank.dto.FaqDto;
import com.power.bank.entity.TFaq;
import com.power.bank.service.FaqService;
import com.power.bank.utils.JsonResultHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faq")
public class FaqController {

    private static Logger logger = LoggerFactory.getLogger(FaqController.class);

    @Autowired
    FaqService faqService;

    @RequestMapping(value = "/add-faq",method = RequestMethod.POST)
    public String addFaq(@RequestBody FaqDto dto){
        logger.info("/add-faq,FaqDto={}",dto);
        JSONObject jsonObject = new JSONObject();
        try {
            faqService.addFaq(dto);
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (Exception e) {
            logger.info("System Error,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "/query-latest",method = RequestMethod.POST)
    public String quetyLatestList(){
        logger.info("/query-latest");
        JSONObject jsonObject = new JSONObject();
        try {
            List<TFaq> tFaqs = faqService.queryLatestList();
            jsonObject.put("list",tFaqs);
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (Exception e) {
            logger.info("System Error,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "/query-all",method = RequestMethod.POST)
    public String quetyAll(){
        logger.info("/query-all");
        JSONObject jsonObject = new JSONObject();
        try {
            List<TFaq> tFaqs = faqService.queryAll();
            jsonObject.put("list",tFaqs);
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (Exception e) {
            logger.info("System Error,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }
}

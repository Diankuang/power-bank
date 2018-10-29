package com.power.bank.controller;

import com.alibaba.fastjson.JSONObject;
import com.power.bank.dto.ContactDto;
import com.power.bank.service.ContactUsService;
import com.power.bank.utils.JsonResultHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.util.StringUtil;

import java.io.IOException;

@RestController
@RequestMapping("/contact")
public class ContactUsController {

    private static Logger logger = LoggerFactory.getLogger(ContactUsController.class);

    @Autowired
    ContactUsService contactUsService;

    @RequestMapping(value = "/add-contact",method = RequestMethod.POST)
    public String addContact(@RequestBody ContactDto dto){
        logger.info("/add-contact,ContactDto={}",dto);
        JSONObject jsonObject = new JSONObject();
        try {
            if(StringUtil.isEmpty(dto.getName())||StringUtil.isEmpty(dto.getEmail())||
                    StringUtil.isEmpty(dto.getTel())||StringUtil.isEmpty(dto.getContent())){
                return JsonResultHandler.handler(jsonObject,"-1001","Param is Empity");
            }
            contactUsService.addContact(dto);
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (Exception e) {
            logger.info("System Error,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "query-contact",method = RequestMethod.POST)
    public String queryContact(){
        JSONObject jsonObject = new JSONObject();

        return jsonObject.toString();
    }
}

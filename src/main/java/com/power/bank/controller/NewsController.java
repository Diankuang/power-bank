package com.power.bank.controller;

import com.alibaba.fastjson.JSONObject;
import com.power.bank.dto.NewsDto;
import com.power.bank.service.NewsService;
import com.power.bank.utils.JsonResultHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.util.StringUtil;

@RestController
@RequestMapping("/news")
public class NewsController {

    private static Logger logger = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    NewsService newsService;

    @RequestMapping(value = "/add-news",method = RequestMethod.POST)
    public String addNews(@RequestBody NewsDto dto){
        logger.info("/add-news,NewsDto={}",dto);
        JSONObject jsonObject = new JSONObject();
        try {
            if(StringUtil.isEmpty(dto.getTitle())||StringUtil.isEmpty(dto.getContent())){
                return JsonResultHandler.handler(jsonObject,"-1001","param null");
            }
            newsService.addNews(dto);
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (Exception e) {
            logger.info("e={}",e);
            JsonResultHandler.handlerObject(jsonObject,"-9001","System Error!");
        }
        return jsonObject.toString();
    }
}

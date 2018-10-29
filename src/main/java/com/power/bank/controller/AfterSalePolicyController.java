package com.power.bank.controller;

import com.alibaba.fastjson.JSONObject;
import com.power.bank.dto.AfterSalePolicyDto;
import com.power.bank.entity.TAfterSalePolicy;
import com.power.bank.service.AfterSalePolicyService;
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
@RequestMapping("/after-sale-policy")
public class AfterSalePolicyController {

    private Logger logger = LoggerFactory.getLogger(AfterSalePolicyController.class);

    @Autowired
    AfterSalePolicyService afterSalePolicyService;

    /**
     * 新增AfterSalePolicy
     * @param dto
     * @return
     */
    @RequestMapping(value = "/add-asp",method = RequestMethod.POST)
    public String addAfterSalePolicy(@RequestBody AfterSalePolicyDto dto){
        logger.info("/add-asp,AfterSalePolicyDto={}",dto);
        JSONObject jsonObject = new JSONObject();
        try {
            afterSalePolicyService.addAfterSalePolicy(dto);
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (Exception e) {
            logger.info("System Error,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }

    /**
     * 查询AfterSalePolicy
     * @return
     */
    @RequestMapping(value = "/query-asp",method = RequestMethod.POST)
    public String queryAsp(){
        logger.info("/query-asp");
        JSONObject jsonObject = new JSONObject();
        try {
            List<TAfterSalePolicy> list = afterSalePolicyService.queryAspList();
            jsonObject.put("list",list);
            JsonResultHandler.handler(jsonObject,"0","Success");
        } catch (Exception e) {
            logger.info("System Error,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }
}

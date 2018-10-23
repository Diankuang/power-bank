package com.power.bank.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.power.bank.dao.TProductMapper;
import com.power.bank.dto.ProductQueryDto;
import com.power.bank.entity.TPowerProduct;
import com.power.bank.entity.TProduct;
import com.power.bank.service.ProductService;
import com.power.bank.utils.JsonResultHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private static Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/query-power-products",method = RequestMethod.POST)
    public String getProduts(@RequestBody ProductQueryDto dto){
        logger.info("/query-power-products,ProductQueryDto={}",dto);
        JSONObject jsonObject = new JSONObject();
        try {
            if(StringUtil.isEmpty(dto.getType())){
                return JsonResultHandler.handler(jsonObject,"-1001","type null");
            }
            int pageSize = dto.getPageSize();
            Integer total = productService.queryProductTotal(dto.getType());
            List<TPowerProduct> list = productService.queryProductList(dto);
            jsonObject.put("total",total);
            if(total%pageSize == 0){
                jsonObject.put("pageNum",total/pageSize);
            }else {
                jsonObject.put("pageNum",total/pageSize+1);
            }
            jsonObject.put("list",list);
            JsonResultHandler.handler(jsonObject,"0","Query Success");
        } catch (Exception e) {
            logger.info("System Error,e={}",e.getMessage());
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toJSONString();
    }
}

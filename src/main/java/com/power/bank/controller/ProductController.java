package com.power.bank.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.power.bank.dao.TProductMapper;
import com.power.bank.dto.PowerProductDto;
import com.power.bank.dto.ProductQueryDto;
import com.power.bank.entity.TPowerProduct;
import com.power.bank.entity.TProduct;
import com.power.bank.entity.TProductPicture;
import com.power.bank.service.ProductService;
import com.power.bank.utils.JsonResultHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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

    @RequestMapping(value = "/add-power-products",method = RequestMethod.POST)
    public String addPowerProducts(@RequestBody PowerProductDto dto){
        JSONObject jsonObject = new JSONObject();
        try {
            productService.addPowerProduct(dto);
            JsonResultHandler.handler(jsonObject,"0","添加成功");
        } catch (Exception e) {
            logger.info("系统异常,e={}",e);
            JsonResultHandler.handler(jsonObject,"-9001","系统异常");
        }
        return jsonObject.toString();
    }
    /**
     * 查询产品列表
     * @param dto
     * @return
     */
    @RequestMapping(value = "/query-power-products",method = RequestMethod.POST)
    public String queryProduts(@RequestBody ProductQueryDto dto){
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

    @RequestMapping(value = "/query-power-pro-detail",method = RequestMethod.POST)
    public String queryPowerProductDetail(String productId){
        logger.info("/query-power-pro-detail,productId={}",productId);
        JSONObject jsonObject = new JSONObject();
        try {
            if(StringUtil.isEmpty(productId)){
                return JsonResultHandler.handler(jsonObject,"-1001","productId can't be null");
            }
            TPowerProduct tPowerProduct = productService.queryTPowerProduct(productId);
            if(tPowerProduct == null){
                return JsonResultHandler.handler(jsonObject,"-1001","This product doesn't exist");
            }
            List<TProductPicture> tProductPictures = productService.queryProductPictureList(productId);
            JsonResultHandler.handler(jsonObject,"0","Query Success");
            jsonObject.put("product",tPowerProduct);
            jsonObject.put("productPicture",tProductPictures);
        } catch (Exception e) {
            logger.info("System Error,e={}",e);
            JsonResultHandler.handler(jsonObject,"-9001","System Error");
        }
        return jsonObject.toString();
    }
}

package com.power.bank.service;

import com.power.bank.dao.TPowerProductMapper;
import com.power.bank.dao.TProductMapper;
import com.power.bank.dao.TProductPictureMapper;
import com.power.bank.dto.PictureDto;
import com.power.bank.dto.PowerProductDto;
import com.power.bank.dto.ProductQueryDto;
import com.power.bank.entity.TPowerProduct;
import com.power.bank.entity.TProductPicture;
import com.power.bank.utils.ToolsUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    TProductMapper tProductMapper;

    @Autowired
    TProductPictureMapper tProductPictureMapper;

    @Autowired
    TPowerProductMapper tPowerProductMapper;

    private String getPowerProId(){
        String uuid = ToolsUtil.getUUID();
        if(tPowerProductMapper.selectByPrimaryKey(uuid) != null){
            return getPowerProId();
        }else{
            return uuid;
        }
    }

    private String getProPicId(){
        String uuid = ToolsUtil.getUUID();
        if(tPowerProductMapper.selectByPrimaryKey(uuid)!=null){
            return getProPicId();
        }else {
            return uuid;
        }
    }

    public void addPowerProduct(PowerProductDto dto){
        TPowerProduct tPowerProduct = new TPowerProduct();
        BeanUtils.copyProperties(dto, tPowerProduct);
        tPowerProduct.setId(getPowerProId());
        tPowerProduct.setCreateTime(new Date());
        tPowerProductMapper.insert(tPowerProduct);

        List<PictureDto> picture = dto.getPicture();
        for (PictureDto picDto:picture){
            TProductPicture tProductPicture = new TProductPicture();
            tProductPicture.setId(getProPicId());
            tProductPicture.setProductId(tPowerProduct.getId());
            tProductPicture.setType(dto.getType());
            tProductPicture.setPicture(picDto.getPicture());
            tProductPicture.setOrderNo(picDto.getOrderNo());
            tProductPicture.setCreateTime(new Date());
            tProductPictureMapper.insert(tProductPicture);
        }

    }

    public Integer queryProductTotal(String type){
        Example example = new Example(TPowerProduct.class);
        example.createCriteria().andEqualTo("type",type);
        return tPowerProductMapper.selectCountByExample(example);
    }

    public List<TPowerProduct> queryProductList(ProductQueryDto dto){
        dto.setStartRow((dto.getPageNum()-1)*dto.getPageSize());
        dto.setEndRow(dto.getPageNum() * dto.getPageSize());
        List<TPowerProduct> tPowerProducts = tPowerProductMapper.queryPowerProductList(dto);
        for (TPowerProduct t : tPowerProducts){
            List<TProductPicture> tProductPictures = queryProductPictureList(t.getId());
            if(tProductPictures != null && tProductPictures.size()>0){
                TProductPicture tProductPicture = tProductPictures.get(0);
                t.setPicture(tProductPicture.getPicture());
            }
        }
        return tPowerProducts;
    }

    public TPowerProduct queryTPowerProduct(String productId){
        return tPowerProductMapper.selectByPrimaryKey(productId);
    }

    public List<TProductPicture> queryProductPictureList(String productId){
        Example example = new Example(TProductPicture.class);
        example.createCriteria().andEqualTo("productId",productId);
        example.orderBy("orderNo").asc();
        return tProductPictureMapper.selectByExample(example);
    }
}

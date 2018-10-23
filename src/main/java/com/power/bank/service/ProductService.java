package com.power.bank.service;

import com.github.pagehelper.Page;
import com.power.bank.dao.TPowerProductMapper;
import com.power.bank.dao.TProductMapper;
import com.power.bank.dto.ProductQueryDto;
import com.power.bank.entity.TPowerProduct;
import com.power.bank.entity.TProduct;
import com.power.bank.utils.ToolsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    TProductMapper tProductMapper;

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

    public void addPowerProduct(TPowerProduct tPowerProduct){
        tPowerProduct.setId(getPowerProId());
        tPowerProductMapper.insert(tPowerProduct);
    }
    public Integer queryProductTotal(String type){
        Example example = new Example(TPowerProduct.class);
        example.createCriteria().andEqualTo("type",type);
        return tPowerProductMapper.selectCountByExample(example);
    }

    public List<TPowerProduct> queryProductList(ProductQueryDto dto){
        dto.setStartRow((dto.getPageNum()-1)*dto.getPageSize());
        dto.setEndRow(dto.getPageNum() * dto.getPageSize());
        return tPowerProductMapper.queryPowerProductList(dto);
    }

}

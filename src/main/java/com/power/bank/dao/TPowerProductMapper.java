package com.power.bank.dao;

import com.github.pagehelper.Page;
import com.power.bank.dto.ProductQueryDto;
import com.power.bank.entity.TPowerProduct;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TPowerProductMapper extends Mapper<TPowerProduct> {

    List<TPowerProduct> queryPowerProductList(ProductQueryDto dto);
}
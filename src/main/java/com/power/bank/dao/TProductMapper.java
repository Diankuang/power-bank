package com.power.bank.dao;

import com.github.pagehelper.Page;
import com.power.bank.dto.ProductQueryDto;
import com.power.bank.entity.TProduct;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TProductMapper extends Mapper<TProduct> {

    List<TProduct> queryProductList(Page page, String type);
}
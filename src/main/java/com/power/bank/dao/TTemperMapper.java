package com.power.bank.dao;

import com.power.bank.entity.TTemper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface TTemperMapper extends Mapper<TTemper> {

    List<TTemper> queryTemperList(Map<String,Object> map);
}
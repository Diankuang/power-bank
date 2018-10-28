package com.power.bank.dao;

import com.power.bank.entity.TFaq;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TFaqMapper extends Mapper<TFaq> {

    List<TFaq> queryLatestList();
}
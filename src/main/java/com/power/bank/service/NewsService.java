package com.power.bank.service;

import com.power.bank.dao.TNewsMapper;
import com.power.bank.dto.NewsDto;
import com.power.bank.entity.TNews;
import com.power.bank.utils.ToolsUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class NewsService {

    @Autowired
    TNewsMapper tNewsMapper;

    private String getId(){
        String uuid = ToolsUtil.getUUID();
        if(tNewsMapper.existsWithPrimaryKey(uuid)){
            return getId();
        }else{
            return uuid;
        }
    }

    public void addNews(NewsDto dto){
        TNews tNews = new TNews();
        BeanUtils.copyProperties(dto,tNews);
        tNews.setNewsId(getId());
        tNews.setCreateTime(new Date());
        tNews.setStatus("0");
        tNewsMapper.insert(tNews);
    }
}

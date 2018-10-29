package com.power.bank.service;

import com.power.bank.dao.TFaqMapper;
import com.power.bank.dto.FaqDto;
import com.power.bank.entity.TFaq;
import com.power.bank.utils.ToolsUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FaqService {

    @Autowired
    TFaqMapper tFaqMapper;

    private String getFaqId(){
        String uuid = ToolsUtil.getUUID();
        if(tFaqMapper.existsWithPrimaryKey(uuid)){
            return getFaqId();
        }else{
            return uuid;
        }
    }
    public void addFaq(FaqDto dto){
        TFaq faq = new TFaq();
        BeanUtils.copyProperties(dto,faq);
        faq.setId(getFaqId());
        faq.setCreateTime(new Date());
        faq.setStatus("0");
        tFaqMapper.insert(faq);
    }

    public List<TFaq> queryLatestList(){
        return tFaqMapper.queryLatestList();
    }

    public List<TFaq> queryAll(){
        List<TFaq>  list = tFaqMapper.selectAll();
        if(list!=null && list.size()>0){
            for (TFaq faq : list){
                faq.setCreateTime(null);
                faq.setUpdateTime(null);
            }
        }
        return list;
    }
}

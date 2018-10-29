package com.power.bank.service;

import com.power.bank.dao.TContactUsMapper;
import com.power.bank.dto.ContactDto;
import com.power.bank.entity.TContactUs;
import com.power.bank.utils.ToolsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ContactUsService {

    @Autowired
    TContactUsMapper tContactUsMapper;

    private String getConId(){
        String uuid = ToolsUtil.getUUID();
        if(tContactUsMapper.existsWithPrimaryKey(uuid)){
            return getConId();
        }else {
            return uuid;
        }
    }

    public void addContact(ContactDto dto){
        TContactUs tContactUs = new TContactUs();
        tContactUs.setId(getConId());
        tContactUs.setContent(dto.getContent());
        tContactUs.setCreateTime(new Date());
        tContactUs.setEmail(dto.getEmail());
        tContactUs.setName(dto.getName());
        tContactUs.setTel(dto.getTel());
        tContactUsMapper.insert(tContactUs);
    }
}

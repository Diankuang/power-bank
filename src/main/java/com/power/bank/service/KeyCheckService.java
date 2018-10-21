package com.power.bank.service;

import com.power.bank.dao.TNewsMapper;
import com.power.bank.dao.TUserMapper;
import com.power.bank.dao.TWishListMapper;
import com.power.bank.entity.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeyCheckService {

    @Autowired
    TUserMapper tUserMapper;

    @Autowired
    TNewsMapper tNewsMapper;

    @Autowired
    TWishListMapper tWishListMapper;

    public boolean checkUserId(String userId){
        TUser tUser = new TUser();
        tUser.setUserId(userId);
        return tUserMapper.selectCount(tUser)>0;
    }
}

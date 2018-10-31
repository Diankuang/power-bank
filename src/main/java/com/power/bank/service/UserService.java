package com.power.bank.service;

import com.alibaba.fastjson.JSONObject;
import com.power.bank.dao.TEmailAddressMapper;
import com.power.bank.dao.TUserMapper;
import com.power.bank.dao.TWishListMapper;
import com.power.bank.dto.LoginDto;
import com.power.bank.dto.RegisterDto;
import com.power.bank.dto.WishListDto;
import com.power.bank.entity.TEmailAddress;
import com.power.bank.entity.TUser;
import com.power.bank.entity.TWishList;
import com.power.bank.utils.JsonResultHandler;
import com.power.bank.utils.ToolsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    TUserMapper tUserMapper;

    @Autowired
    TWishListMapper tWishListMapper;

    @Autowired
    TEmailAddressMapper tEmailAddressMapper;

    private String getUserId(){
        String uuid = ToolsUtil.getUUID();
        if(tUserMapper.existsWithPrimaryKey(uuid)){
            return getUserId();
        }else {
            return uuid;
        }
    }

    private String getEmailId(){
        String uuid = ToolsUtil.getUUID();
        if(tEmailAddressMapper.existsWithPrimaryKey(uuid)){
            return getEmailId();
        }else {
            return uuid;
        }

    }
    /**
     * 查看email是否已经注册
     * @param email
     * @return
     */
    public boolean checkEmalExistEmail(String email){
        Example example = new Example(TUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("email",email);
        return tUserMapper.selectCountByExample(example)>0;
    }

    /**
     * 用户注册
     * @param dto
     */
    public TUser userRegister(RegisterDto dto){
        String userId = getUserId();
        TUser tUser = new TUser();
        tUser.setUserId(userId);
        tUser.setEmail(dto.getEmail());
        tUser.setFirstName(dto.getFirstName());
        tUser.setLastName(dto.getLastName());
        tUser.setPassword(dto.getPassword());
        tUser.setUserClass(dto.getUserClass());
        tUser.setCreateTime(new Date());
        tUserMapper.insert(tUser);
        return tUser;
    }

    /**
     * 登录
     * @param dto
     * @return
     */
    public JSONObject userLogin(LoginDto dto){
        JSONObject jsonObject = new JSONObject();
        Example example = new Example(TUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("email",dto.getEmail());
        if(!(tUserMapper.selectCountByExample(example)>0)){
            return JsonResultHandler.handlerObject(jsonObject,"-1001","user not existed!");
        }
        criteria.andEqualTo("password",dto.getPassword());
        TUser tUser = tUserMapper.selectOneByExample(example);
        if(tUser == null){
            return JsonResultHandler.handlerObject(jsonObject,"-1001","password error!");
        }
        JsonResultHandler.handlerObject(jsonObject,"0","login successful!");
        jsonObject.put("user",tUser);
        return jsonObject;
    }

    public void addOrUpdateWishList(WishListDto dto){
        Example example = new Example(TWishList.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",dto.getUserId());
        criteria.andEqualTo("productId",dto.getProductId());
        TWishList tWishList = tWishListMapper.selectOneByExample(example);
        if(tWishList != null){
            tWishList.setStaus(dto.getFlag());
            tWishList.setUpdateTime(new Date());
            tWishListMapper.updateByPrimaryKey(tWishList);
        }else{
            TWishList newTWishList = new TWishList();
            newTWishList.setUserId(dto.getUserId());
            newTWishList.setProductId(dto.getProductId());
            newTWishList.setStaus(dto.getFlag());
            newTWishList.setCreateTime(new Date());
            tWishListMapper.insert(newTWishList);
        }
    }

    public void subscribeEmail(String email){
        TEmailAddress tEmailAddress = new TEmailAddress();
        tEmailAddress.setCreateTime(new Date());
        tEmailAddress.setId(getEmailId());
        tEmailAddress.setEmailAddress(email);
        tEmailAddressMapper.insert(tEmailAddress);
    }
}

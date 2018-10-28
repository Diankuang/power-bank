package com.power.bank.service;

import com.power.bank.dao.TTemperMapper;
import com.power.bank.dao.TTemperPictureMapper;
import com.power.bank.dto.PictureDto;
import com.power.bank.dto.QueryTemDto;
import com.power.bank.dto.TemperDto;
import com.power.bank.entity.TTemper;
import com.power.bank.entity.TTemperPicture;
import com.power.bank.utils.Page;
import com.power.bank.utils.ToolsUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TemperService {

    @Autowired
    TTemperMapper tTemperMapper;

    @Autowired
    TTemperPictureMapper tTemperPictureMapper;

    private String getTemId(){
        String uuid = ToolsUtil.getUUID();
        if(tTemperMapper.selectByPrimaryKey(uuid) != null){
            return getTemId();
        }else{
            return uuid;
        }
    }

    private String getTemPicId(){
        String uuid = ToolsUtil.getUUID();
        if(tTemperPictureMapper.selectByPrimaryKey(uuid)!=null){
            return getTemPicId();
        }else{
            return uuid;
        }
    }

    public void addTemper(TemperDto dto){
        TTemper tTemper = new TTemper();
        BeanUtils.copyProperties(dto,tTemper);
        tTemper.setId(getTemId());
        tTemper.setCreateTime(new Date());

        List<PictureDto> picture = dto.getPicture();
        if(picture!=null && picture.size()>0){
            for(PictureDto picDto : picture){
                TTemperPicture tTemperPicture = new TTemperPicture();
                tTemperPicture.setId(getTemPicId());
                tTemperPicture.setPicture(picDto.getPicture());
                tTemperPicture.setTemperId(tTemper.getId());
                tTemperPicture.setCreateTime(new Date());
                tTemperPicture.setOrderNo(picDto.getOrderNo());
                tTemperPictureMapper.insert(tTemperPicture);
            }
        }
        tTemperMapper.insert(tTemper);
    }

    public List<TTemper> queryTemperList(QueryTemDto dto){
        Map<String,Object> map = new HashMap<>();
        map.put("startRow",(dto.getPageNum()-1)*dto.getPageSize());
        map.put("endRow",dto.getPageNum()*dto.getPageSize());
        map.put("type",dto.getType());
        List<TTemper> list = tTemperMapper.queryTemperList(map);
        for (TTemper t : list){
            List<TTemperPicture> tTemperPictures = queryTemPicByTemperId(t.getId());
            if(tTemperPictures!=null && tTemperPictures.size()>0){
                TTemperPicture tTemperPicture = tTemperPictures.get(0);
                t.setPicture(tTemperPicture.getPicture());
            }
        }
        return list;
    }

    public TTemper queryTemByTemperId(String temperId){
        return tTemperMapper.selectByPrimaryKey(temperId);
    }

    public List<TTemperPicture> queryTemPicByTemperId(String temperId){
        Example example = new Example(TTemperPicture.class);
        example.createCriteria().andEqualTo("temperId",temperId);
        example.orderBy("orderNo").asc();
        return tTemperPictureMapper.selectByExample(example);
    }
}

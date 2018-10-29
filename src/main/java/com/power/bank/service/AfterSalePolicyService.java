package com.power.bank.service;

import com.power.bank.dao.TAfterSalePolicyDetailMapper;
import com.power.bank.dao.TAfterSalePolicyMapper;
import com.power.bank.dto.AfterSalePolicyDetailDto;
import com.power.bank.dto.AfterSalePolicyDto;
import com.power.bank.entity.TAfterSalePolicy;
import com.power.bank.entity.TAfterSalePolicyDetail;
import com.power.bank.utils.ToolsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service
public class AfterSalePolicyService {

    @Autowired
    TAfterSalePolicyMapper tAfterSalePolicyMapper;

    @Autowired
    TAfterSalePolicyDetailMapper tAfterSalePolicyDetailMapper;

    /**
     * 获取t_after_sale_policy主键
     * @return
     */
    private String getAspId(){
        String uuid = ToolsUtil.getUUID();
        if(tAfterSalePolicyMapper.existsWithPrimaryKey(uuid)){
            return getAspId();
        }else {
            return uuid;
        }
    }

    /**
     * 获取t_after_sale_policy_detail主键
     * @return
     */
    private String getAspdId(){
        String uuid = ToolsUtil.getUUID();
        if(tAfterSalePolicyDetailMapper.existsWithPrimaryKey(uuid)){
            return getAspdId();
        }else {
            return uuid;
        }
    }

    /**
     * 新增AfterSalePolicy
     * @param dto
     */
    public void addAfterSalePolicy(AfterSalePolicyDto dto){
        TAfterSalePolicy tAfterSalePolicy = new TAfterSalePolicy();
        tAfterSalePolicy.setId(getAspId());
        tAfterSalePolicy.setTitle(dto.getTitle());
        tAfterSalePolicy.setStatus(0);
        tAfterSalePolicy.setOrderNo(dto.getOrderNo());
        tAfterSalePolicy.setCreateTime(new Date());
        List<AfterSalePolicyDetailDto> content = dto.getContent();
        if(content != null && content.size()>0){
            for(AfterSalePolicyDetailDto aspd : content) {
                TAfterSalePolicyDetail t = new TAfterSalePolicyDetail();
                t.setAspId(tAfterSalePolicy.getId());
                t.setId(getAspdId());
                t.setContent(aspd.getContent());
                t.setStatus(0);
                t.setCreateTime(new Date());
                t.setOrderNo(aspd.getOrderNo());
                tAfterSalePolicyDetailMapper.insert(t);
            }
        }
        tAfterSalePolicyMapper.insert(tAfterSalePolicy);
    }

    public List<TAfterSalePolicy> queryAspList(){
        Example e = new Example(TAfterSalePolicy.class);
        e.orderBy("orderNo").asc();
        List<TAfterSalePolicy> tAfterSalePolicies = tAfterSalePolicyMapper.selectByExample(e);
        if(tAfterSalePolicies!=null && tAfterSalePolicies.size()>0){
            for(TAfterSalePolicy t : tAfterSalePolicies){
                Example example = new Example(TAfterSalePolicyDetail.class);
                example.createCriteria().andEqualTo("aspId",t.getId());
                example.orderBy("orderNo").asc();
                t.setDetail(tAfterSalePolicyDetailMapper.selectByExample(example));
            }
        }
        return tAfterSalePolicies;
    }
}

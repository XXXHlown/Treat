package com.max.bracelet.braceletapi.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.max.bracelet.braceletapi.demo.dao.AtreatservantDao;
import com.max.bracelet.braceletapi.demo.entity.Atreatservant;
import com.max.bracelet.braceletapi.demo.service.AtreatservantSer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AtreatservantSerImpl extends ServiceImpl<AtreatservantDao, Atreatservant> implements AtreatservantSer {

    //根据报销单编号查询报销单展示信息
    @Override
    public Map<String, String> getPersonInfo(String reId) {
        return baseMapper.getPerson(reId);
    }

    @Override
    public List<Map<String, Object>> queryByCodeType(String re_id) {
        return baseMapper.selectDetail(re_id);
    }

    @Override
    public int updateState(String price,String id, String approve_state, String option) {
        return baseMapper.updateState(Float.parseFloat(price),id, approve_state, option);
    }
}

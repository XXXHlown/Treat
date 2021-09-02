package com.max.bracelet.braceletapi.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.max.bracelet.braceletapi.demo.dao.AtreatmasterDao;
import com.max.bracelet.braceletapi.demo.entity.Atreatmaster;
import com.max.bracelet.braceletapi.demo.service.AtreatmasterSer;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class AtreatmasterSerImpl extends ServiceImpl<AtreatmasterDao, Atreatmaster> implements AtreatmasterSer {

    @Override
    public PageInfo<Map<String, Object>> queryPagerByPersonalState(String username, String approve_state, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> list = baseMapper.selectByPersonalState(username, approve_state);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Map<String, Object>> queryPagerBySecond(int pageNum,
                                                            int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> list = baseMapper.selectBySecond();
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Map<String, Object>> queryPagerByThird(int pageNum,
                                                           int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> list = baseMapper.selectByThird();
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Map<String, Object>> queryPagerBySecondNum(String sinum, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> list = baseMapper.selectBySecondNum(sinum);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Map<String, Object>> queryPagerByThirdNum(String sinum, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> list = baseMapper.selectByThirdNum(sinum);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }


    @Override
    public int updateState(String re_id, String approval_state, LocalDate ld) {
        return baseMapper.updateState(re_id, approval_state,ld);
    }

    @Override
    public int updatePrice(String pay_price, String tm_price, String re_id) {
        return baseMapper.updatePrice(Float.parseFloat(pay_price), Float.parseFloat(tm_price),re_id);
    }


}

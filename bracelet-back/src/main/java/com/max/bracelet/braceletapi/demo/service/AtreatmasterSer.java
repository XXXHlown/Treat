package com.max.bracelet.braceletapi.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.max.bracelet.braceletapi.demo.entity.Atreatmaster;

import java.time.LocalDate;
import java.util.Map;

public interface AtreatmasterSer extends IService<Atreatmaster> {

    public PageInfo<Map<String, Object>> queryPagerByPersonalState(String username,
                                                                   String approve_state,
                                                                   int pageNum,
                                                                   int pageSize);

    public PageInfo<Map<String, Object>> queryPagerBySecond(int pageNum,
                                                            int pageSize);

    public PageInfo<Map<String, Object>> queryPagerByThird(int pageNum,
                                                           int pageSize);

    public PageInfo<Map<String, Object>> queryPagerBySecondNum(String sinum,
                                                               int pageNum,
                                                               int pageSize);

    public PageInfo<Map<String, Object>> queryPagerByThirdNum(String sinum,
                                                              int pageNum,
                                                              int pageSize);


    public int updateState(String re_id, String approval_state, LocalDate ld);

    public int updatePrice(String pay_price,String tm_price,String re_id);

}

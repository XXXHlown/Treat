package com.max.bracelet.braceletapi.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.max.bracelet.braceletapi.demo.entity.Atreatservant;

import java.util.List;
import java.util.Map;

public interface AtreatservantSer extends IService<Atreatservant> {

    public Map<String, String> getPersonInfo(String tmId);

    public List<Map<String, Object>> queryByCodeType(String re_id);

    public int updateState(String price,String id, String approve_state, String option);
}

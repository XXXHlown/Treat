package com.max.bracelet.braceletapi.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.max.bracelet.braceletapi.demo.entity.Alogin;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author xxx
 * @since 2021-08-10
 */
public interface AloginSer extends IService<Alogin> {
    public Map<String, String> login(String userName, String password);

    //获取个人信息表
    public Map<String, String> getPerson(String userName);
}

package com.max.bracelet.braceletapi.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.max.bracelet.braceletapi.demo.entity.Alogin;
import com.max.bracelet.braceletapi.demo.dao.AloginDao;
import com.max.bracelet.braceletapi.demo.service.AloginSer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author xxx
 * @since 2021-08-10
 */
@Service
public class AloginSerImpl extends ServiceImpl<AloginDao, Alogin> implements AloginSer {
    @Override
    public Map<String, String> login(String userName, String password) {
        Map<String, String> map = new HashMap<>();
        int res = query().eq("username", userName).count();
        if (res == 0) {
            // 用户名不存在
            map.put("res", "-1");
            return map;
        }
        Alogin alogin = query().eq("username", userName)
                .one();
        if (password.equals(alogin.getUsername())) {
            // 登录成功
            map.put("res", "1");
            map.put("username", alogin.getUsername());
            return map;
        } else {
            // 登录不成功
            map.put("res", "-2");
            return map;
        }
    }

    //获取个人信息表
    @Override
    public Map<String, String> getPerson(String userName) {
        Map<String, String> map = new HashMap<>();
        Alogin alogin = query().eq("username", userName).one();

        map.put("p_id", alogin.getPId());
        map.put("username", alogin.getUsername());
        map.put("password", alogin.getPassword());
        map.put("sinum", alogin.getSinum());
        map.put("banknum", alogin.getBanknum());
        map.put("name", alogin.getName());
        map.put("medical_categor", alogin.getMedicalcategor());
        map.put("root_type", alogin.getRootType());
        map.put("gender", alogin.getGender());

        return map;
    }
}

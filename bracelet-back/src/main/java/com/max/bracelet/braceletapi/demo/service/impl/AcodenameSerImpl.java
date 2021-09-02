package com.max.bracelet.braceletapi.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.max.bracelet.braceletapi.demo.entity.Acodename;
import com.max.bracelet.braceletapi.demo.dao.AcodenameDao;
import com.max.bracelet.braceletapi.demo.service.AcodenameSer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author xxx
 * @since 2021-08-10
 */
@Service
public class AcodenameSerImpl extends ServiceImpl<AcodenameDao, Acodename> implements AcodenameSer {
    @Override
    public List<Acodename> queryByCodeType(String cgroup) {
        return query().eq("cgroup", cgroup).list();
    }
}

package com.max.bracelet.braceletapi.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.max.bracelet.braceletapi.demo.entity.Acodename;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author xxx
 * @since 2021-08-10
 */
public interface AcodenameSer extends IService<Acodename> {
    public List<Acodename> queryByCodeType(String cgroup);
}


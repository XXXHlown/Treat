package com.max.bracelet.braceletapi.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.max.bracelet.braceletapi.demo.dao.AmedicalDao;
import com.max.bracelet.braceletapi.demo.entity.Amedical;
import com.max.bracelet.braceletapi.demo.service.AmedicalSer;
import org.springframework.stereotype.Service;

@Service
public class AmedicalImpl extends ServiceImpl<AmedicalDao, Amedical> implements AmedicalSer {
}

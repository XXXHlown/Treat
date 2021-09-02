package com.max.bracelet.braceletapi.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class TestTreatService {
    @Autowired
    private AtreatmasterSer ser;

    @Autowired
    private AtreatservantSer service;


    @Test
    public void testDetail() {
        List<Map<String, Object>> list = service.queryByCodeType("121");
        System.out.println(list);
    }

    @Test
    public void testUpdateState() {
        LocalDate ld = LocalDate.now();
        int res = ser.updateState("3", "S01", ld);

    }

    //废弃的测试
//    @Test
//    public void testPage(){
//        PageInfo<Map<String, Object>> pageInfo = ser.queryPagerBySecond("1111",1,5);
//        System.out.println(pageInfo.toString());
//    }
}

package com.max.bracelet.braceletapi.demo.service;

import com.max.bracelet.braceletapi.demo.entity.Acodename;
import com.max.bracelet.braceletapi.demo.entity.Alogin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestAloginService {
    @Autowired
    private AloginSer service;

    @Autowired
    private AcodenameSer codeSer;

    @Test
    public void testLogin(){
        int res = service.query().eq("username","123456").count();
        System.out.println(res);
        if(res>0){
            Alogin alogin = service.query().eq("username","123456").one();
            System.out.println(alogin.getUsername());
            System.out.println(alogin.getPassword());
        }
    }
    @Test
    public void testCodename(){
        int res = codeSer.query().eq("group","1").count();
        System.out.println(res);
        if(res>0){
            Acodename acode = codeSer.query().eq("group","1").one();
            System.out.println(acode.getCkey());
        }
    }
}

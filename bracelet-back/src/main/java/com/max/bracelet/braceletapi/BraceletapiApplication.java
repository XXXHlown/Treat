package com.max.bracelet.braceletapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.max.bracelet.braceletapi.*.dao")
public class BraceletapiApplication {

	public static
	void main(String[] args) {
		SpringApplication.run(BraceletapiApplication.class, args);
	}

}

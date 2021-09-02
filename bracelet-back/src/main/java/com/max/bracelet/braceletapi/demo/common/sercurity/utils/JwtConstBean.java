package com.max.bracelet.braceletapi.demo.common.sercurity.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class JwtConstBean {
	@Value("${token.header}")
	private String tokenHeader;
	@Value("${token.prefix}")
	private String tokenPrefix;
    @Value("${token.secret}")
    private String secret;
    @Value("${token.iss}")
    private String iss;
    @Value("${token.roleClaims}")
    private String roleClaims;
    @Value("${token.expiration}")
    private long expiration;
}

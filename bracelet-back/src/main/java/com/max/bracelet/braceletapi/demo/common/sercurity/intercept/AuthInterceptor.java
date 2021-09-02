package com.max.bracelet.braceletapi.demo.common.sercurity.intercept;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.max.bracelet.braceletapi.demo.common.http.ResponseResult;
import com.max.bracelet.braceletapi.demo.common.http.StatusCode;
import com.max.bracelet.braceletapi.demo.common.sercurity.anno.AuthIgrone;
import com.max.bracelet.braceletapi.demo.common.sercurity.anno.Authent;
import com.max.bracelet.braceletapi.demo.common.sercurity.utils.HttpJwtTokenUtil;
import com.max.bracelet.braceletapi.demo.common.sercurity.utils.JwtConstBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import com.fasterxml.jackson.databind.ObjectMapper;


import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AuthInterceptor implements HandlerInterceptor {
	@Autowired
	private JwtConstBean jwtConfig;
	@Autowired
	private ObjectMapper omJson;
	@Autowired
	private HttpJwtTokenUtil jwtHttpUtil;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info(request.getRequestURI() + "is start");
		if (!(handler instanceof HandlerMethod)) {
			return true;
		}
		
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Annotation annoAuth = handlerMethod.getBean().getClass().getAnnotation(Authent.class);
        if(annoAuth == null) {
        	return true;
        }
        
        Annotation authIgrone =  handlerMethod.getMethodAnnotation(AuthIgrone.class);
        if(authIgrone != null) {
        	return true;
        }
        
        Map<String, String> userDetail = jwtHttpUtil.getUserNameByToken(request);
        if(userDetail == null) {
        	ResponseResult<Object> rrs = ResponseResult.getMessageResult(null,"E001", StatusCode.C401);
        	response.getWriter().write(omJson.writeValueAsString(rrs));
        	return false;
        }

        return true;
	}
}

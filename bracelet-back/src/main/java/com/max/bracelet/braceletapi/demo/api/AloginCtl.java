package com.max.bracelet.braceletapi.demo.api;


import com.max.bracelet.braceletapi.demo.common.http.ResponseResult;
import com.max.bracelet.braceletapi.demo.common.sercurity.utils.JwtTokenUtil;
import com.max.bracelet.braceletapi.demo.form.AloginForm;
import com.max.bracelet.braceletapi.demo.service.AloginSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author smallmax
 * @since 2021-08-13
 */
@CrossOrigin
@RestController
@RequestMapping("aproj/authentication")
public class AloginCtl {
    /**
     * 自动装配 Aloginin service
     */
    @Autowired
    private JwtTokenUtil jwtUtil;

    /**
     * 自动装配 Aloginin service
     */
    @Autowired
    private AloginSer ser;

    @PostMapping("/login")
    public ResponseResult<Map<String, String>> login(@RequestBody @Valid AloginForm form) {
        Map<String, String> map = ser.login(form.getUsername(), form.getPassword());
        if ("1".equals(map.get("res"))) {
            String token = jwtUtil.createToken(map.get("username"));
            Map<String, String> res = new HashMap<>();
            res.put("authtoken", token);
            res.put("username", map.get("username"));
            return ResponseResult.getSuccessResult(res);
        } else if ("-1".equals(map.get("res"))) {
            return ResponseResult.getMessageResult(null, "A001");
        } else {
            return ResponseResult.getMessageResult(null, "A002");
        }
    }

    @PostMapping("/getPersonInfo")
    public ResponseResult<Map<String, String>> getPersonInfo(@RequestBody @Valid AloginForm form) {
        Map<String, String> m = ser.getPerson(form.getUsername());

        return ResponseResult.getSuccessResult(m);
    }
}

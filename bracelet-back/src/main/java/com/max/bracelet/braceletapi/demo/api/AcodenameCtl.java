package com.max.bracelet.braceletapi.demo.api;

import com.max.bracelet.braceletapi.demo.common.http.ResponseResult;
import com.max.bracelet.braceletapi.demo.entity.Acodename;
import com.max.bracelet.braceletapi.demo.form.AcodenameForm;
import com.max.bracelet.braceletapi.demo.service.AcodenameSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author smallmax
 * @since 2021-08-13
 */
/**
 * <p>
 * Authent
 * </p>
 *
 * @author smallmax
 * @since 2021-08-13
 */
@CrossOrigin
@RestController
@RequestMapping("/aproj/acodename")
public class AcodenameCtl {

    /**
     * 自动装配 Acodename service
     */
    @Autowired
    private AcodenameSer ser;

    @PostMapping("/getcodelist")
    public ResponseResult<List<Acodename>> getCodeList(@RequestBody @Valid AcodenameForm form) {
        List<Acodename> list = ser.queryByCodeType(form.getCgroup());
        return ResponseResult.getSuccessResult(list);
    }
    @GetMapping
    public ResponseResult<String s>
}


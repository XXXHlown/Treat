package com.max.bracelet.braceletapi.demo.api;

import com.max.bracelet.braceletapi.demo.common.http.ResponseResult;
import com.max.bracelet.braceletapi.demo.form.AtopForm;
import com.max.bracelet.braceletapi.demo.form.AtreatservantForm;
import com.max.bracelet.braceletapi.demo.form.AtreatservantUpdateForm;
import com.max.bracelet.braceletapi.demo.service.AtreatservantSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xxx
 * @since 2021-08-10
 */
@CrossOrigin
@RestController
@RequestMapping("aproj/detail")
public class AtreatservantCtl {

    /**
     * 自动装配 Atreatservant service
     */
    @Autowired
    private AtreatservantSer service;

    /**
     * <p>
     *根据报销单编号查询报销单展示信息
     * @author jian
     * @since 2021-08-17
     * </p>
     */
    @PostMapping("/getPersonInfo")
    public ResponseResult<Map<String, String>> getPersonInfo(@RequestBody @Valid AtopForm form) {
        Map<String, String> m = service.getPersonInfo(form.getReId());

        return ResponseResult.getSuccessResult(m);
    }

    /**
     * <p>
     * 查询报销明细
     * @author jian
     * @since 2021-08-17
     * </p>
     */
    @PostMapping("/getlist")
    public ResponseResult<List<Map<String, Object>>> getList(@RequestBody @Valid AtreatservantForm form) {
        List<Map<String, Object>> list = service.queryByCodeType(form.getRe_id());
        return ResponseResult.getSuccessResult(list);
    }

    /**
     * <p>
     * 对明细进行审批
     * @author jian
     * @since 2021-08-17
     * </p>
     */
    @PostMapping("/updateState")
    public ResponseResult<Boolean> updateState(@RequestBody @Valid AtreatservantUpdateForm form) {
        int res = service.updateState(form.getPrice(), form.getId(), form.getApprove_state(), form.getOption());
        if (res > 0) {
            return ResponseResult.getSuccessResult(true, "A008", null);
        } else {
            return ResponseResult.getMessageResult(false, "A009");
        }
    }
}

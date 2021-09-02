package com.max.bracelet.braceletapi.demo.api;

import com.github.pagehelper.PageInfo;
import com.max.bracelet.braceletapi.demo.common.http.ResponseResult;
import com.max.bracelet.braceletapi.demo.form.*;
import com.max.bracelet.braceletapi.demo.service.AtreatmasterSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
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
@RequestMapping("aproj/treat")
public class AtreatmasterCtl {

    /**
     * 自动装配 Atreatmaster service
     */
    @Autowired
    private AtreatmasterSer service;

    /**
     * <p>
     * 个人页面根据审批状态查询报销单
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @PostMapping("/getpersonlist")
    public ResponseResult<PageInfo<Map<String, Object>>> getPersonalPagerList(@RequestBody @Valid AtreatmasterPersonalForm form) {
        PageInfo<Map<String, Object>> pager = service.queryPagerByPersonalState(form.getUsername(), form.getApproval_state(),
                form.getPageNum(), form.getPageSize());
        return ResponseResult.getSuccessResult(pager);
    }

    /**
     * <p>
     * 报销界面
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */

    /**
     * <p>
     * 分页查询提交未审批的所有报销单
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @PostMapping("/getsecondlist")
    public ResponseResult<PageInfo<Map<String, Object>>> getSecondPagerList(@RequestBody @Valid AtreatmasterForm form) {
        PageInfo<Map<String, Object>> pager = service.queryPagerBySecond(form.getPageNum(), form.getPageSize());
        return ResponseResult.getSuccessResult(pager);
    }

    /**
     * <p>
     * 审批界面
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */

    /**
     * <p>
     * 分页查询审批未报销的所有报销单
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @PostMapping("/getthirdlist")
    public ResponseResult<PageInfo<Map<String, Object>>> getThirdPagerList(@RequestBody @Valid AtreatmasterForm form) {
        PageInfo<Map<String, Object>> pager = service.queryPagerByThird(form.getPageNum(), form.getPageSize());
        return ResponseResult.getSuccessResult(pager);
    }

    /**
     * <p>
     * 审批界面
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */

    /**
     * <p>
     * 根据社保卡号分页查询提交未审批的报销单
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @PostMapping("/getsecondnumlist")
    public ResponseResult<PageInfo<Map<String, Object>>> getSecondNumPagerList(@RequestBody @Valid AtreatmasterSinumForm form) {
        PageInfo<Map<String, Object>> pager = service.queryPagerBySecondNum(form.getSinum(), form.getPageNum(), form.getPageSize());
        return ResponseResult.getSuccessResult(pager);
    }

    /**
     * <p>
     * 报销界面
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */

    /**
     * <p>
     * 根据社保卡号分页查询审批未报销的报销单
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @PostMapping("/getthirdnumlist")
    public ResponseResult<PageInfo<Map<String, Object>>> getThirdNumPagerList(@RequestBody @Valid AtreatmasterSinumForm form) {
        PageInfo<Map<String, Object>> pager = service.queryPagerByThirdNum(form.getSinum(), form.getPageNum(), form.getPageSize());
        return ResponseResult.getSuccessResult(pager);
    }

    /**
     * <p>
     * 主表审批状态进一步更新
     * </p>
     *
     * @author smallmax
     * @since 2021-08-13
     */
    @PostMapping("/updateState")
    public ResponseResult<Boolean> updateState(@RequestBody @Valid AtreatmasterUpdateForm form) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        int res = service.updateState(form.getRe_id(), form.getApproval_state(), ld);
        if (res > 0) {
            return ResponseResult.getSuccessResult(true, "A008", null);
        } else {
            return ResponseResult.getMessageResult(false, "A009");
        }
    }

    /**
     * 更新报销金额，实付金额
     * @author smallmax
     *  @since 2021-08-13
     */
    @PostMapping("/updatePrice")
    public ResponseResult<Boolean> updatePrice(@RequestBody @Valid AtreatmasterPriceForm form) {
        int res = service.updatePrice(form.getPay_price(), form.getTm_price(), form.getRe_id());
        if (res > 0) {
            return ResponseResult.getSuccessResult(true, "A008", null);
        } else {
            return ResponseResult.getMessageResult(false, "A009");
        }
    }
}

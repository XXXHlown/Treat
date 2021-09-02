package com.max.bracelet.braceletapi.demo.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class AtreatmasterPersonalForm {

    @NotNull
    private String username;

    @NotNull
    private String approval_state;

    @NotNull
    @Min(1)
    private Integer pageNum;

    @NotNull
    @Range(min = 5, max = 50)
    private Integer pageSize;
}
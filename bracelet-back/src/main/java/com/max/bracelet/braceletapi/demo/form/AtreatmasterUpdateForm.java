package com.max.bracelet.braceletapi.demo.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AtreatmasterUpdateForm {

    @NotNull
    private String re_id;

    @NotNull
    private String approval_state;
}

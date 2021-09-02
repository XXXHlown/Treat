package com.max.bracelet.braceletapi.demo.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AtreatservantUpdateForm {

    @NotNull
    private String price;

    @NotNull
    private String id;

    @NotNull
    private String approve_state;

    @NotNull
    private String option;
}

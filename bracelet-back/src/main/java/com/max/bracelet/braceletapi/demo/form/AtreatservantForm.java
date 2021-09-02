package com.max.bracelet.braceletapi.demo.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AtreatservantForm {

    @NotNull
    private String re_id;
}

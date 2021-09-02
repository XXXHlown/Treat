package com.max.bracelet.braceletapi.demo.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AcodenameForm {
    @NotEmpty
    private String cgroup;
}

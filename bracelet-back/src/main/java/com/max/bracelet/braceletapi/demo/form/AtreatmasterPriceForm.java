package com.max.bracelet.braceletapi.demo.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AtreatmasterPriceForm {

    @NotNull
    private String pay_price;

    @NotNull
    private String tm_price;

    @NotNull
    private String re_id;
}

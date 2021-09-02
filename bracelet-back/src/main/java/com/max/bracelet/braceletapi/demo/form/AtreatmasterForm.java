package com.max.bracelet.braceletapi.demo.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class AtreatmasterForm {

    private String re_id;
    @NotNull
    @Min(1)
    private Integer pageNum;
    
    @NotNull
    @Range(min = 5, max = 50)
    private Integer pageSize;
}


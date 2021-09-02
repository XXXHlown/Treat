package com.max.bracelet.braceletapi.demo.form;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
public class AloginForm {
    @NotBlank
    @Length(max = 20)
    private String username;

    @NotBlank
    @Length(max = 20)
    private String password;
}

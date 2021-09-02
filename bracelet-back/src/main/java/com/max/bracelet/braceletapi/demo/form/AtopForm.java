

package com.max.bracelet.braceletapi.demo.form;

        import lombok.Data;
        import org.hibernate.validator.constraints.Length;

        import javax.validation.constraints.NotBlank;

@Data
public class AtopForm {
    @NotBlank
    @Length(max = 40)
    private String reId;

}

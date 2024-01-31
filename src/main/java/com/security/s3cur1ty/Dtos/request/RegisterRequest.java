package com.security.s3cur1ty.Dtos.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    @NotBlank(message = "Full name shouldn't be blank")
    private String fullName;

    @NotBlank(message = "Password shouldn't be blank")
    private String password;

    @NotBlank(message = "Email Cannot Be blank")
    private String email;
}

package com.asiastar.bookleaf.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class UserRequest {
    @NotNull(message = "{username.is.null}")
    @NotBlank(message = "{username.is.blank}")
    private final String username;
    @NotNull(message = "{password.can.not.be.null}")
    @NotBlank(message = "{password.can.not.be.blank}")
    private final String password;

}

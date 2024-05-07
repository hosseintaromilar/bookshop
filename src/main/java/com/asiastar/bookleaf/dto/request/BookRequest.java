package com.asiastar.bookleaf.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookRequest {
    @NotBlank(message = "{book.is.blank")
    @NotNull(message = "{book.is.null")
    private final String name;

  
    @NotNull(message = "{price.is.null}")
    @Min(value = 0, message = "{price.min}")
    private final Long price;

}

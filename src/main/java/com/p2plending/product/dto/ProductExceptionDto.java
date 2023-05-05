package com.p2plending.product.dto;

import lombok.*;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
public class ProductExceptionDto {
    private final Integer status;
    private final String message;
    private final Throwable throwable;
}

package com.p2plending.product.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Data
@Builder
public class ProductCreateDto {

    @NotNull(message = "Invalid idBorrower: idBorrower is NULL")
    private Integer idBorrower;

    @NotNull(message = "Invalid productTitle: productTitle is NULL")
    private String productTitle;

    @NotNull(message = "Invalid interest: interest is NULL")
    private Integer interest;

    @NotNull(message = "Invalid loanAmount: loanAmount is NULL")
    private String loanAmount;

    private String remainingReqAmount;

    @NotNull(message = "Invalid loanDate: loanDate is NULL")
    private Date loanDate;

    @NotNull(message = "Invalid loanDueDate: loanDueDate is NULL")
    private Date loanDueDate;

    private Boolean status;

}

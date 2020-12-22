package com.starostka.bank.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDTO {
    private long id;
    private String accountNumber;
    private AccountTypeDTO accountTypeDTO;
}
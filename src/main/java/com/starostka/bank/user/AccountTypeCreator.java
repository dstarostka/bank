package com.starostka.bank.user;

class AccountTypeCreator {
    AccountType from(AccountTypeDTO accountTypeDTO) {
        return AccountType.builder()
                .id(accountTypeDTO.getId())
                .name(accountTypeDTO.getName())
                .build();
    }
}
package com.starostka.bank.user;

class AccountCreator {
    Account from(AccountDTO accountDTO) {
        return Account.builder()
                .accountNumber(accountDTO.getAccountNumber())
                .accountType(new AccountTypeCreator().from(accountDTO.getAccountTypeDTO()))
                .build();
    }
}

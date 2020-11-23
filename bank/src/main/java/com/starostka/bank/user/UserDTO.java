package com.starostka.bank.user;

import com.starostka.bank.model.Account;
import lombok.Builder;
import lombok.Getter;
import java.util.List;

@Builder
@Getter
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String pesel;
    private String postalCode;
    private String city;
    private String street;
    private String houseNumber;
    private String additionalInfo;
    private List<Account> accounts;
}
package com.starostka.bank.user;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class UserDTO {

    private long id;
    private String firstName;
    private String lastName;
    private String pesel;
    private String postalCode;
    private String city;
    private String street;
    private String houseNumber;
    private String additionalInfo;
    private List<AccountDTO> accounts;
}
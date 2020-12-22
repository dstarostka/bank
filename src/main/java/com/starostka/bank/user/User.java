package com.starostka.bank.user;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString(exclude = "accounts")
@EqualsAndHashCode(exclude = "accounts")
@Builder
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String pesel;
    private String postalCode;
    private String city;
    private String street;
    private String houseNumber;
    private String additionalInfo;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Account> accounts;

    UserDTO dto() {
        return UserDTO.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .pesel(pesel)
                .accounts(accounts.stream().map(account -> account.dto()).collect(Collectors.toList()))
                .postalCode(postalCode)
                .city(city)
                .street(street)
                .houseNumber(houseNumber)
                .additionalInfo(additionalInfo)
                .build();
    }
}
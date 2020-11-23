package com.starostka.bank.user;

import com.starostka.bank.model.Account;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    private long userId;

    private String firstName;
    private String lastName;
    private String pesel;
    private String postalCode;
    private String city;
    private String street;
    private String houseNumber;
    private String additionalInfo;

    //@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Account> accounts;

    UserDTO dto() {
        return UserDTO.builder()
                .id(userId)
                .firstName(firstName)
                .lastName(lastName)
                .pesel(pesel)
                .accounts(accounts)
                .postalCode(postalCode)
                .city(city)
                .street(street)
                .houseNumber(houseNumber)
                .additionalInfo(additionalInfo)
                .build();
    }

//    @OneToMany
//    private List<Transaction> transactions;
//
//    @OneToMany
//    private List<Recipient> recipients;
}
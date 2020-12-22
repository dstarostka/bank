package com.starostka.bank.user;

import lombok.Builder;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name = "account_type")
public class AccountType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne(mappedBy = "accountType")
    private Account account;

    AccountTypeDTO dto() {
        return AccountTypeDTO.builder()
                .id(id)
                .name(name)
                .build();
    }
}
package com.starostka.bank.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "account_type")
@RequiredArgsConstructor
public class AccountType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne(mappedBy = "accountType")
    private Account account;
}
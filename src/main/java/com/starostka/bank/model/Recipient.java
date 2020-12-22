//package com.starostka.bank.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Data
//@Entity
//@Table(name = "recipient")
//@NoArgsConstructor
//@AllArgsConstructor
//public class Recipient implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long recipientId;
//
//    private String name;
//    private String address;
//    private String accountNumber;
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    public Recipient(String name, String address, String accountNumber) {
//        this.name = name;
//        this.address = address;
//        this.accountNumber = accountNumber;
//    }
//}
//package com.starostka.bank.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.RequiredArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import javax.persistence.*;
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//@Data
//@Builder
//@Entity
//@Table(name = "transaction")
//@RequiredArgsConstructor
//@AllArgsConstructor
//public class Transaction implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    private String title;
//    private BigDecimal transactionAmount;
//    private LocalDateTime transactionDate;
//
//    @CreationTimestamp
//    private LocalDateTime postingDate;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "account_type_id")
//    private AccountType accountType;
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "recipient_id")
//    private User recipient;
//}
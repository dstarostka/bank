package com.starostka.bank.configuration;

import com.starostka.bank.model.*;
import com.starostka.bank.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class DatabaseSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final AccountTypeRepository accountTypeRepository;
    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;
    private final RecipientRepository recipientRepository;

    @Override
    public void run(String... args) throws Exception {


        Recipient recipient1 = new Recipient("Elliot Alderson", "Aleja 29 Listopada 256B/72 30154 Krakow", "823747283");
        Recipient recipient2 = new Recipient("Angela Moss", "Pokatna 25 60-008 Poznan", "82237238231");
        Recipient recipient3 = new Recipient("Tyrell Wellick", "Jima Morrisa 17/20 00-210 Warsaw", "62837248234");
        Recipient recipient4 = new Recipient("Angela Moss", "Pokatna 25 60-008 Poznan", "82237238231");
        //this.recipientRepository.saveAll(Arrays.asList(recipient1, recipient2, recipient3, recipient4));
//ctrl + w
        User user1 = User.builder()
                .accounts(Collections.emptyList())
                .address(Address.builder()
                        .country("Poland")
                        .city("Rzeszow")
                        .postalCode("37234")
                        .street("Poblazliwa")
                        .houseNumber("210")
                        .build())
                .firstName("Darlene")
                .lastName("Alderson")
                .pesel("96071432522")
                //.recipients(Arrays.asList(recipient1, recipient2))
                .build();
        User user2 = User.builder()
                .accounts(Collections.emptyList())
                .address(Address.builder()
                        .country("Poland")
                        .city("Krakow")
                        .postalCode("30154")
                        .street("Aleja 29 Listopada")
                        .houseNumber("256B/72")
                        .build())
                .firstName("Elliot")
                .lastName("Alderson")
                .pesel("94121282732")
                //.recipients(Arrays.asList(recipient2, recipient3))
                .build();
        List<User> users = this.userRepository.saveAll(Arrays.asList(user1, user2));
        List<AccountType> all = accountTypeRepository.findAll();
        AccountType at = accountTypeRepository.getById(1L);

        Account account1 = new Account("823747283", at, userRepository.getOne(1L));
//        Account account2 = new Account("622714723", accountTypeRepository.getOne(1L));
        this.accountRepository.save(account1);


        //account1.setUser(userRepository.getOne(1L));
        //this.accountRepository.save(account1);



    /*
        Transaction t = Transaction.builder()
                .accountType(accountTypeRepository.getById(1))
                .title("title")
                .transactionAmount(BigDecimal.valueOf(999.55))
                .transactionDate(LocalDateTime.now())
                .user(userRepository.findById(1))
                .recipient(userRepository.findById(2))
                .build();

        this.transactionRepository.save(t);
*/
    }
}
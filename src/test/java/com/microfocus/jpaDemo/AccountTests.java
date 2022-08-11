package com.microfocus.jpaDemo;

import com.microfocus.jpaDemo.dao.AccountRepository;
import com.microfocus.jpaDemo.domain.Account;
import com.microfocus.jpaDemo.domain.AccountDetails;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountTests {
    @Autowired
    AccountRepository repository;

    @Test
    void testQuery() {
        Account account = new Account();
        account.setUsername("aa1");
        account.setPassword("1234");

        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setAddress("shanghai");
        accountDetails.setEmail("1212@qq.com");
        accountDetails.setPhone("12345465");
        accountDetails.setRealName("real name1");
        account.setDetails(accountDetails);
        Account save = repository.save(account);
        System.out.println("插入之后account id 为:"+save.getId()+"|||accountDetails id:"+accountDetails.getId());
    }

    //delete account,check the account details,two recodes will deleted all.
    @Test
    void testDeleteAccount() {
        repository.deleteById(1);
    }


}

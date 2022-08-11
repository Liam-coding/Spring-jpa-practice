package com.microfocus.jpaDemo;

import com.microfocus.jpaDemo.dao.AuthorityRepository;
import com.microfocus.jpaDemo.dao.UsersRepository;
import com.microfocus.jpaDemo.domain.Authority;
import com.microfocus.jpaDemo.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class authorityTests {
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    AuthorityRepository authorityRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testQuery() {
        Authority authority = new Authority();
        authority.setId(1);
        authority.setName("ROLE_ADMIN");
        authorityRepository.save(authority);
    }

    @Test
    public void addUsers() {
        Users users = new Users();
        users.setUsername("users1111");
        users.setPassword("123455");
        Authority authority = authorityRepository.findById(1).get();
        users.setAuthorityList(Arrays.asList(authority));
        usersRepository.save(users);
    }

}

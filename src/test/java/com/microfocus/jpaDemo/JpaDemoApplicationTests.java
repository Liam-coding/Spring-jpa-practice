package com.microfocus.jpaDemo;

import com.microfocus.jpaDemo.dao.UserRepository;
import com.microfocus.jpaDemo.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootTest
class JpaDemoApplicationTests {
    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testQuery() {
        userRepository.findById(1).ifPresent(System.out::println);
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("xiaowang1111");
        user.setPassword("12131321");
        User save = userRepository.save(user);
        System.out.println(save);
    }

    @Test
    public void testDeleteUser() {
        userRepository.deleteById(2);
    }

    @Test
    public void testPageable() {
        int size = 2;
        for (int i = 0; i < userRepository.count() / size; i = i + size) {
            System.out.println("这是第" + (i + 1) + "页内容:" + userRepository.findAll(PageRequest.of(0, 2)).toString());
        }
    }

    @Test
    public void testFindUserByUsername() {
        List<User> xiaowang = userRepository.findAllByUsername("xiaowang");
        for (User user : xiaowang) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindUserByUsernameAndPassword() {
        List<User> xiaowang = userRepository.findByUsernameAndPassword("xiaowang", "12131321");
        for (User user : xiaowang) {
            System.out.println(user);
        }
    }


    @Test
    public void testFindByUsernameLike() {
        List<User> users = userRepository.findByUsernameLike("xiaowang%");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFind4() {
        List<Integer> users = userRepository.findAllUser();
        for (Integer user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFind5() {
        List<User> users = userRepository.findUserByPassword();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFind6() {
        Integer users = userRepository.findCount();
        System.out.println(users);
    }

    @Test
    public void testFind7() {
        int lines = userRepository.updateUsernameById("China is best", 4);
        System.out.println(lines);
    }

    //origin SQL
    @Test
    public void testFind8() {
        int lines = userRepository.updateUsernameById2("China is best", 4);
        System.out.println(lines);
    }


}

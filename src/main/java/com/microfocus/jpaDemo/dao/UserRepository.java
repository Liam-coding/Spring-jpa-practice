package com.microfocus.jpaDemo.dao;

import com.microfocus.jpaDemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Liam
 * @Date: 8/10/2022 5:16 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByUsername(String username);

    List<User> findByUsernameAndPassword(String username,String password);

    List<User> findByUsernameLike(String username);
}

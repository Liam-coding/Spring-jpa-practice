package com.microfocus.jpaDemo.dao;

import com.microfocus.jpaDemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author: Liam
 * @Date: 8/10/2022 5:16 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByUsername(String username);

    List<User> findByUsernameAndPassword(String username, String password);

    List<User> findByUsernameLike(String username);

    //User大写,指的是User.class
    @Query("select u.id from User u")
    List<Integer> findAllUser();

    //User大写,指的是User.class
    @Query("select u from User u where u.password = 'aaa'")
    List<User> findUserByPassword();


    @Query("select u.id,u.username from User u")
    List<Object> findAllUser2();

    @Query("select count(u) from User u")
    Integer findCount();

    @Modifying
    @Transactional
    @Query("update User set username=?1 where id = ?2")
    int updateUsernameById(String username, Integer id);

    @Modifying
    @Transactional
    @Query(value = "update user u set u.username=555555 where id = 5",nativeQuery = true)
    int updateUsernameById2(String username, Integer id);

}

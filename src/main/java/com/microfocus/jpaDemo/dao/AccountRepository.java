package com.microfocus.jpaDemo.dao;

import com.microfocus.jpaDemo.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Liam
 * @Date: 8/10/2022 5:16 PM
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {


}

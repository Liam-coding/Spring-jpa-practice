package com.microfocus.jpaDemo.dao;

import com.microfocus.jpaDemo.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Liam
 * @Date: 8/11/2022 2:06 PM
 */
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}

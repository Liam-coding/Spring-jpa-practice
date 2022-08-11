package com.microfocus.jpaDemo.dao;

import com.microfocus.jpaDemo.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Liam
 * @Date: 8/11/2022 12:06 PM
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
}

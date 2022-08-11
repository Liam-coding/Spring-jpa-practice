package com.microfocus.jpaDemo;

import com.microfocus.jpaDemo.dao.ArticleRepository;
import com.microfocus.jpaDemo.dao.AuthorRepository;
import com.microfocus.jpaDemo.domain.Article;
import com.microfocus.jpaDemo.domain.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Liam
 * @Date: 8/11/2022 12:02 PM
 */
@SpringBootTest
public class ArticleTest {
    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    AuthorRepository authorRepository;

    @Test
    void onlyTest() {
        Author author = new Author();
        author.setName("lu xun");
        Author author1 = authorRepository.save(author);

        List<Article> articleList = new ArrayList<>();
        Article article1 = new Article("crazy diary", "this is a old story", author1);
        Article article2 = new Article("bai cao yuan", "this is a old story2", author1);
        Article article3 = new Article("MISS Q", "this is a old story3", author1);
        articleList.add(article1);
        articleList.add(article2);
        articleList.add(article3);
        articleList.forEach(item -> articleRepository.save(item));
    }

    @Test
    void deleteest() {
        articleRepository.deleteById(2L);
    }

    @Test
    void queryTsest() {
        authorRepository.findById(1L).ifPresent(System.out::println);
    }


}

package com.microfocus.jpaDemo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @Author: Liam
 * @Date: 8/11/2022 11:50 AM
 */
@Entity
@Data
@Table(name = "author")
public class Author {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @Column(name = "name", nullable = false, length = 20)
    String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Article> articleList;
}

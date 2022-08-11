package com.microfocus.jpaDemo.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @Author: Liam
 * @Date: 8/11/2022 11:53 AM
 */
@Entity
@Data
@ToString(exclude = {"author"})
@Table(name = "article")
public class Article {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Lob//大对象,映射MySQL的long text类型
    @Basic(fetch = FetchType.LAZY)
    @Column(nullable = false)
    private String content;

    //optional = false表示article删除了,与之对应的author不应该被删除
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "author_id")
    private Author author;

    public Article(String title, String content, Author author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Article() {
    }
}

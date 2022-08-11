package com.microfocus.jpaDemo.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: Liam
 * @Date: 8/11/2022 11:01 AM
 */
@Data
@Entity
@Table(name = "account")
public class Account {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    int id;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @JoinColumn(name = "details_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    AccountDetails details;
}

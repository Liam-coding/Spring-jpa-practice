package com.microfocus.jpaDemo.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: Liam
 * @Date: 8/11/2022 11:04 AM
 */
@Data
@Entity
@Table(name = "account_details")
public class AccountDetails {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    int id;
    @Column(name = "address")
    String address;
    @Column(name = "email")
    String email;
    @Column(name = "phone")
    String phone;
    @Column(name = "real_name")
    String realName;
}

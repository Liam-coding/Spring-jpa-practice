package com.microfocus.jpaDemo.domain;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

/**
 * @Author: Liam
 * @Date: 8/10/2022 2:49 PM
 */
@Data
@Entity //这是实体类
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

}

package com.microfocus.jpaDemo.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @Author: Liam
 * @Date: 8/11/2022 1:52 PM
 */
@Data
@Entity
@Table(name = "authority")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;//权限名

    @ManyToMany(mappedBy = "authorityList")
    private List<Users> usersList;
}

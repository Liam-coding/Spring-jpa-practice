package com.microfocus.jpaDemo.domain;

        import lombok.Data;

        import javax.persistence.*;
        import java.util.List;

/**
 * @Author: Liam
 * @Date: 8/11/2022 1:46 PM
 */
@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;


    //1.关系维护端,负责多对多关系的绑定和解除
    //@JoinTable注解的name属性指定关联表的名字    @JoinColumns指定外键的名字,关联到关系维护端(User)
    @ManyToMany
    @JoinTable(name = "user_authority", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id"))
    private List<Authority> authorityList;
}

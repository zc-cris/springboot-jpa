package com.cris.springboot.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
@Entity     //使用jpa 规范指明这是一个和数据表对应的实体类
@Table(name = "tb_user")    // 根据实体类对应的具体的数据表
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
    private Integer id;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(name = "email", length = 50)
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

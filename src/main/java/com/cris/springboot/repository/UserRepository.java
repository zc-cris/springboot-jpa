package com.cris.springboot.repository;

import com.cris.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
// 继承JpaRepository 来完成对数据库的操作
public interface UserRepository extends JpaRepository<User, Integer> {
}

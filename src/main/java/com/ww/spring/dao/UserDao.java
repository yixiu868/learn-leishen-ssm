package com.ww.spring.dao;

import com.ww.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;

/**
 * @author xiaohua
 * @date 2020-10-28 7:30
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(User user) {
        String sql = "insert into user(user_name, password, create_user, create_time, update_time) values (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, user.getUser_name(), user.getPassword(), user.getCreate_user(), new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()));
    }
}

package com.ww.spring.entity;

import java.util.Date;

/**
 * @author xiaohua
 * @date 2020-10-28 7:28
 */
public class User {

    private Integer user_id;

    private String user_name;

    private String password;

    private String create_user;

    private Date create_time;

    private Date update_time;

    public User() {
    }

    public User(String user_name, String password, String create_user, Date create_time, Date update_time) {
        this.user_name = user_name;
        this.password = password;
        this.create_user = create_user;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", create_user='" + create_user + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}

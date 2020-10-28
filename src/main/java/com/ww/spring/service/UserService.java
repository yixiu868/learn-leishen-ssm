package com.ww.spring.service;

import com.ww.spring.entity.User;

import java.util.List;

public interface UserService {

    int add(User user);

    int batchInsert(List<User> list);

    int batchInsert2(List<User> list);
}

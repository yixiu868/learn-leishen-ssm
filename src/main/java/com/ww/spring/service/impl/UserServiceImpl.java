package com.ww.spring.service.impl;

import com.ww.spring.dao.UserDao;
import com.ww.spring.entity.User;
import com.ww.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xiaohua
 * @date 2020-10-28 7:36
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int add(User user) {
        return userDao.insert(user);
    }

    @Override
    public int batchInsert(List<User> list) {
        for (int i = 0; i < list.size(); i++) {
            userDao.insert(list.get(i));
            System.out.println(list.get(i).getUser_name() + "已插入.");

            if (3 == i) {
                int abc = 1 / 0;
            }
        }

        return list.size();
    }

    @Transactional(rollbackFor = { Throwable.class, Exception.class })
    @Override
    public int batchInsert2(List<User> list) {
        for (int i = 0; i < list.size(); i++) {
            userDao.insert(list.get(i));
            System.out.println(list.get(i).getUser_name() + "已插入.");

            if (3 == i) {
                int abc = 1 / 0;
            }
        }

        return list.size();
    }
}

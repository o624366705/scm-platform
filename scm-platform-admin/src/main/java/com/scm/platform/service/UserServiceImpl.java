package com.scm.platform.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.scm.platform.dao.UserMapper;
import com.scm.platform.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dingc
 * @date 2017/9/11.
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll() {
        return this.userMapper.selectAll();
    }
}

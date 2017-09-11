package com.scm.platform.service;

import com.baomidou.mybatisplus.service.IService;
import com.scm.platform.dao.UserMapper;
import com.scm.platform.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author dingc
 * @date 2017/9/11.
 */
public interface UserService extends IService<User> {


    List<User> selectAll();
}

package com.scm.platform.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.scm.platform.entity.User;

import java.util.List;

/**
 * @author dingc
 * @date 2017/9/11.
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> selectAll();

}

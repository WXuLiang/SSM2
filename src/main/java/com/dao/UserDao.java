package com.dao;

import com.entities.UserBean;

import java.util.List;

/**
 * @author Created  by wxl on 2018/1/24 0024.
 */
public interface UserDao {
    /**
     * 查询所有用户信息
     * @return
     */
    List<UserBean> findUserBeans();
}

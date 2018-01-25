package com.service;

import com.dao.UserDao;
import com.entities.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Created  by wxl on 2018/1/23 0023.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void findUserBeans(){
        List<UserBean> userBeans = userDao.findUserBeans();
        for(UserBean userBean:userBeans){
            System.out.println(userBean);
        }
    }

}

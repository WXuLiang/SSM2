package com.service;

import com.service.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Created  by wxl on 2018/1/24 0024.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-core.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findUserBeans() throws Exception {
        userService.findUserBeans();
    }

}
package com.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    /**
     * 记录日志信息
     */
    private Logger logger = LogManager.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void findUserBeans() throws Exception {

        logger.info("log日志记录------->>  打印输出所有用户信息");

        userService.findUserBeans();

    }

}
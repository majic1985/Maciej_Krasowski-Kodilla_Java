package com.kodilla.spring;

import com.kodilla.spring.forum.ForumUser;
import com.kodilla.spring.forum.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    public ForumUserTestSuite() {
    }

    @Test
    public void testGetUserName() {
        ApplicationContext context = new AnnotationConfigApplicationContext(new String[]{"com.kodilla.spring.forum"});
        User forumUser = (User)context.getBean(ForumUser.class);
        String userName = forumUser.getUserName();
        Assert.assertEquals("John Smith", userName);
    }
}

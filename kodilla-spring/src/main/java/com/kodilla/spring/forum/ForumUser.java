package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements User {
    String userName = "John Smith";

    public ForumUser() {
    }

    public String getUserName() {
        return this.userName;
    }
}

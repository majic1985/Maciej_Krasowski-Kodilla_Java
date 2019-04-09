package com.kodilla.stream.portfolio;

public final class User {
    private final String username;
    private final String realName;

    public User(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return this.username;
    }

    public String getRealName() {
        return this.realName;
    }

    public String toString() {
        return "User{username='" + this.username + '\'' + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof User)) {
            return false;
        } else {
            User user = (User)o;
            return this.username.equals(user.username);
        }
    }
}


package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate userDOB;
    private final int userPostCount;

    public ForumUser(int userID, String userName, char userSex, LocalDate userDOB, int userPostCount) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userDOB = userDOB;
        this.userPostCount = userPostCount;
    }

    public int getUserID() {
        return this.userID;
    }

    public String getUserName() {
        return this.userName;
    }

    public char getUserSex() {
        return this.userSex;
    }

    public LocalDate getUserDOB() {
        return this.userDOB;
    }

    public int getUserPostCount() {
        return this.userPostCount;
    }

    public String toString() {
        int age = Period.between(this.userDOB, LocalDate.now()).getYears();
        return "forumUser{userID=" + this.userID + ", userName='" + this.userName + '\'' + ", userSex=" + this.userSex + ", userDOB=" + this.userDOB + ", userPostCount=" + this.userPostCount + ", userAge=" + age + '}';
    }
}

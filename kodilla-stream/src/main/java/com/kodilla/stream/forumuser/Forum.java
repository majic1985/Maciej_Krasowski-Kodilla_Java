package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public  final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        this.userList.add(new ForumUser(1, "Jan Wieczorek", 'M', LocalDate.of(2009, 12, 31), 5));
        this.userList.add(new ForumUser(2, "Allen Murphy", 'M', LocalDate.of(2005, 10, 1), 2));
        this.userList.add(new ForumUser(3, "Jan Kowalski", 'M', LocalDate.of(1989, 2, 3), 25));
        this.userList.add(new ForumUser(4, "Allen Marakira", 'M', LocalDate.of(1955, 10, 1), 1));
        this.userList.add(new ForumUser(5, "John Kiczorek", 'M', LocalDate.of(2009, 12, 31), 5));
        this.userList.add(new ForumUser(6, "Al Moskitiera", 'F', LocalDate.of(2005, 10, 1), 2));
        this.userList.add(new ForumUser(7, "Monika Nowak", 'F', LocalDate.of(1987, 2, 3), 255));
        this.userList.add(new ForumUser(8, "Magdalena Marakira", 'F', LocalDate.of(1965, 10, 1), 0));
        this.userList.add(new ForumUser(9, "John Kiczorek", 'M', LocalDate.of(2009, 12, 31), 5));
        this.userList.add(new ForumUser(10, "Marek Wiczorek", 'M', LocalDate.of(2007, 10, 19), 5));
        this.userList.add(new ForumUser(11, "Janek Kojot", 'M', LocalDate.of(2007, 10, 20), 5));
        this.userList.add(new ForumUser(11, "Janek Kojot", 'M', LocalDate.of(2007, 10, 21), 5));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(this.userList);
    }
}

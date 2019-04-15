package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public StreamMain() {
    }

    public static void main(String[] args) {
        System.out.println("M 7.3");
        Forum forumDirectory = new Forum();
        Map<Integer, ForumUser> theResultMapOfForum = new HashMap<Integer, ForumUser>(forumDirectory.getList().stream().filter(( user) -> {
                  return Period.between(user.getUserDOB(), LocalDate.now()).getYears() >= 20;
        })
                .filter((user) -> {
                 return user.getUserPostCount() >= 1;
        })
                .filter((user) -> {
                 return user.getUserSex() == 'M';
        })
                .collect(Collectors.toMap(ForumUser::getUserID, (forumUser) -> {
                 return forumUser;
        })));
        System.out.println("# elements: " + theResultMapOfForum.size());
        System.out.println(theResultMapOfForum.get(user) + ": " + theResultMapOfForum.getValue());

    }
}











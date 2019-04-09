package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public StreamMain() {
    }

    public static void main(String[] args) {
        System.out.println("M 7.3");
        Forum forumDirectory = new Forum();
        Map<Integer, ForumUser> theResultMapOfForum = (Map)forumDirectory.getList().stream().filter(( user) -> {
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
        }));
        System.out.println("# elements: " + theResultMapOfForum.size());
        Stream var10000 = theResultMapOfForum.entrySet().stream().map(( user) -> {
            return user.getKey() + ": " + user.getValue();
        });
        PrintStream var10001 = System.out;
        var10000.forEach(var10001::println);
    }
}









package com.kodilla.patterns.singleton;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class LoggerTestSuite {
    public LoggerTestSuite() {
    }

    @Test
    public void getLastLogTest() {
        Logger.getInstance().log(LocalDateTime.now().toString() + " The first log");
        Logger.getInstance().log(LocalDateTime.now().toString() + " The second log");
        Logger.getInstance().log(LocalDateTime.now().toString() + " The last log");
        String lastLog = Logger.getInstance().getLastLog();
        Assert.assertThat(lastLog, CoreMatchers.containsString("The last log"));
    }
}

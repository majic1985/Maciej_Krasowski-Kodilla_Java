package com.kodilla.stream.invoice.simple.portfolio;

import com.kodilla.stream.portfolio.Board;
import com.kodilla.stream.portfolio.Task;
import com.kodilla.stream.portfolio.TaskList;
import com.kodilla.stream.portfolio.User;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class BoardTestSuite {
    public BoardTestSuite() {
    }

    public Board prepareTestData() {
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");
        Task task1 = new Task("Microservice for taking temperature", "Write and test the microservice taking\nthe temperaure from external service", user1, user2, LocalDate.now().minusDays(20L), LocalDate.now().plusDays(30L));
        Task task2 = new Task("HQLs for analysis", "Prepare some HQL queries for analysis", user1, user2, LocalDate.now().minusDays(20L), LocalDate.now().minusDays(5L));
        Task task3 = new Task("Temperatures entity", "Prepare entity for temperatures", user3, user2, LocalDate.now().minusDays(20L), LocalDate.now().plusDays(15L));
        Task task4 = new Task("Own logger", "Refactor company logger to meet our needs", user3, user2, LocalDate.now().minusDays(10L), LocalDate.now().plusDays(25L));
        Task task5 = new Task("Optimize searching", "Archive data searching has to be optimized", user4, user2, LocalDate.now(), LocalDate.now().plusDays(5L));
        Task task6 = new Task("Use Streams", "use Streams rather than for-loops in predictions", user4, user2, LocalDate.now().minusDays(15L), LocalDate.now().minusDays(2L));
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }

    @Test
    public void testAddTaskList() {
        Board project = this.prepareTestData();
        Assert.assertEquals(3L, (long)project.getTaskLists().size());
    }

    @Test
    public void testAddTaskListFindUsersTasks() {
        Board project = this.prepareTestData();
        User user = new User("developer1", "John Smith");
        List<Task> tasks = (List)project.getTaskLists().stream().flatMap((l) -> {
            return l.getTasks().stream();
        }).filter((t) -> {
            return t.getAssignedUser().equals(user);
        }).collect(toList());
        Assert.assertEquals(2L, (long)tasks.size());
        Assert.assertEquals(user, ((Task)tasks.get(0)).getAssignedUser());
        Assert.assertEquals(user, ((Task)tasks.get(1)).getAssignedUser());
    }

    @Test
    public void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());

        //Then
        Assert.assertEquals(1, tasks.size());
        Assert.assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }

    @Test
    public void testAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(t -> t.getCreated())
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();

        //Then
        Assert.assertEquals(2, longTasks);
    }
    @Test
    public void testAddTaskListAverageWorkingOnTask() {
        //Given
        Board project = prepareTestData();
        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));

                double tasksAverage =  project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(t -> t.getCreated())
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();
            Collectors.summingDouble;
        //Then
        Assert.assertEquals(15.0D, tasksAverage, 0.01D);
    }
}

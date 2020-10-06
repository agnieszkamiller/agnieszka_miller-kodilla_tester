package com.kodilla.stream.homework;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TaskManagerTestSuite{

    @Test
    public void testGetDeadlinesOfIncompleteTasks() {
        //given
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("spacer z psem", LocalDate.of(2020, 1,18),
                LocalDate.now().plusDays(3)));
        tasks.add(new Task("kino z dzieckiem", LocalDate.of(2020,3,8),
                LocalDate.now().minusDays(15)));
        tasks.add(new Task("praca online", LocalDate.of(2020,4,10),
                LocalDate.now().plusMonths(2)));
        TaskManager taskManager = new TaskManager();
        //when
        List<LocalDate> result = taskManager.getDeadlinesOfIncompleteTasks(tasks);
        //than
        assertEquals(2,result.size());
    }

    @Test
    public void shouldMainBeRun() {
        String[] args = null;
        TaskManager.main(args);
    }
}
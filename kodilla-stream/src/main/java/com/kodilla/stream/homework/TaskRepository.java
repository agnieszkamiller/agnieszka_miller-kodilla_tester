package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("spacer z psem", LocalDate.of(2020, 1,18),
                LocalDate.of(2020,7,29)));
        tasks.add(new Task("kino z dzieckiem", LocalDate.of(2020,3,8),
                LocalDate.of(2020,5,30)));
        tasks.add(new Task("praca online", LocalDate.of(2020,4,10),
                LocalDate.of(2020,7,31)));

        return tasks;
    }
}

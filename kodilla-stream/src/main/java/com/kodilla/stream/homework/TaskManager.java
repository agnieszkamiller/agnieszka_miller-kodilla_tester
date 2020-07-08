package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<Task> tasks = TaskRepository.getTasks();
        for (Task task : tasks) {
            System.out.println(task);
        }
        TaskManager taskManager = new TaskManager();

        List<LocalDate> results = taskManager.getDeadlinesOfIncompleteTasks(TaskRepository.getTasks());
        System.out.println(results);
    }
    public List<LocalDate> getDeadlinesOfIncompleteTasks(List<Task> tasks){
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> dates = tasks
                .stream()
                .filter(task -> task.getDeadline().isAfter(currentDate))
                .map(task -> task.getDeadline())
                .collect(Collectors.toList());
        return dates;
    }

}

//        tasks
//                .stream()
//                .filter(date -> date.deadline.LocalDate.of(2020,6,13))







//        List<Integer> liczby = List.of(1, 15, 114, 21, 500, 4);
//
//        List<Integer> liczbyDuze = liczby
//                .stream()
//                .filter(n -> n >= 114)
//                .collect(Collectors.toList());
//        System.out.println(liczbyDuze);
//
//        long suma = liczby
//                .stream()
//                .filter(n -> n >= 15)
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(suma);

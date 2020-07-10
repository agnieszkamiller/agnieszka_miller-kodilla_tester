package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Leon", new Teacher("Janina")));
        studentList.add(new Student("Karolina",null));
        studentList.add(new Student("Kaja", new Teacher("Antoni")));
        studentList.add(new Student("Piotr", new Teacher("Krystyna")));
        studentList.add(new Student("Marta", new Teacher("Ryszard")));
        studentList.add(new Student("Robert", null));


        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

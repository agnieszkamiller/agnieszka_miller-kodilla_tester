package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    private String validatingIfNull() {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
        return optionalTeacher.orElse(new Teacher("<undefined>")).getName();
    }

    @Override
    public String toString() {
        String teacher = validatingIfNull();

        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }

}

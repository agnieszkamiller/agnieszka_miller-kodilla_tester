package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> principalSchoolMap = new HashMap<>();
        Principal principal1 = new Principal("Adam", "Kowalski");
        Principal principal2 = new Principal("Ewa", "Nowak");
        Principal principal3 = new Principal("Piotr", "Dalicki");

        School school1 = new School("Szkoła nr 1");
        school1.addStudent(new Student("Jan", "Kowal"));
        school1.addStudent(new Student("Jan", "Kowal"));
        school1.addStudent(new Student("Jan", "Kowal"));
        school1.addStudent(new Student("Jan", "Kowal"));

        School school2 = new School("Szkoła nr 2");
        school2.addStudent(new Student("Jan", "Kowal"));
        school2.addStudent(new Student("Jan", "Kowal"));
        school2.addStudent(new Student("Jan", "Kowal"));
        school2.addStudent(new Student("Jan", "Kowal"));
        school2.addStudent(new Student("Jan", "Kowal"));

        School school3 = new School("Szkoła nr 3");
        school3.addStudent(new Student("Jan", "Kowal"));
        school3.addStudent(new Student("Jan", "Kowal"));
        school3.addStudent(new Student("Jan", "Kowal"));

        principalSchoolMap.put(principal1, school1);
        principalSchoolMap.put(principal2, school2);
        principalSchoolMap.put(principal3, school3);

        int totalStudentsNumber = 0;
        for (Map.Entry<Principal, School> principalSchoolEntry : principalSchoolMap.entrySet()) {
            System.out.println(principalSchoolEntry.getKey() + " jest dyrektorem "
                    + principalSchoolEntry.getValue() +  " , do której chodzi uczniów: " + principalSchoolEntry.getValue().giveSize() );
        totalStudentsNumber += principalSchoolEntry.getValue().giveSize();
        }
        System.out.println("Całkowita liczba studentów: "+ totalStudentsNumber);

    }

}

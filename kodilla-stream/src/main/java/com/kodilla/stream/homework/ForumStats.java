package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.stream.Collectors;

public class ForumStats {
    public static void main(String[] args) {
        //uruchom Stream na kolekcji użytkowników
        // zwracanej przez UsersRepository
        double result = UserRepository.getUsersList()

        //Stream obliczający średnią liczbę postów dla użytkowników,
        // których wiek jest >= 40.

                .stream()
                .map(u ->u.getNumberOfPosts())
                .mapToInt(n -> n)//Integer --> int
                .average()// kolektor average()
                .getAsDouble();//OptionalDouble --> double
        System.out.println("Srednia postów wszystkich: " + result);

        double resultForYounger = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(value -> value.getNumberOfPosts())
                .average()
                .getAsDouble();
        System.out.println("Srednia postów dla osób przed 40.: " + resultForYounger);

        double resultForAdults = UserRepository.getUsersList()
                .stream()
                .filter(value -> value.getAge() >= 40)
                .mapToInt(value -> value.getNumberOfPosts())
                .average()
                .getAsDouble();
        System.out.println("Srednia postów dla osób po 40.: " + resultForAdults);

        double avar = UserRepository.getUsersList()
                .stream()
                .filter(value -> value.getAge() < 40)
                .collect(Collectors.averagingDouble(User::getNumberOfPosts));

        System.out.println(avar);


        double avar1 = UserRepository.getUsersList()
                .stream()
                .filter(value -> value.getAge() < 40)
                .collect(Collectors.summarizingInt(User::getNumberOfPosts)).getAverage();
        System.out.println(avar1);

    }
}

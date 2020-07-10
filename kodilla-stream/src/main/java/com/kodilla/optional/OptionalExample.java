package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1",30,100, "Test"); //tworzymy teraz obiekt klasy User
//  User user = null; //tworzymy obiekt klasy User, ktory jest null-em

        Optional<User> optionalUser = Optional.ofNullable(user); // "opakujemy" user-a typem Optional
        //mozna też Optional.of(user)gdy mamy pewność, że opakowywany obiekt nie jest nullem

//metoda orElse na obiekcie optionalUser, gdy optionalUser zawiera w środku null,
//zwróci to, co przekazano jej jako argument, czyli "pusty" obiekt klasy User
       // String username = optionalUser.orElse(new User("",0,0, "")).getUsername();
       // System.out.println(username);

        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));

    }
}

package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> usersnames = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName) //referencja do metody
                // wcześniej było wyrażenie lambda: .map(u -> u.getUsername())
                .collect(Collectors.toList()); //.forEach(un -> System.out.println(un)) wyświetla wartości ze stream
        System.out.println(usersnames);
    }

    public static String getUserName(User user){
        return user.getUsername();
    }
}

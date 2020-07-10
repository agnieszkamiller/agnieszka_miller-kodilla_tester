package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
//wywołujemy metodę, która zwraca nam ArrayList obiektów typu User i przypisujemy je do nowej listy usersnames
        List<String> usersnames = UserRepository.getUsersList()
//uruchamiamy strumień, przez który przepływają obiekty typu User:
                .stream()
//filtrowanie: argument do metody to wyrażenie lambda, które zwraca true lub false , czyli
//przepuszczamy dalej obiekty klasy User, dla których spełniony jest warunek
// getGroup().equals("Chemists") chcemy wyświetlić użytkowników, którzy są chemikami
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName) //referencja do metody: nazwa_klasy::nazwa_metody
                //wcześniej było wyrażenie lambda: .map(u -> u.getUsername())
                //zmienne reprezentujące argumenty wejściowe funkcji -> kod zwracający obiekty wynikowe (wywołanie gettera)
//kolektor collect: wynik strumienia zapisujemy w zmiennej typu List<String> usernames
// (można też Set, Map lub pojedynczy skalar np. avarage, max, min, sum)
                .collect(Collectors.toList());
                //wcześniej było .forEach(un -> System.out.println(un)) = wyrażenie terminalne - kolektor:
                //wykonuje daną operację na każdym obiekcie, przepływającym kolejno przez strumień
                //wyświetla wartości ze stream
        System.out.println(usersnames);
    }

    public static String getUserName(User user){
        return user.getUsername();
    }
}

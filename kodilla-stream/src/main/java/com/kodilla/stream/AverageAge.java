package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UserRepository.getUsersList()//przypisanie wyniku do zmiennej o nazwie avg
                .stream()
                .map(u ->u.getAge())//w strumieniu same liczby odpowiadające wiekowi użytkowników
                .mapToInt(n -> n)//metoda mapToInt, która liczby typu Integer na wejściu przetwarza
                // w liczby typu int na wyjściu. Nie jest tu wymagana żadna specjalna konwersja,
                // dlatego też wyrażenie lambda ma po prostu postać n -> n
                .average()//wywołujemy kolektor average()
                .getAsDouble();//konwertujemy zwrócony przez niego typ OptionalDouble
                                // do zwykłego typu double
        System.out.println(avg);//wynik zostaje wyświetlony
    }
}

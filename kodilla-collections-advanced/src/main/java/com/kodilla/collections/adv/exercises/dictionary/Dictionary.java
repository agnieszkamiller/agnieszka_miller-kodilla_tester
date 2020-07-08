package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary { //klasa przechowuje wpisy do słownika w mapie
    Map<String, List<EnglishWord>> dictionary = new HashMap<>(); //klucze=polskie słowa, warości = listy słów angielskich

    public void addWord(String polishWord, EnglishWord englishWord) {
        //metoda dodaje jeden wpis do słownika
        //1. pobiera z mapy listę angielskich słów, odpowiadających wskazanemu słowu polskiemu
        //2. Jeżeli żadnego słowa angielskiego w mapie nie ma, to tworzona jest pusta lista
        // (wykorzystujemy tu metodę getOrDefault z interfejsu Map, która zwraca podaną jako argument wartość domyślną,
        // gdy mapa nie zawiera szukanego przez nas wpisu)
        //3. Do tej listy dodawany jest nasz wpis.
        //4. wpis ten jest wstawiany do mapy
        //Metoda put mapy wstawi nowy wpis lub zaktualizuje istniejący, jeżeli wpis o danym kluczu
        // (czyli polskim słowie) był już wcześniej w mapie obecny.
        List<EnglishWord> englishWords =
                dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        // medota wyszukuje angielskie słowa na podstawie polskiego
        // korzystamy z z metody udostępnianej przez klasę narzędziową Collections
        // o nazwie emptyList(), która tworzy i zwraca pustą listę
        //  Lista jest potrzebna, ponieważ typem zwracanym przez obie metody findEnglishWords
        //  jest lista obiektów typu EnglishWord
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
       // metoda j.w. plus bierze pod uwagę, jaka część mowy nas interesuje
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord,   Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
        return result;
    }

    public int size() { // metoda sprawdzająca, ile pozycji znajduje się w słowniku:
        return dictionary.size();
    }

}

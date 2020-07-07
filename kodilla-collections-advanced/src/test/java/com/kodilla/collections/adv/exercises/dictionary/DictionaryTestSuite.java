package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void testAddWord(){
        //given - przygotowujemy dane testowe, obiekt do testowania itd.
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        //when - wywołanie metody, którą testuje nasz test
        dictionary.addWord(polishWord, englishWord);
        //then -  czy testowana klasa zachowała się poprawnie?
        // test dodaje do słownika jeden wpis, a następnie przy pomocy asercji sprawdza,
        // czy słownik zawiera dokładnie jeden wpis
        assertEquals(1, dictionary.size());//
    }

    @Test
    public void testFindEnglishWords(){
        //given -  test dodaje do słownika trzy polskie słowa: "stos", "gra" oraz "grać".
        // Dodaje do niego również odpowiadające tym słowom wyrazy angielskie
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        //when - test wywołuje testowaną metodę findEnglishWords dla wyrazu "gra",
        // a wynik działania tej metody przypisuje do zmiennej result
        List<EnglishWord> result = dictionary.findEnglishWords("gra");
        //then - czy odnalezione zostały w słowniku dwa wyrazy angielskie pasujące
        // do poszukiwanego wzorca polskiego.
       // assertEquals(2, result.size());
        //tu mamy pewność, że testowana metoda zwróciła nie tylko prawidłową liczbę elementów,
        // ale również że zwrócone elementy są poprawne
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        assertEquals(expectedList, result);
    }
    @Test
    public void testfindingEnglishWords_withPartofSpeach(){
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "take"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        //when
        List<EnglishWord> result  = dictionary.findEnglishWords("brać", PartOfSpeech.NOUN);
        //then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        assertEquals(expectedList, result);
    }


}
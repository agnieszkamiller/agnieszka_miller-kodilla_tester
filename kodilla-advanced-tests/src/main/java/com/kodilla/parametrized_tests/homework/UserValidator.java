package com.kodilla.parametrized_tests.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public boolean validateUsername(String username) {
// metoda sprawdza, czy przekazana nazwa użytkownika jest prawidłowa
//username musi zawierać trzy lub więcej znaków takich jak:
// małe i duże litery a-z, cyfry, kropka, myślnik oraz podkreślnik
        return username.matches("^[a-zA-Z0-9._-]{3,}$");
    }

    public boolean validateEmail(String email) {
// metodas prawdza poprawność przekazanego adresu e-mail
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }
}

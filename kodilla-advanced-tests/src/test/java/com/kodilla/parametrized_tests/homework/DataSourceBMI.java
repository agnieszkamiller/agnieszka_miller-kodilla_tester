package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataSourceBMI {

    static Stream<Arguments> provideDataToBMICalculator() {
        return Stream.of(
                Arguments.of("Very severely underweight", 1.5, 10),
                Arguments.of("Severely underweight",  1.5, 35),
                Arguments.of("Underweight", 1.5, 40),
                Arguments.of("Normal (healthy weight)", 1.5, 50),
                Arguments.of("Overweight", 1.5, 60),
                Arguments.of("Obese Class I (Moderately obese)", 1.5, 70),
                Arguments.of("Obese Class II (Severely obese)", 1.5, 80),
                Arguments.of("Obese Class III (Very severely obese)", 1.5, 90),
                Arguments.of("Obese Class IV (Morbidly Obese)", 1.5, 110),
                Arguments.of("Obese Class V (Super Obese)", 1.5, 130),
                Arguments.of("Obese Class VI (Hyper Obese)", 1.5, 200)
        );
    }
}

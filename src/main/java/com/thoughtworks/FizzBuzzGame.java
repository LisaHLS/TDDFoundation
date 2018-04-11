package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    private static final int SPECIAL_NUMBER_THREE = 3;
    private static final int SPECIAL_NUMBER_FIVE = 5;
    private static final int SPECIAL_NUMBER_SEVEN = 7;
    private static final String SPECIAL_NUMBER_THREE_STR = "3";
    private static final String FIZZ_REPLACE_THREE = "Fizz";
    private static final String BUZZ_REPLACE_FIVE = "Buzz";
    private static final String WHIZZ_REPLACE_SEVEN = "Whizz";

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            results.add(replaceSpecialNum(i));
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String replaceSpecialNum(int number){

        String result;
        boolean multipleThree = number % SPECIAL_NUMBER_THREE == 0;
        boolean multipleFive = number % SPECIAL_NUMBER_FIVE == 0;
        boolean multipleSeven = number % SPECIAL_NUMBER_SEVEN == 0;

        if (String.valueOf(number).contains(SPECIAL_NUMBER_THREE_STR)) {
            result = FIZZ_REPLACE_THREE;

        } else if (multipleThree && !multipleFive && !multipleSeven) {
            result = FIZZ_REPLACE_THREE;

        } else if (!multipleThree && multipleFive && !multipleSeven) {
            result = BUZZ_REPLACE_FIVE;

        } else if (!multipleThree && !multipleFive && multipleSeven) {
            result = WHIZZ_REPLACE_SEVEN;

        } else if (multipleThree && multipleFive && !multipleSeven) {
            result = FIZZ_REPLACE_THREE + BUZZ_REPLACE_FIVE;

        } else if (multipleThree && !multipleFive) {
            result = FIZZ_REPLACE_THREE + WHIZZ_REPLACE_SEVEN;

        } else if (!multipleThree && multipleFive) {
            result = BUZZ_REPLACE_FIVE + WHIZZ_REPLACE_SEVEN;

        } else if(multipleThree){
            result = FIZZ_REPLACE_THREE + BUZZ_REPLACE_FIVE + WHIZZ_REPLACE_SEVEN;
        } else {
            result = String.valueOf(number);
        }
        return result;
    }
}



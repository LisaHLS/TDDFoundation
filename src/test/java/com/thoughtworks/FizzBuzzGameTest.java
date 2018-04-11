package com.thoughtworks;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzGameTest {

    private FizzBuzzGame fizzBuzzGame;

    @Before
    public void setUp() {
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    public void should_return_Fizz_when_Number_off_3() {
        assertThat(fizzBuzzGame.replaceSpecialNum(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Fizz_when_Number_off_6()  {
        assertThat(fizzBuzzGame.replaceSpecialNum(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Fizz_when_Number_off_13()  {
        assertThat(fizzBuzzGame.replaceSpecialNum(13)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Fizz_when_Number_off_35()  {
        assertThat(fizzBuzzGame.replaceSpecialNum(35)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Fizz_when_Number_off_30() {
        assertThat(fizzBuzzGame.replaceSpecialNum(30)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_when_Number_off_5() {
        assertThat(fizzBuzzGame.replaceSpecialNum(5)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_Buzz_when_Number_off_25()  {
        assertThat(fizzBuzzGame.replaceSpecialNum(25)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_Whizz_when_Number_off_7() {
        assertThat(fizzBuzzGame.replaceSpecialNum(7)).isEqualTo("Whizz");
    }

    @Test
    public void should_return_Whizz_when_Number_off_28()  {
        assertThat(fizzBuzzGame.replaceSpecialNum(28)).isEqualTo("Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_Number_off_15()  {
        assertThat(fizzBuzzGame.replaceSpecialNum(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_return_BuzzWhizz_when_Number_off_70()  {
        assertThat(fizzBuzzGame.replaceSpecialNum(70)).isEqualTo("BuzzWhizz");
    }

    @Test
    public void should_return_FizzWhizz_when_Number_off_21() {
        assertThat(fizzBuzzGame.replaceSpecialNum(21)).isEqualTo("FizzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_Number_off_105()  {
        assertThat(fizzBuzzGame.replaceSpecialNum(105)).isEqualTo("FizzBuzzWhizz");
    }

    @Test
    public void should_return_Fizz_when_Number_off_315() {
        assertThat(fizzBuzzGame.replaceSpecialNum(315)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Fizz_when_Number_off_start_from_20() {
        String[] array = new String[]{"1","2","Fizz","4","Buzz","Fizz","Whizz","8","Fizz","Buzz","11","Fizz","Fizz","Whizz","FizzBuzz","16","17","Fizz","19","Buzz"};
        List<String> arrayList = Arrays.asList(array);
        fizzBuzzGame.start(20);
        assertTrue(compareList(fizzBuzzGame.getResults(),arrayList));
    }

    public boolean compareList(List<String> listOne, List<String> listTwo) {
        boolean isTotalEqual = true;
        if (null != listOne && null != listTwo && listOne.size() == listTwo.size()) {
            for (int i = 0; i < listOne.size(); i++) {
                if (!listOne.get(i).equals(listTwo.get(i))) {
                    isTotalEqual = false;
                    break;
                }
            }
        }
        return isTotalEqual;
    }

}

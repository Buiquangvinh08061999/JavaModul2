package _08_cleancode_refactoring._1practice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {
    @Test
    void testFizz3(){
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(3);
        assertEquals(expected, result);
    }
    @Test
    void testFizz6(){
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(6);
        assertEquals(expected,result);
    }


    @Test
    void testBuzz5(){
        String expected ="Buzz";
        String result = FizzBuzz.fizzBuzz(5);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz15(){
        String expected="FizzBuzz";
        String result = FizzBuzz.fizzBuzz(15);
        assertEquals(expected,result);
    }

}

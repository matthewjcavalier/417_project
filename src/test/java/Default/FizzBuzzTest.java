package Default;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
    @Test
    public void FizzBuzz_3() {
        assertEquals("Fizz", FizzBuzz.result(3));
    }

    @Test
    public void FizzBuzz_4(){
        //assertEquals("4", FizzBuzz.result(4));
        assertEquals("-1", FizzBuzz.result(4));
    }

    @Test
    public void FizzBuzz_5() {
        assertEquals("Buzz", FizzBuzz.result(5));
    }

    @Test
    public void FizzBuzz_6() {
        assertEquals("Fizz", FizzBuzz.result(6));
    }

    @Test
    public void FizzBuzz_10() {
        assertEquals("Buzz", FizzBuzz.result(10));
    }

    @Test
    public void FizzBuzz_15() {
        assertEquals("FizzBuzz", FizzBuzz.result(15));
    }

    @Test
    public void FizzBuzz_18() {
        assertEquals("Fizz", FizzBuzz.result(18));
    }
}

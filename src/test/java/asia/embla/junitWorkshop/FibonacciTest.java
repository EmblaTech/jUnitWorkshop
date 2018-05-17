package asia.embla.junitWorkshop;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {
    
    static Fibonacci fib  = new Fibonacci();

    @Test
    public void testGetFibSequenceNotNull(){
        int result = fib.getFibSequence(1);
        Assertions.assertNotNull(result);
    }

    @Test
    public void testGetFibSequenceFirstInput(){
        int result = fib.getFibSequence(1);
        Assertions.assertEquals(1,result);
    }

    @Test
    public void testGetFibSequenceSecondInput(){
        int result = fib.getFibSequence(2);
        Assertions.assertEquals(1,result);
    }

    @Test
    public void testGetFibSequenceThirdInput(){
        int result = fib.getFibSequence(3);
        Assertions.assertEquals(2,result);
    }

    @Test
    public void testGetFibSequenceFourthInput(){
        int result = fib.getFibSequence(4);
        Assertions.assertEquals(3,result);
    }

    @Test
    public void testGetFibSequenceFifthInput(){
        int result = fib.getFibSequence(5);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void testGetFibSequenceTenthInput(){
        int result = fib.getFibSequence(10);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void testGetFibSequenceMinusInput(){
        Assertions.assertThrows(NumberFormatException.class, () -> fib.getFibSequence(-1), "Exception Not Thrown");
    }
}
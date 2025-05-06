package Test1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Code.Calculate;
import Code.Stringlen;
import Code.NumberUtils; 
import Code.checkPrime; 
public class Test_program {
       Calculate calculate = new Calculate();
       @Test
       public void testAdd() {
        assertEquals(5, calculate.add(2, 3)); // Test with positive numbers
        assertEquals(-5, calculate.add(-2, -3));  // Test with negative numbers        
        assertEquals(2, calculate.add(2, 0)); // Test with zero
       }

        Stringlen stringlen = new Stringlen();
         @Test
         public void testGetStringLength() {
             assertEquals(5, stringlen.getStringLength("Hello")); // Test with a normal string
             assertEquals(0, stringlen.getStringLength("")); // Test with an empty string
         }

        NumberUtils numberUtils = new NumberUtils();
         @Test
          public void testIsEven() {
              assertEquals(true, numberUtils.isEven(4)); // Test with an even number
              assertEquals(false, numberUtils.isEven(5)); // Test with an odd number
              assertEquals(true, numberUtils.isEven(0)); // Test with zero
          }
        
        checkPrime prime = new checkPrime();
        @Test
        public void testIsPrime() {
            assertEquals(true, prime.isPrime(7)); // Test with a prime number
            assertEquals(false, prime.isPrime(15)); // Test with a non-prime number
        }
    }
// This code is a JUnit test class that tests the functionality of the Calculate, Stringlen, NumberUtils, and checkPrime classes.
    


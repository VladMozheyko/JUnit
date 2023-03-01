import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before test: ");
    }

    @Test
    public void testSum(){
        Assertions.assertEquals(4, calculator.sum(1, 3));
        System.out.println("Test sum");
    }

   @Test
   public void testSub(){
        Assertions.assertEquals(5, calculator.sub(7, 2));
       System.out.println("Test sub");
   }

   @Test
    public void testMul(){
        Assertions.assertEquals(8, calculator.mul(4, 2));
       System.out.println("Test mul");
   }

   @Test
    public void testDiv(){
        Assertions.assertEquals(8, calculator.div(16, 2));
       System.out.println("Test div");
   }

    @AfterEach
    public void afterEach(){
        System.out.println("After test: ");
    }

}

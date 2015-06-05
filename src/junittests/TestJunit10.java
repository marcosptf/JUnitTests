package junittests;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junittests.BussinessLogic;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestJunit10 {
     private Integer inputNumber;
     private Boolean expectedResult;
     private BussinessLogic logic;

     @Before
     public void initialize() {
        logic = new BussinessLogic();
//        Properties pro = System.getProperty(null, null);
        Properties pro = (Properties) this.primeNumbers();
        Iterator iter = pro.keySet().iterator();
        for(Object key = new Object[4][4]; iter.hasNext(); key = (Object) iter.next()){
            this.TestJunitBL((Integer) key,(Boolean) key);
        }
     }

     public void TestJunitBL(Integer inputNumber, Boolean expectedResult) {
       System.out.println("TestJunit-> inputNumber:"+inputNumber+" expectedResult:"+expectedResult);
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
        testPrimeNumberChecker();
     }

     @Parameterized.Parameters
     public static Collection primeNumbers() {
       System.out.println("primeNumbers() is called");
        return Arrays.asList(new Object[][] {
           { 2, true },
           { 6, false },
           { 19, true },
           { 22, false },
           { 23, true }
        });
     }

     @Test
     public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " + inputNumber);
        assertEquals(expectedResult, logic.validate(inputNumber));
     }

}

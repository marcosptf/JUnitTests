package junittests;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import static org.junit.Assert.assertFalse;
import junit.framework.TestResult;

public class TestJunit6 extends TestResult {

   // add the error
   public synchronized void addError(Test test, Throwable t) {
      super.addError((junit.framework.Test) test, t);
   }
   
   // add the failure
   public synchronized void addFailure(Test test, AssertionFailedError t) {
      super.addFailure((junit.framework.Test) test, t);
   }
   
   @Test
   public void testAdd() {
       assertFalse(!true);
   }   
   
   // Marks that the test run should stop.
   public synchronized void stop() {
      System.out.println("stop the test here");
   }
   
}

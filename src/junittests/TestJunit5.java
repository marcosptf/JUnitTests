package junittests;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class TestJunit5 extends TestCase  {
   protected double fValue1;
   protected double fValue2;
   
   @Before 
   public void setUp() {
      /* on this case for example, we can start a transaction, 
       start a conection with something */
     System.out.println("setup");
      fValue1= 2.0;
      fValue2= 3.0;
   }
  
   @Test
   public void testAdd() {
      //count the number of test cases
      System.out.println("No of Test Case = "+ this.countTestCases());
    
      //test getName 
      String name= this.getName();
      System.out.println("Test Case Name = "+ name);

      //test setName
      this.setName("testNewAdd");
      String newName= this.getName();
      System.out.println("Updated Test Case Name = "+ newName);
      
      assertEquals(5.0, fValue1+fValue2);
   }
   
  
   @Test
   public void testAdd2() {
      System.out.println("No of Test Case = "+ this.countTestCases());
      String name= this.getName();
      System.out.println("Test Case Name = "+ name);
   }
   
  
   @Test
   public void testAdd3() {
      System.out.println("No of Test Case = "+ this.countTestCases());
      String name= this.getName();
      System.out.println("Test Case Name = "+ name);
   }
   
  
   @Test
   public void testAdd4() {
      System.out.println("No of Test Case = "+ this.countTestCases());
      String name= this.getName();
      System.out.println("Test Case Name = "+ name);
   }
  
   @Test
   public void testAdd5() {
      System.out.println("No of Test Case = "+ this.countTestCases());
      String name= this.getName();
      System.out.println("Test Case Name = "+ name);
   }
   
   
   public void tearDown() {
   //tearDown used to close the connection or clean up activities
     System.out.println("clean up.");
   }
}

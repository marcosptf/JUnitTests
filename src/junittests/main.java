/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junittests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 *
 * @author marcos
 */
public class main {
    public static void main(String[] args){
        Result result;
               
        result = JUnitCore.runClasses(
            TestJunit.class,
            TestJunit1.class,
            TestJunit2.class,
            TestJunit3.class,
            TestJunit4.class,
            TestJunit5.class,
            TestJunit6.class,
            TestJunit7.class,
            TestJunit8.class,
            TestJunit9.class,  
            TestJunit10.class,
            Employee.class
            );
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());

    }
}

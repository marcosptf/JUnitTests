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
                JunitTestSuite.class
            );
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());

    }
}

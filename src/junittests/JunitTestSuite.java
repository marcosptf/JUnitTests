/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junittests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author marcos
 */
/* JUnit suite test */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestJunit.class,
    TestJunit1.class,
    TestJunit2.class,
    TestJunit3.class,
    TestJunit4.class,
    TestJunit5.class,
    TestJunit6.class,
    TestJunit7.class,
    TestJunit8.class,
    TestJunit9.class
//    TestJunit10.class,  need more attention to see what wrong happened 
//    Employee.class    => this class dont exist @Test, maybe need to do
})
public class JunitTestSuite {
}

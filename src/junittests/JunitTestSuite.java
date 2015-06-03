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
    TestJunit1.class,
    TestJunit2.class
})
public class JunitTestSuite {
}

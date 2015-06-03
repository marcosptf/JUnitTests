/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junittests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author marcos
 */
public class TestJunit {
    
    @Test
    public void testAdd(){
        String str = "junit is working fine";
        assertEquals("junit is working fine",str);
    }
    
}

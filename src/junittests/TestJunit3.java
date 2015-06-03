/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junittests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author marcos
 */
public class TestJunit3 {
    @Test
    public void testAdd(){
        int num = 5;
        String str = "abc";
        
        assertEquals("abc",str);
        assertFalse(num > 7);
        assertNotNull(str);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junittests;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author marcos
 */
public class TestJunit4 {
    @Test
    public void testAssertions(){
        int val1,val2;
        String str1,str2,str3,str4,str5;
        
        str1 = new String("abc");
        str2 = new String("abc");
        str3 = null;
        str4 = "abc";
        str5 = "abc";
        val1 = 5;
        val2 = 6;
        String[] expectedArray = {"one","two","three"};
        String[] resultArray = {"one","two","three"};
        
        assertEquals(str1,str2);
        assertTrue(val1 < val2);
        assertFalse(val1 > val2);
        assertNotNull(str1);
        assertNull(str3);
        assertSame(str4,str5);
        assertNotSame(str1,str3);
        assertArrayEquals(expectedArray,resultArray);
    }
}

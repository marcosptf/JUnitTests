/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junittests;

import junit.framework.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author marcos
 */
public class JUnitTests {

    
    protected int value1,value2;
    
    protected void setUP(){
        this.value1=1;
        this.value2=2;
    }
    
    public void testAdd(){
        double result = this.value1 + this.value2;
        assert (result == 2);
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
}

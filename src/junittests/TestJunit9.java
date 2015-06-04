import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit9 {

  @Test(expected = ArithmeticException.class)
  public void testPrintMessage() {
    int a = 0;
    int b = 1 / a;
    assertEquals(0,b);
  }
}

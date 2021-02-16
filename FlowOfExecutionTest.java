import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FlowOfExecutionTest {

	@Test
	@DisplayName("Test overloaded method dobuleMe() for accurate string value.") 
    public void testDoubleMeString() {
		
		String expected = "test test";
		String actual = MyMethods.doubleMe("test");   // Given & When because public static void
		
		assertEquals(expected, actual);
		
		
	}
	
    @Test
    @DisplayName("Test overloaded method doubleMe() for accurate long value.")
    public void testDoubleMeLong() {
    	
    	long expected = 20000000L;
    	long actual   = MyMethods.doubleMe(10000000L);
    	
    	assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("Test overloaded method doubleMe() for accurate int value.")
    public void testDoubleMeInt() {
    
      int expected = 2000;
      int actual = MyMethods.doubleMe(1000);
      
      assertEquals(expected, actual);
      }
	
	@Test
	@DisplayName("Test overloaded method doubleMe() for accurate double value.")
	public void testDoubleMe() {
		
		double expected = 400.44;
		double actual = MyMethods.doubleMe(200.22);
		
		assertEquals(expected, actual);
	}
}

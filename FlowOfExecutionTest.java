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

@Test
  @DisplayName("Test overloaded method doubleMe() for accurate double value.")
  public void testDoubleMeDouble() {
   	
  	double expected = 5.0;
  	double actual  = MyMethods.doubleMe(2.5);
   	
  	assertEquals(expected, actual, 0.01);
   	
  }
   
  @Test
  @DisplayName("Test FlowOfExecution Class")
  public void testFlowOfExecutionClass() {
  	FlowOfExecution foeAM = new FlowOfExecution();   // This works because arbitraryMethod is not static
  	String actual = foeAM.arbitraryMethod("Sad Face"); // if it was, we wouldn't have to build the object
  	String expected = "What did you call me? A Sad Face?"; // So eclipse would tell us we were doing it wrong.
   	
  	assertEquals(expected, actual);
   	
  }

//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import org.junit.jupiter.api.DisplayName;
class TestScanner {
    @Test
    @DisplayName("Unhook stIn and stOut and replace with our own ByteArrayI/O streams")
    public void testCase1() {
        // Output stream!! 
        ByteArrayOutputStream byteArrayOSOut = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOSOut);
        PrintStream old = System.out;    // don't lose System.out, save it.  
        System.setOut(ps);  // use your stream instead of System Out.
        // Input stream!  Set it up, feed our input to it, save the old one, fed ours to System.setIn
        String testString = "Hello!";     // Gets fed to the input stream below
        ByteArrayInputStream byteArrayOSIn = new ByteArrayInputStream(testString.getBytes());  // set up new input stream
        InputStream oldIn = System.in;  // Save Old stream
        System.setIn(byteArrayOSIn);    // Set our input stream as the system input stream
        ScannerTest.main(null);    // call our class ScannerTest.main
        String expected = "You said " + testString + "\n";  // expected output
        System.out.flush();     // Clean things up, flush it
        System.setOut(old);     // put System.out back
        System.setIn(oldIn);    // put System.in back
        String actual = byteArrayOSOut.toString();  // Get our output from ScannerTest back and stick it in actual
        assertEquals(expected, actual);
    }
}
 //

import static org.junit.Assert.*;

import org.junit.Test;


public class StudentTests {

	@Test
	public void testInstanceBetween() {
		{
			ProvidedCode myObj = new ProvidedCode(4);
			String actualOutput = StudentCode.getBetween(myObj);
			String expectedOutput = "no";
			assertTrue(actualOutput.equals(expectedOutput));
		}
		{
			ProvidedCode myObj = new ProvidedCode(50);
			String actualOutput = StudentCode.getBetween(myObj);
			String expectedOutput = "yes";
			assertTrue(actualOutput.equals(expectedOutput));
		}
		{
			ProvidedCode myObj = new ProvidedCode(10);
			String actualOutput = StudentCode.getBetween(myObj);
			String expectedOutput = "matches Lower Value";
			assertTrue(actualOutput.equals(expectedOutput));
		}
		{
			ProvidedCode myObj = new ProvidedCode(100);
			String actualOutput = StudentCode.getBetween(myObj);
			String expectedOutput = "matches Higher Value";
			assertTrue(actualOutput.equals(expectedOutput));
		}
	}
	@Test
	public void testParamBetween() {
		{
			ProvidedCode myObj = new ProvidedCode(4);
			String actualOutput = StudentCode.getBetween(myObj,7);
			String expectedOutput = "no";
			assertTrue(actualOutput.equals(expectedOutput));
		}
		{
			ProvidedCode myObj = new ProvidedCode(4);
			String actualOutput = StudentCode.getBetween(myObj,50);
			String expectedOutput = "yes";
			assertTrue(actualOutput.equals(expectedOutput));
		}
		{
			ProvidedCode myObj = new ProvidedCode(4);
			String actualOutput = StudentCode.getBetween(myObj,10);
			String expectedOutput = "matches Lower Value";
			assertTrue(actualOutput.equals(expectedOutput));
		}
		{
			ProvidedCode myObj = new ProvidedCode(4);
			String actualOutput = StudentCode.getBetween(myObj,100);
			String expectedOutput = "matches Higher Value";
			assertTrue(actualOutput.equals(expectedOutput));
		}
		{
			ProvidedCode myObj = new ProvidedCode(4);
			String actualOutput = StudentCode.getBetween(myObj,4);
			String expectedOutput = "matches Parameter";
			assertTrue(actualOutput.equals(expectedOutput));
		}
	}
}

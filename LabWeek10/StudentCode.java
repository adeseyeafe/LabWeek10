/*Students must implement these methods
 * to do the task described WITHOUT USING
 * EVEN ONE CONDITIONAL STATEMENT OF ANY KIND
 * (no loops, no ifs, no switches, no conditional operaors,
 * you don't need any boolean expressions at all)!!!
 * You must find out what happened in the method
 * by catching the exception thrown.
 */
import LabWeek10.*;
public class StudentCode {
	/*Returns one of the following Strings;
	 * which String is returned depends on how the private instance data member 
	 * of the object passed as a parameter compares 
	 * to the HIGH and LOW which are private
	 * static members of the class passed:
	 * - "yes" if the value of the instance data member of the class object
	 *     passed is between the HIGH and LOW
	 * - "no" if it is not between the HIGH and LOW
	 * - "matches Higher Value" if it is the same as HIGH
	 * -  or "matches Lower Value" if it is the same as LOW
	 */
	public static String getBetween(ProvidedCode myParam){
		try{
			return myParam.between();
		}catch (ArithmeticException e){
			String matchHigh = "matches Higher Value";
			return matchHigh;
		}catch (NullPointerException e){
			String matchLow = "matches Lower Value";
			return matchLow;
		}
//		return null;//not yet implemented - so just returning null
	}
	/*Returns one of the following Strings after
	 * which String is returned depends on how the integer parameter passed 
	 * as the second parameter compares to the HIGH and LOW which are private
	 * static data members of the class passed as the first parameter and 
	 * how that integer parameter compares to the private instance data member
	 * of the object passed as the first parameter:
	 * Low Values:
	 * - "yes" if the value of the parameter is between the HIGH and LOW
	 *      as they are set in the object passed as the first parameter
	 * - "no" if the parameter is not between the HIGH and LOW
	 * - "matches Higher Value" if it is the same as HIGH
	 * - "matches Lower Value" if it is the same as LOW
	 * - "matches Parameter" it the instance value matches the parameter
	 */
	public static String getBetween(ProvidedCode myParam, int param){
		try{
			return myParam.between(param);
		}catch (ArithmeticException e){
			String matchHigh = "matches Higher Value";
			return matchHigh;
		}catch (NullPointerException e){
			String matchLow = "matches Lower Value";
			return matchLow;
		}catch (RuntimeException e){
			String matchParam = "matches Parameter";
			return matchParam;
		}
	}
}

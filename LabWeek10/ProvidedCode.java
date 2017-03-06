/**
 *This code is provided to you
 *YOU MAY NOT CHANGE ANYTHING IN THIS FILE
 * 
 * @author  Jan Plane
 */
public class ProvidedCode {
	
	private final static int HIGH_VAL = 100;
	private final static int LOW_VAL = 10;
	private int myVal;

	/** Constructs an object with the value 0 */
	public ProvidedCode(){
		this(0);
	}
	/** Constructs an object with the value passed */
	public ProvidedCode(int inVal){
		myVal = inVal;
	}
	/** Returns "yes" if the value of the instance variable is
	 * between the HIGH and the LOW or the value "no" if it is not.
	 * @throws ArithmeticException if it matches the HIGH_VAL
	 * @throws NullPointerException if it matches the LOW_VAL 
	 * @return true or false
	 */
	public String between(){
		if (myVal == HIGH_VAL){
			throw new ArithmeticException("matches");
		}
		if (myVal == LOW_VAL){
			throw new NullPointerException("matches");
		}
		if (myVal < HIGH_VAL && myVal > LOW_VAL){
			return "yes";
		}else{
			return "no";
		}
	}
		/** Returns "yes" if the value of the parameter is
		 * between the HIGH and the LOW or the value "no" if it is not.
		 * @throws RuntimeException if it matches the instance variable 
		 * @throws ArithmeticException if it matches the HIGH_VAL
		 * @throws NullPointerException if it matches the LOW_VAL 
		 * @return "yes" or "no"
		 */
	public String between(int inVal){
		if (inVal == myVal){
			throw new RuntimeException("matches");
		}
		if (inVal == HIGH_VAL){
			throw new ArithmeticException("matches");
		}
		if (inVal == LOW_VAL){
			throw new NullPointerException("matches");
		}
		if (inVal < HIGH_VAL && inVal > LOW_VAL){
			return "yes";
		}else{
			return "no";
		}
	}
}

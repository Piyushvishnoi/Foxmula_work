package Assignment3;
public class OddandPrimeNumberException extends Exception {
	

	public OddandPrimeNumberException(){
		super();
	}
	
	public OddandPrimeNumberException(String str) {
		super(str);
	}
	
	public String errorMessage() {
		return "Invalid: The number is both Odd and Prime";
	}
}

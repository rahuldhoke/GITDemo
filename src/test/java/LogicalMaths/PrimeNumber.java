package LogicalMaths;

public class PrimeNumber {

	public static void main(String[] args) {
		CheckPrimeNumber(17);

	}
	
	public static boolean CheckPrimeNumber (int no) {
		if(no <1 ) {
			System.out.println("0 and 1 are not prime numbers");
			return false;
		}
		
		for(int i=2; i<no; i++) {
			if(no % i == 0) {
				return false;
				
			}
			
		}
		System.out.println("This is a prime no " + no);
		return true;
	
	}

}

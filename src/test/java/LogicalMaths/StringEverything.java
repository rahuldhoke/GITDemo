package LogicalMaths;

public class StringEverything {

	public static void main(String[] args) {
	//Character at - this prints character from a string based on index
		String str = "donkeydonkey";
		System.out.println(str.charAt(0)); // print chacter at 0 position;
		
	//print all characters from a string
		String str1 = "donkeydonkey";
		int len = str1.length();
		for(int i=0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
	//convert string to character array and print all the characters
		String str2 = "donkeydonkey";
		char[] chrArry =  str2.toCharArray();
		for(int i=0; i<chrArry.length; i++) {
	
			System.out.println("Data in Character array is " + chrArry[i]);
		}
	//Reverse a String
		
		String str3 = "donkeydonkey";
		int strlen = str3.length();
		String temp="";
		for(int i = strlen - 1; i>=0; i--) {
			temp = temp + str3.charAt(i);
		}
	System.out.println("temp value is " + temp);
	//**********************************
//	Reverse a string using StringBuffer
			String str4 = "yeknod";
			StringBuffer sf = new StringBuffer(str4);
			System.out.println(sf.reverse());
	
//	Reverse an Integer
		
	int str5 = 12345;
	String str6 = String.valueOf(str5);
	StringBuffer sf1 = new StringBuffer(str6);
	System.out.println(sf1.reverse());

	// Reverse a string using formula	
	int num =12345;
	int rev = 0;
	
	while(num != 0) {
		rev = rev * 10 + num % 10;
	num = num / 10; // decimal value is not taken after dividing, hence output is 1234 -real o/t is 1234.5
	}
	
	System.out.println("Last Reversal number is " + rev);

	
	}
}

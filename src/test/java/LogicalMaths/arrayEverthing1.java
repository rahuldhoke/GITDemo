package LogicalMaths;

public class arrayEverthing1 {
	public static void main(String[] args) {
		
		
		int arrNumber[] = {100,100,300,300,5}; //curly brackets define it directly
		for(int i=0; i<arrNumber.length;i++) {
			for(int j=i+1; j<arrNumber.length;j++) {
				if(arrNumber[i] == arrNumber[j]) {
					System.out.println(arrNumber[i]);
					}
				}
			}
	
	//method 2
		int count = 0;
		String strArray[]= {"A","A","B","C","B"};
			for(int i=0;i<strArray.length-1;i++) {
				if(strArray[i] == "B") {
					count = count + 1;
					System.out.println(count);
				}
			}
	
	
//******************	
	}

}

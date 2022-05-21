package LogicalMaths;

public class arraysEverything {

	public static void main(String[] args) {
//Create Array
		String[] arr1 = {"a","b","c"};	//brackets denotes that it is array
		
		//Find length of an array
		int arrlength = arr1.length;
		System.out.println(arrlength);
		//****************************************************		
		//print all the elements from an array
		for(int i=0; i <arr1.length; i++) {
			String arryData = arr1[i];
			System.out.println(arryData);
		}
	//****************************************************	
		//find largest number in an array  
		int larNum = 0;
		int arrNumber[] = {100,2,300,4500,5}; //curly brackets define it directly
		for(int i=0; i<arrNumber.length;i++) {
			if(arrNumber[i] > larNum) {
				larNum = arrNumber[i];
			}
		}
		System.out.println("Largest Number in an Array is " +larNum );

	//****************************************************	
	//find smallest number in an array  
	int smallArr[] = new int[3]; // Square brackets direclty define array size, array size always give right side
	 smallArr[0] = 11;
	 smallArr[1] = 22;
	 smallArr[2] = 300;
	 
	 int min = smallArr[0];
	 for(int i=0; i < smallArr.length;i++) {
		 if(smallArr[i] < min)  {
			 min = smallArr[i];
		 	}
	
	 	}
	
		System.out.println("Smallest Number in an Array is " + min );
	}


}









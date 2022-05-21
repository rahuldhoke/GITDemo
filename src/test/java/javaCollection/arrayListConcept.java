package javaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class arrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arryLst1 = new ArrayList<Integer>();	//creating Integer arra
		ArrayList<Double> arryLst2 = new ArrayList<Double>();	//creating Double arra
		ArrayList<String> arryLst3 = new ArrayList<String>();	//creating Double arra
		ArrayList<Object> arryLst = new ArrayList<Object>(); // //Creating Object array
		ArrayList<String> stringArrayList4 = new ArrayList<String>(Arrays.asList("A","B","C"));
		
		arryLst.add("rahul");
		arryLst.add(true);
		arryLst.add(100);
		
		System.out.println(arryLst);  // print all data in arraylist
		System.out.println(arryLst.get(1)); 		//Printing data from 1st element of arralylist
		
		ArrayList<Object> arrLst1 = new ArrayList<Object>(20); // Increasing virtual capacity of an array
		
		//printing values using collection
		for(Object obj : arryLst) {
			System.out.println(obj);
		}
		//*************
		//Using Iterator 
		//Method 1 to Print data in array using Iterator
		arryLst.iterator(); // assigning iterator to an ArrayLIst
		Iterator<Object> it = arryLst.iterator(); // saving the Iterator in an Object
		while(it.hasNext()) {
			Object a = it.next(); // next is used to retreive data
			System.out.println("Using Iterator Print " + a);
		}
			
		//Adding 2 arrays - data is added to array1, hence combine data will be added to arr1 and not arr2
			ArrayList<Integer> arryLst6 = new ArrayList<Integer>(Arrays.asList(1,2,3));	//creating Integer arra
			ArrayList<Integer> arryLst7 = new ArrayList<Integer>(Arrays.asList(4,5,6));	//creating Double arra
			arryLst6.addAll(arryLst7);
			
			for(Integer obj : arryLst6) {
				System.out.println(" Combined 2 array data is " + obj);	
			}
			//Deleting all the elements from an array
			arryLst7.clear();
			
			//duplicate array 0r making xerox copy of some array
			ArrayList<Integer> DuplicateArray = (ArrayList<Integer>)arryLst6.clone();
			System.out.println("Duplicate Data array " + DuplicateArray);
		
		//How to check specfic data exists in arraylist - using contains
			boolean dExists = arryLst6.contains(1);
			System.out.println("Data exists in array list is " + dExists);
			//How to check specfic data exists in arraylist - using Index of 
			boolean dExists1 = stringArrayList4.indexOf("rahul") > 0;
			System.out.println(dExists1);
		
			// Removing data from array
			arryLst6.remove(0) ; //removing based on index value
			arryLst.remove("rahul"); //removing based on value value
			ArrayList<Integer> intarra1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
			//intarra1.removeIf(num -> num%2==0); // removing based on some logic

			//Find Duplicate Data -- Retain All - Retain means only give/retreive those values which I want
			ArrayList<Integer> intarra2 = new ArrayList<Integer>(Arrays.asList(1,1,1,3,5,5,5));
			intarra2.retainAll(Collections.singleton(5));
			System.out.println("Duplicate Elements in Array are -- " + intarra2);
			
//			Method 2
			int TotDup = intarra2.size();
			System.out.println("Total Number of Duplicate Elements are - " + TotDup); // this will just give count means even if 1,1,1, count is 1

			//Sublist -- Print  - 			CreatinNG new array is important for this

			ArrayList<Integer> arrinteger = new ArrayList<Integer>
			(Arrays.asList(1,2,3,4,5,6,7,6,9));
					ArrayList<Integer> arrSubList = new ArrayList<Integer>(arrinteger.subList(3,7));//start from 3rd position. print total 7 elements begining from first element
					System.out.println(arrSubList);
			
			//Array conversion to different data type - pending
			//	converting string array to object arrat
					ArrayList<String> stringArrayList44 = new ArrayList<String>(Arrays.asList("A","B","C"));
					Object conToObjArray[] = stringArrayList44.toArray();
					System.out.println("Array conversion " + conToObjArray);
	
					ArrayList<Integer> intarra22 = new ArrayList<Integer>(Arrays.asList(1,1,1,3,5,5,5));
	//how to sort an array
					Collections.sort(intarra22);
					System.out.println("Sorted Array is " + intarra22);
					
	// Compare 2 arrays -element to element comparision - result boolean
					boolean a = intarra22.equals(arrSubList);
					System.out.println("Is array same " + a );
	
	//find out the common elements in 2 array list
					ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java","python","ruby","English"));
					ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java","python","vbscript","English"));
					
					lang1.retainAll(lang2);
					System.out.println("Duplicate Elements inside an array is " + lang1);
				
					
					
					
	}

}

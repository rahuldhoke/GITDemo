package javaCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashMaps {

	public static void main(String[] args) {

		HashMap <String, String> capitalMap = new HashMap <String, String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("USA", "WC");
		capitalMap.put(null, "donkeys mama");

		//Retreive Values from hashmap
		String val1 = capitalMap.get("India"); 
		String valNull = capitalMap.get("India"); // if no key null value is displayed 
		String valNul2 = capitalMap.get(null); // if no key null value is displayed 
		System.out.println(valNul2);
		
		//looping
			//in hasmap looping is on 2 things keys and values
		//to print all keys
			Iterator<String> it = capitalMap.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
					System.out.println(key);
			}
			
		//method 2
			//proper way of printing key and values from hashmap
			//Below will print all keys only 
			Iterator<Entry<String,String>> it1 = capitalMap.entrySet().iterator();
			while(it1.hasNext()) {
				Entry<String,String> entry =it1.next();
				String KeyName = entry.getKey();
				String Keyvalue = entry.getValue();
				System.out.println("----------dei----------------");				
				System.out.println(KeyName + "    " + Keyvalue );

			}
			
		//method 3 - Using java Streams
			capitalMap.forEach((k,v) -> System.out.println(k +  "" + v));
			

	//HashMap Comparision
			HashMap<Integer, String> map1 = new HashMap<Integer,String>();
			map1.put(1, "A");
			map1.put(2, "B");
			map1.put(3, "C");

			HashMap<Integer, String> map2 = new HashMap<Integer,String>();
			map1.put(1, "A");
			map1.put(2, "B");
			map1.put(3, "C");
			
			
			boolean b = map1.equals(map2);
			System.out.println("hashmap comparison  " +  b);
	}
	
	

}

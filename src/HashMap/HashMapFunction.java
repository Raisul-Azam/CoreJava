package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapFunction {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
//		Functionality of the put function
		hashMap.put(1, "Priya");
		hashMap.put(3, "Hyder");
		hashMap.put(7, "kamal");
		hashMap.put(9, "Saif");
		
		System.out.println("HashMap of the given data : "+hashMap);
		
//		functionality of the get() function
		String result = hashMap.get(1);
		System.out.println("Value for the given key is: "+result);
		
//		functionality of the containsKey() function
		System.out.println(hashMap.containsKey(3));
		
//		Functionality of the remove key
		hashMap.remove(3);
		System.out.println("Updated hashmap: "+hashMap);
		
//		Iterating using the for Loop
		System.out.println("Hashmap is: ");
		for(Map.Entry<Integer, String> e: hashMap.entrySet()){
			System.out.println(e.getKey() +":"+ e.getValue());
		}
	}
}

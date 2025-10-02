package corejava;

import java.util.ArrayList;

public class Assigment {

	public static void main(String[] args) {
		
		    
		    ArrayList<String> ar = new ArrayList<String>();
		    ar.add("apple");
			ar.add("banana");
			ar.add("cherry");
			ar.add("mango");
			ar.add("apple");
			
			System.out.println(ar);
			
			ar.remove(0);
			
			System.out.println(ar);
			
			if(ar.contains("orange")){
			    System.out.println("orange is found");
			}
			else{
			    System.out.println("orange is not found");
			}
			
			System.out.println(ar.size());
			
			for(int i =0; i<ar.size(); i++){
			    System.out.println(i + " " + ar.get(i));
			}
		}

}

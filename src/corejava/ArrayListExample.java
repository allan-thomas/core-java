package corejava;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar = new ArrayList<String>();
		

		ar.add("Allan");
		ar.add("Jeemo");

		System.out.println(ar);

		ar.add(0, "nikin");

		System.out.println(ar);
		
		ar.remove(1);
		
		System.out.println(ar);
		
		System.out.println(ar.indexOf("nikin"));
		
		System.out.println(ar.isEmpty());
		
		System.out.println(ar.size());
		
		

	}

}

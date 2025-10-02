package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("India");
		hs.add("Germany");
		hs.add("USA");
		hs.add("India");

		System.out.println(hs);

		// System.out.println(hs.indexOf("USA")); //HashSet does have a way of indexing
		// as it doesn't not record storing data Sequentially
		System.out.println(hs.isEmpty());

		hs.remove("India");
		System.out.println(hs);

		System.out.println(hs.size());

		Iterator<String> i = hs.iterator();
		//System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

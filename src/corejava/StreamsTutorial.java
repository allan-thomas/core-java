package corejava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsTutorial {

//	@Test
	public void regular() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Allan");
		names.add("Nan");
		names.add("Nikin");
		names.add("aghosh");
		names.add("arun");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("A") || names.get(i).startsWith("a"))
				count++;
		}

		System.out.println(count);
	}

//	@Test
	public void streamfilter() {

//		ArrayList<String> names = new ArrayList<String>();
//		
//		
//		names.add("Allan");
//		names.add("Nan");
//		names.add("Nikin");
//		names.add("aghosh");
//		names.add("arun");
		
		List<String> names = Arrays.asList("Allan", "Nan", "Nikin", "Arun");

		/*
		 * System.out.println( names.stream().filter(f->{f.startsWith("A"); return
		 * true;}).count()); long d = Stream.of("Allan", "Nan", "Nikin",
		 * "Arun").filter(f -> { f.startsWith("A"); return true; }).count();
		 * System.out.println(d); names.stream().filter(f -> f.length() >4).forEach(s ->
		 * System.out.println(s));
		 * names.stream().filter(f->f.endsWith("n")).map(f->f.toUpperCase()).forEach(a->
		 * System.out.println(a));
		 */
		names.stream().filter(f->f.startsWith("A")).sorted().map(f->f.toUpperCase()).forEach(s->System.out.println(s));
	}
	
//	@Test
	public void streamCollect() {
		List<String> ls = Arrays.asList("Allan", "Nan", "Nikin", "Arun");
		List<String> modifiedList = ls.stream().filter(f->f.startsWith("A")).sorted().map(f->f.toUpperCase()).collect(Collectors.toList());
		System.out.println(modifiedList.get(0));
	}
	
	@Test 
	public void assignment () {
		List<Integer> numebers1 = Arrays.asList(3,2,2,7,5,1,9,7);
		numebers1.stream().distinct().sorted(Comparator.reverseOrder()).forEach(f->System.out.println(f));
		List<Integer> values2 = numebers1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println (numebers1.stream().anyMatch(a -> a.equals(12)));
	}

}

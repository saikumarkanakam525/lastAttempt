import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test

public class Test1 {

	public void regular() {
		// Count the number of names starts with character "A"
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for (String name : names) {
			if (name.startsWith("A")) {
				count++;

			}
		}
		System.out.println(count);
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekya");
		names.add("Adam");
		names.add("Rama");

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		// Count the number of names starts with character "A"
		Long d = Stream.of("Abhijeet", "Don", "Alekya", "Adam", "Rama").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);

		// Print all the names with length greater than 4

		Stream.of("Abhijeet", "Don", "Alekya", "Adam", "Rama").filter(s -> s.length() > 4).limit(1)
				.forEach(s -> System.out.println(s));

	}

	@Test
	public void streamMap() {
		//print all the names which ends with "A" in Upper case
	
		Stream.of("Abhijeet", "Don", "Alekya", "Adam", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		System.out.println("separator");
		//print all the names starts with "A" in upper case and sorted
		Stream.of("Abhijeet", "Don", "Alekya", "Adam", "Rama").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//Merging 2 different lists
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("sun");
		names1.add("mon");
		names1.add("tues");
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekya");
		names.add("Adam");
		names.add("Rama");
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		
		//newStream.sorted().forEach(s -> System.out.println(s));
		
		boolean flag =newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
	}
	
	@Test
	public void streamCollect() {
		
		List<String> ls = Stream.of("Abhijeet", "Don", "Alekya", "Adam", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(1));
		
		
		List<Integer> values = Arrays.asList(3,3,2,2,5,1,9);
		
		//Print unique numbers
		//values.stream().distinct().forEach(s->System.out.println(s));
		
		//sort the unique numbers
		List<Integer> li =values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(3));
	
	}
	
	
}

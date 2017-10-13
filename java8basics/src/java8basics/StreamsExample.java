package java8basics;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {

		
		List<Person> people = Arrays.asList( new Person("Charles","Dickens",25),
				                       new Person("Vamshi","Muthyapu",30),
				                       new Person("AJ","Abraham",50),
				                       new Person("Steven","Speilberg",70));
		people.stream()
		 .filter(p -> p.getFirstName().startsWith("C"))
		 .forEach(p -> System.out.println(p));
		
		long count = people.stream()
		 .filter(p ->p.getFirstName().startsWith("C"))
		 .count();
		
		System.out.println(count);
		
		//  Lamdas can leverage parallel processing or utilize multiple cores... In the above example we used stream()
		// but if we use parallelstream instead then we are effectively saying do it in your way . I just want the result
	    // below is the parallelstream way
		
		long countNew = people.parallelStream().filter(p->p.getFirstName().startsWith("C")).count();
		System.out.println(countNew);
		

	}

}

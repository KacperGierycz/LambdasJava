package io3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import io.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		
		List<Person> people=Arrays.asList(
				new Person("AKacper1", "DGierycz1",36),
				new Person("BKacper2", "CGierycz2",37),
				new Person("CKacper3", "BGierycz3",38),
				new Person("DKacper4", "AGierycz4",39)				
				);

		/*
		 * people.stream() .filter(p->p.getLastName().startsWith("C"))
		 * .forEach(p->System.out.println(p.getFirstName()));
		 */
		
		 Long cout =people.parallelStream()
		 .filter(p->p.getLastName().startsWith("C"))
		 .count();
		 
		 System.out.println(cout);
		
	}

}

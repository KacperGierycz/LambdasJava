package io3;

import java.util.Arrays;
import java.util.List;

import io.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {

		List<Person> people=Arrays.asList(
				new Person("AKacper1", "DGierycz1",36),
				new Person("BKacper2", "CGierycz2",37),
				new Person("CKacper3", "BGierycz3",38),
				new Person("DKacper4", "AGierycz4",39)				
				);
		
		people.forEach(p->System.out.println(p));
		
	}

}

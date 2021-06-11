package io;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Solution {
	public static void main(String[] args) {

		List<Person> people=Arrays.asList(
				new Person("AKacper1", "DGierycz1",36),
				new Person("BKacper2", "CGierycz2",37),
				new Person("CKacper3", "BGierycz3",38),
				new Person("DKacper4", "AGierycz4",39)				
				);
				
				
				// Step 1 Sort list by last name 
			Collections.sort(people, new Comparator<Person>() {

				@Override
				public int compare(Person o1, Person o2) {
					return o1.getLastName().compareTo(o2.getLastName());
				}
				
			});
		
				//	Step 2 Create a method that prints all elements in  the list
				printAll(people);
			
			
				//	Step 3 Create a method that prints all people that have last name beginning with C				
				printConditionaly(people, new Condition() {

					@Override
					public boolean test(Person p) {
						return p.getLastName().startsWith("C");
					}
					
				});
				
	}

	private static void printConditionaly(List<Person> people, Condition condition ) {
		for(Person p:people) {
			if(condition.test(p)) {
			System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p:people) {
			System.out.println(p);
		}
	}

}

interface Condition{
	boolean test(Person p);
}
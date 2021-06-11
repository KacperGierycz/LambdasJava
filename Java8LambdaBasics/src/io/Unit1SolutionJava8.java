package io;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1SolutionJava8 {


		public static void main(String[] args) {

			List<Person> people=Arrays.asList(
					new Person("AKacper1", "DGierycz1",36),
					new Person("BKacper2", "CGierycz2",37),
					new Person("CKacper3", "BGierycz3",38),
					new Person("DKacper4", "AGierycz4",39)				
					);
					
					
			// Step 1 Sort list by last name 
			Collections.sort(people, ( p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
	
			//	Step 2 Create a method that prints all elements in  the list
			printConditionaly(people, p -> true);
		
		
			//	Step 3 Create a method that prints all people that have last name beginning with C				
			printConditionaly(people, p -> p.getLastName().startsWith("C"));
					
			// Step 4 Create a method with lambda to print all the first name starts with C
			
			printConditionaly(people, p->p.getFirstName().startsWith("C"));
			
		}

		private static void printConditionaly(List<Person> people, Condition condition ) {
			for(Person p:people) {
				if(condition.test(p)) {
				System.out.println(p);
				}
			}			
		}
	}

	/*
	 * interface Condition{ boolean test(Person p); }
	 */


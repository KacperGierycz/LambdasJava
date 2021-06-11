package io3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> people=Arrays.asList(
				new Person("AKacper1", "DGierycz1",36),
				new Person("BKacper2", "CGierycz2",37),
				new Person("CKacper3", "BGierycz3",38),
				new Person("DKacper4", "AGierycz4",39)				
				);
				
				System.out.println("printing all persons");

				performConditionaly(people,p->true,p->System.out.println(p));
	}

//	private static void printConditionaly(List<Person> people, Condition condition ) {
//		for(Person p:people) {
		private static void performConditionaly(List<Person> people, Predicate<Person> predicate, Consumer<Person>consumer  ) {
			for(Person p:people) {	
			
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}			
	}
}
	


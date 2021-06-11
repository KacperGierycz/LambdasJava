package io;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
	StringLenthLambda myLambda = s -> s.length();
	System.out.println(myLambda.getLength("Hello World"));
	printLambda(s->s.length());
	
	}
	
	public static void printLambda(StringLenthLambda l ) {
		System.out.println(l.getLength("Hello World"));
	}
	
	
	interface StringLenthLambda{
		int getLength(String s);
	}
}
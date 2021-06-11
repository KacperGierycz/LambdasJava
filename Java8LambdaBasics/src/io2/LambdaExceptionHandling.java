package io2;

import java.util.function.BiConsumer;

public class LambdaExceptionHandling {

	public static void main(String[] args) {
		
		int[] sumNumbers= {1, 2, 3, 4, 5};
		int key=0;
		
		process(sumNumbers, key, wrapperLambda((v,k)->System.out.println(v/k)));
		
		
	}

	private static void process(int[] sumNumbers,
			int key,BiConsumer<Integer, Integer> consumer) {
		for(int i:sumNumbers) {
			consumer.accept(i, key);
		}

		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (a,b)->{
			
			try {
				consumer.accept(a,b);
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic exception");
			}
	};

}
}
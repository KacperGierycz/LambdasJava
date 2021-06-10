package io;

public class Greeter {
	
	private void greet(Greeting greeting) {
	//	System.out.println("Hello World!"); 
	greeting.perform();
	}

	
	public static void main(String[] args) {
		
		Greeter greeter=new Greeter();
		Greeting helloWorldGreeting = new HalloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		helloWorldGreeting.perform();
		//greeter.greet();
		
		MyLambda myLambdaFunction=() -> System.out.println("Hello World!");
		Greeting myLambdaFunction2=() -> System.out.println("Hello World!");
		MyAdd addFunction=(int a, int b)->a+b;
		
		myLambdaFunction2.perform();
		myLambdaFunction.foo();
	}

}

interface MyLambda{
	void foo();
}

interface MyAdd{
	int add(int x, int y);
}
package io;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Print inside Runable");				
			}
			
		});

		myThread.run();
		
		Thread myLambdaThread=new Thread(() -> System.out.println(
				"Print inside Lambda Runnable"));
		myLambdaThread.run();
	}

}

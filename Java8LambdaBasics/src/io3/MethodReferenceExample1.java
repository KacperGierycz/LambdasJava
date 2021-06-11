package io3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		printMessages();
		
		Thread t =new Thread(()->printMessages());
		Thread t2=new Thread(MethodReferenceExample1::printMessages);
		t.start();
		t2.start();
	}

	
	public static void printMessages() {
		System.out.println("Hello");
		
	}
}

package com.ibs.javafeatures;

public class RunnableExample {

	public static void main(String[] args) {
		Thread mythread= new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("inside runnable");		
			}});
		mythread.run();
		Thread myLambdaThread=new Thread(()->System.out.println("inside lambda runnable"));
	myLambdaThread.run(); 
	}

}

package com.ibs.javafeatures;

public class Greeter {
	public void greet(Greeting greeting) {
		greeting.perform();
		// System.out.println("hii");
	}
	
	// public void chakka(String act) {
	// System.out.println("chakka is here"+act);
	// }

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		//implemented greeting interface by class,logic is given inside class
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		//greeter.greet(helloWorldGreeting);
		Greeting lambdaGreeting=()->System.out.println("Hii");//created a lambda function inline 
		//AddNums addNums=(int a,int b)->a+b;
		//helloWorldGreeting.perform();
		//lambdaGreeting.perform();
		Greeting innerClassGreeting=new Greeting(){//anonymous innerclass-class without name
			public void perform(){
				System.out.println("innerclass greeting");
			}
		};
		//innerClassGreeting.perform();
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		
	}

}
interface MyLambda{
	void foo();
}
interface AddNums{
	int  add(int a,int b);
}


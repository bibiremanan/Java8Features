package com.ibs.javafeatures;

interface Phone {
	void call();
	default void message(){//can define methods in interface using default keyword only in java8
		System.out.println("Send");
	}
}

class AndroidPhone implements Phone {
	public void call() {
		System.out.println("calling");
	}
}

public class DemoInterface {

	public static void main(String[] args) {

		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}

}

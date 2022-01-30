package com.ibs.javafeatures;
interface A{
	void show(int i);
}
public class LambdaDemo {
	public static void main(String args[]){
		A obj;
		obj=(i)->System.out.println("hello"+i);//consumer interface
		obj.show(6);
	}

}

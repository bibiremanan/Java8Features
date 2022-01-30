package com.ibs.javafeatures;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Method Reference
//calling by method
public class FirstCode {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("bibi","unni","Ram");
//		Consumer<String> con=new Consumer<String>(){
//			public void accept(String s){
//				System.out.println(s);
//			}
//		};
		
		names.forEach(System.out::println);//method reference-println is a method in System.out

	}

}

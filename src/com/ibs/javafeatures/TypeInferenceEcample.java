package com.ibs.javafeatures;

public class TypeInferenceEcample {

	public static void main(String[] args) {
		StringLengthLambda myLambda=s->s.length();
		System.out.println(myLambda.getLength("Hellow world"));
		printLambda(s->s.length());
	}
	public static void printLambda(StringLengthLambda l){
		System.out.println(l.getLength("how are you"));
	}

}
interface StringLengthLambda{
	int getLength(String s);
	
}

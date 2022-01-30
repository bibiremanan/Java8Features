package com.ibs.javafeatures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionUsingJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Bibi", "Remanan", 35),
				new Person("Gayathri", "Sudhakaran", 25),
				new Person("Shanthanu", "Unnikrishnan", 15),
				new Person("Maya", "Devi", 42),
				new Person("Kiran", "Vijayan", 55),
				new Person("Babitha", "Vishnu", 55),
				new Person("Jeffin", "James", 26));
		// Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLastname().compareTo(o2.getLastname());
			}

		});
		printAll(people);
		// Printing people whose lastname starts with v
		printLastNameStartsWithV(people);
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getLastname().startsWith("V");
			}

		});
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getFirstname().startsWith("B");
			}

		});

	}

	private static void printLastNameStartsWithV(List<Person> people) {
		for (Person p : people) {
			if (p.getLastname().startsWith("V")) {
				System.out.println(p);
			}
		}

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}

	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

}

interface Condition {
	 boolean test(Person p);
}

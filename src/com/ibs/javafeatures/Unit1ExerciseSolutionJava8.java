package com.ibs.javafeatures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Bibi", "Remanan", 35),
				new Person("Gayathri", "Sudhakaran", 25),
				new Person("Shanthanu", "Unnikrishnan", 15),
				new Person("Maya", "Devi", 42),
				new Person("Kiran", "Vijayan", 55),
				new Person("Babitha", "Vishnu", 55),
				new Person("Jeffin", "James", 26));
		// Sort list by last name
		Collections.sort(people,( p1, p2)->p1.getLastname().compareTo(p2.getLastname()));
		System.out.println("Printing all persons");
		printConditionally(people,p->true);
		// Printing people whose lastname starts with v
		printConditionally(people, p->p.getLastname().startsWith("V"));
		printConditionally(people,p->p.getFirstname().startsWith("B"));

	}

	
	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}

	}

	
}

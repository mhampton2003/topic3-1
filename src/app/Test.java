package app;

import java.util.Arrays;

/**
 * 
 * @author Maya
 *
 */
public class Test {

	/**
	 * Creates person objects and compares and sorts them
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		Person person1 = new Person("Maya", "Hampton", 18);
		Person person2 = new Person("Maya", "Hampton", 18);
		Person person3 = new Person(person1);
		
		person1.walk();
		person1.run();
		System.out.println("Person1 is running: " + person1.isRunning());
		person1.walk();
		System.out.println("Person1 is running: " + person1.isRunning());
		
		Person[] persons = new Person[4];
		persons[0] = new Person("Carter", "Hampton", 15);
		persons[1] = new Person("Sophia", "Janisse", 18);
		persons[2] = new Person("Abigail", "Young", 24);
		persons[3] = new Person("Hannah", "Jenifer", 19);
		
		for (int i = 0; i < 4; ++i) {
			System.out.println(persons[i] + " age: " + persons[i].getAge());
		}
		
		Arrays.sort(persons);
		System.out.println("Persons sorted by age:");
		for (int i = 0; i < 4; ++i) {
			System.out.println(persons[i] + " age: " + persons[i].getAge());
		}
		
		if (person1 == person2) {
			System.out.println("person1 and person2 are identical using '=='");
		}
		else {
			System.out.println("person1 and person2 are not identical using '=='");
		}
		
		if (person1.equals(person2)) {
			System.out.println("person1 and person2 are identical using 'equals()'");
		}
		else {
			System.out.println("person1 and person2 are not identical using 'equals()'");
		}
		
		if (person1.equals(person3)) {
			System.out.println("person1 and person3 are identical using 'equals()'");
		}
		else {
			System.out.println("person1 and person3 are not identical using 'equals()'");
		}
		
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3);

	}

}

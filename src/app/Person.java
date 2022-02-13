package app;

/**
 * 
 * @author Maya
 *
 */
public class Person implements PersonInterface, Comparable<Person>{
	private String firstName;
	private String lastName;
	private boolean running;
	private int age;
	
	/**
	 * Person constructor using first and last name
	 * @param firstName The first name
	 * @param lastName The last name
	 * @param age The age
	 */
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * Person constructor using an already made person object
	 * @param person A created person object
	 */
	public Person(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
		this.age = person.getAge();
	}
	
	/**
	 * Returns the first name of the person
	 * @return firstName The first name as a string
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Returns the last name of the person
	 * @return lastName The last name as a string
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Returns the age of the person
	 * @return age The age as a string
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Overrides the equals() method
	 * Returns the statement that is used and determines whether the 
	 * object's are equal to each other and not the references
	 * @param other An object
	 */
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			System.out.println("I am here in other == this");
			return true;
		}
		if (other == null) {
			System.out.println("I am here in other == null");
			return false;
		}
		if (getClass() != other.getClass()) {
			System.out.println("I am here in getClass() != other.getClass()");
			return false;
		}
		
		Person person = (Person)other;
		return (this.firstName == person.firstName && this.lastName == person.lastName);
	}
	
	/**
	 * Overrides the toString() method
	 * returns the class the person object is in and its first and last name
	 */
	@Override
	public String toString() {
		return "My class is " + getClass() + " " + this.firstName + " " + this.lastName;
	}

	/**
	 * prints out the person is walking
	 * sets running to false
	 */
	public void walk() {
		System.out.println("I am walking");
		running = false;
	}

	/**
	 * prints out the person is running
	 * sets running to true
	 */
	public void run() {
		System.out.println("I am running");
		running = true;
	}

	/**
	 * returns whether the person is running or not
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * overrides the compareTo() method
	 * sorts list of persons by age
	 */
	@Override
	public int compareTo(Person p) {
		return this.age - p.age;
	}

}

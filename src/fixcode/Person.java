package fixcode;
/**
 * A simple model for a person with a name.
 * 
 * @author Pimwalun
 */
public class Person {
	/** the person's full name. */
	public String name;
	
	/**
	 * Initialize a new Person object.
	 * @param name is value for the person's name
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * Get the person's name.
	 * @return person's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set or change the person's name.
	 * @param newname is the person's name
	 */
	public void setName(String newname) {
		this.name = newname;
	}
	
	/**
	 * Compare person's by name.
	 * They are equal if the name matches.
	 * @param other is another Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Object other) {
		if (other == null) 
			return false;
		if (other.getClass() != this.getClass())
			return false;
		Person others = (Person) other;
		if (name.equalsIgnoreCase(others.name))
			return true;
		return false;
	}
	
	/**
	 * Get a string representation of this Person.
	 * @return string representation of this Person
	 */
	public String toString() {
		return "Person " + name;
	}
}

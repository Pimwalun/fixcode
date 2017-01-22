package fixcode;

/**
 * A simple model for a student with a id and name by Person class.
 * 
 * @author Pimwalun
 *
 */
public class Student extends Person {
	private long id;
	
	/**
	 * Initialize a new Student object.
	 * @param name is value for the person's name
	 * @param id is value for the student's id
	 */
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/** 
	 *Return a string representation of this Student. 
	 *@return a string representation of this Student
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * Compare student's by name and id.
	 * They are equal if the name and id matches.
	 * @param other is another Student to compare to this one.
	 * @return true if the name and id are same, false otherwise.
	 */
	public boolean equals(Object other) {
		if (other == null) 
			return false;
		if (other.getClass() != this.getClass())
			return false;
		Student others = (Student) other;
		if (name.equalsIgnoreCase(others.name) && id == others.id)
			return true;
		return false;
	}

	/**
	 * Get the student's id
	 * @return the student' id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Set or change the student's id.
	 * @param id is the student's id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
}

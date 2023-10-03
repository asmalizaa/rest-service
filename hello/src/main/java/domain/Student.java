package domain;

/*
 * OOP concept
 * 	1. encapsulation - data hiding by make it private and provide public methods 
 * 					- getters and setters
 * 	2. inheritance
 * 	3. abstraction
 * 	4. polymorphism
 * 
 * Access modifiers
 * 	1. private - can access within class only
 * 	2. public - can access from anywhere
 * 	3. protected - private but accessible by subclass
 * 	4. default - access within same package
 * 
 */
public class Student {

	// instance variables (since it belongs to each object)
	private int id;
	private String name;
	private String email;

	// class variables
	public static int counter;

	// no-arg argument constructor
	public Student() {
		System.out.println("no-arg argument constructor called");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		// validation
		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("Invalid id: " + id);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

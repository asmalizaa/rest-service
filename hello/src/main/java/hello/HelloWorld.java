package hello;

import java.util.ArrayList;

import domain.Student;

public class HelloWorld {

	public static void testscope() {
		// local variables
		int id = 100;
		System.out.println(id);
	}

	public static void main(String[] args) {

		// create student object
		// class identifier = new class()
		Student stud1 = new Student();
		Student.counter++;
		System.out.println("counter: " + Student.counter);

		// using dot notation to access object's variables
//		stud1.id = 1;
//		stud1.name = "John";
//		stud1.email = "john@example.com";
		
		// use methods instead for better OOP
		stud1.setId(-1);
		stud1.setName("John");
		stud1.setEmail("john@example.com");

		Student stud2 = new Student();
		Student.counter++;
		System.out.println("counter: " + Student.counter);
		
//		stud2.id = 2;
//		stud2.name = "Bob";
//		stud2.email = "bob@example.com";
		
		stud2.setId(2);
		stud2.setName("Bob");
		stud2.setEmail("bob@example.com");

		System.out.println(stud1.getId() + ", " + stud1.getName() + ", " + stud1.getEmail());
		System.out.println(stud2.getId() + ", " + stud2.getName() + ", " + stud2.getEmail());
		
		testscope();

//		System.out.println(id);

		// all variables defined within main method are local variables

		System.out.println("Hello World!");

		ArrayList list = new ArrayList();

		System.out.println("Good afternoon");
		System.out.println("It's easy right?");

		String firstName;
		String firstname;

		// primitive variables
		// syntax
		// datatype identifier [= value];
		int number = 19;
		System.out.println(number);
		long bignum = (long) 19;
		long bignum2 = 19L;

		// int is the default type
		byte a = 2;
		byte b = 3;
		byte c = (byte) (a + b);

		// double is the default type
		double price = 29.99;
		float price2 = 29.99F;

		// use single-quote to define a character variable
		char letter = 'A';

		boolean flag = true;
		flag = false;
	}

}

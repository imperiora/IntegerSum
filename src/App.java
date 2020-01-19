/*class Person {
	String name;
	int age;
	
	void speak() {
		for(int i=0; i<3; i++) {
		
		
		System.out.println("my nameis " + name + " and I am " + age);
	}	
}
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "John Doe";
		person1.age = 69;
		person1.speak();
		
		Person someone = new Person();
		someone.name = "mr X";
		someone.age = 99;
		someone.speak();
		
		System.out.println(person1.name + " " + person1.age);
        System.out.println(someone.name + someone.age);	        
        
	}
	
}
*/

import java.util.Scanner;

public class App {

	public static void main(String[] Strings) {

		Scanner input = new Scanner(System.in);		
		System.out.print("Input an integer between 0 and 1000: ");
		int num = input.nextInt();
		if (num>1000) {
			System.out.print("Input an integer between 0 and 1000: ");
			num = input.nextInt();
		}
		
		int fourthdigit = num % 10;
		int remaining = num / 10;
		
		int thirddigit = remaining % 10;
		remaining = remaining/10;
		
		int seconddigit = remaining % 10;
		remaining = remaining/10;
		
		int firstdigit = remaining % 10;
		remaining = remaining/10;
		
		int sum = fourthdigit + thirddigit + seconddigit + firstdigit;
		
		System.out.println("The sum of all digits in " + num + " is " + sum);
		
				
		
	
	}
}
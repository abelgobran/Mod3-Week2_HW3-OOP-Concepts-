package Mod3Week2HW3OOPConcepts;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please Select person type... ");
		System.out.println("Enter '1' for  Employee \nEnter '2'for Student ");
		int choice = input.nextInt();
		if(choice==1) {
			createEmployee();
		}else if(choice==2) {
			createStudent();
		}
		
		

	}
	

	private static void createStudent() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter ID number ");
		int stud_id = input.nextInt();
		
		System.out.println("Please enter First and last name ");
		String name = input.nextLine();
		
		System.out.println("Please enter Student age ");
		int age = input.nextInt();
		
		System.out.println("Please enter student gender, M,F ");
		char gender = input.next().charAt(0);
		
		System.out.println("Please enter Student grade for first subject ");
		double subject1 = input.nextDouble();
		
		System.out.println("Grade for Second Subject ");
		double subject2 = input.nextDouble();
		
		System.out.println("Grade for third subject");
		double subject3 = input.nextDouble();
		
		System.out.println("information has been recorded ");
		
		Student st1 = new Student(stud_id, name, age, gender, subject1, subject2, subject3);
	}

	private static void createEmployee() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter ID number");
		int id = input.nextInt();
		
		System.out.println("Please enter First and last name");
		String name = input.nextLine();
		
		System.out.println("Please enter Employee age");
		int age = input.nextInt();
		
		System.out.println("Enter Employee gender ");
		char gender = input.next().charAt(0);
		
		System.out.println("Please enter employee salary");
		Double salary = input.nextDouble();
		
		System.out.println("information has been recorded");
		
		Employee emp1 = new Employee(id, name, age, gender, salary);
	}

}

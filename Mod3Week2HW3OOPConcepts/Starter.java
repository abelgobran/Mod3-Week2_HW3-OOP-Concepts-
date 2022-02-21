package Mod3Week2HW3OOPConcepts;

public class Starter {

	public static void main(String[] args) {
		Employee emp1 = new Employee(3,"John",34,'M',200000.00,true);
		Employee emp2 = new Employee(25,"Jane",27,'W',350000.00,false);
		Student st1 = new Student (100,"Ray",45,'M',95.00,88.00,100.00,false);
		Teacher t1 = new Teacher (30000, 80000.00, "Software instructor", "John Doe", 60, 'M',  true);
		//Student st1 = new Student (100,"Ray",45,'M',95.00,88.00,100.00,false);
		
		emp1.display();
		emp2.display();
		st1.display();
		st1.travel();
		t1.display();
		t1.travel();
		System.out.println(t1.toString());
//		emp1.travel();
		
		
		

	}

}

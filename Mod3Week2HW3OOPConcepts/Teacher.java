package Mod3Week2HW3OOPConcepts;

public class Teacher extends Person {
	
	//Properties 
	int teach_id;
	double teach_salary;
	String subject;
	
	// Constructor 
	public Teacher(int id, double salary, String subject, String fullname, int age, char gender, boolean traveling) {
	super( fullname,  age, gender, traveling );
	
	teach_id = id;
	teach_salary = salary;
	this.subject = subject;
	
	}
	
	public void display() {
		System.out.println("This is id "+ teach_id );
		System.out.println("This is salary "+ teach_salary );
		System.out.println("This is teacher  "+ this.subject  );
		System.out.println();
		
		
	}
	
	@Override
	public String toString() {
		return "Teacher [teach_id=" + teach_id + ", teach_salary=" + teach_salary + ", subject=" + subject + ", pname="
				+ pname + ", page=" + page + ", pgender=" + pgender + ", ptraveling=" + ptraveling + "]";
	}

	public void travel() 
	{
		System.out.println("I am driving to campus ");
		
	}
}

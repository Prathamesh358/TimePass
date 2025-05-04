package javapractices;

public class StudentExample {
	
	int studentId;
	String firstName;
	int age;
	
	public StudentExample(int stuId, String fName, int age) {
		this.studentId = stuId;
		this.firstName = fName;
		this.age = age;
	}
	
	void Playing() {
		System.out.println(firstName + " is playing cricket");
	}
	
	void Studying() {
		System.out.println(firstName + " is studying Mathematics having age of " + this.age );
	}
	
	void absent() {
		System.out.println(firstName +" is absent today");
	}

	public static void main(String[] args) {
		
		StudentExample se = new StudentExample(101,"Sagar",19);
		
		se.Playing();
		se.Studying();
		se.absent();
		
	}

}

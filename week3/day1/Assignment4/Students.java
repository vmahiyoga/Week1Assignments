package org.student;

public class Students {

	public static void main(String[] args) {
		//create object for the class Students
		Students stud = new Students();
		stud.getStudentInfo(3121, "Maheshwari V");
		stud.getStudentInfo("vmahiyoga@gmail.com", "9597531166");		
	}

	public void getStudentInfo(int id)
	{
		System.out.println("Student id: "+id);
	}

	//Overload the same method with different arguments
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
	}

	//Overload the same method with different arguments
	public void getStudentInfo(String email, String phone)
	{
		System.out.println("Student email-id: "+email);
		System.out.println("Student Phone Number: "+phone);
	}
	
}

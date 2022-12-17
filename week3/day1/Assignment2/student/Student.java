package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("Student Name: Maheshwari V");
	}
	
	public void studentDept()
	{
		System.out.println("Student Department: CSE");
	}

	public void studentID()
	{
		System.out.println("ID Card Provided: YES");
	}
	
	public static void main(String args[])
	{
		Student student = new Student();
		
		//call the methods that are inherited from College class
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		
		//call the methods that are available in Student class
		student.studentName();
		student.studentDept();
		student.studentID();
		
		//call the methods that are inherited from Department class
		System.out.println(student.deptName(1));
		
	}
}

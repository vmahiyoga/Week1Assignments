package org.department;

import org.college.College;

public class Department extends College{

	public String deptName(int deptCode)
	{
		String dept = "No Department";

		switch(deptCode)
		{
		case 1:
			dept = "Computer Science";
			break;
		case 2:
			dept = "Electrical & Electronics";
			break;
		case 3:
			dept = "Civil";
			break;
		case 4:
			dept = "Mechanical";
			break;

		}
		return dept;
	}

}

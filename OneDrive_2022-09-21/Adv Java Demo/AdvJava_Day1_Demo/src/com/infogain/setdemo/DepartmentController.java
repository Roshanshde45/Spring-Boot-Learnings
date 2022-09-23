//Set example
package com.infogain.setdemo;

import java.util.HashSet;
import java.util.Set;

public class DepartmentController {

	Set<Department> departmentSet;
	public DepartmentController() {
		departmentSet = new HashSet<Department>();
	}

   void add() {
		departmentSet.add(new Department("Accounting", "Pune"));
		departmentSet.add(new Department("Finance", "Noida"));
		departmentSet.add(new Department("IT", "Gurgaon"));
		departmentSet.add(new Department("Human Resources", "Banglore"));

	}

	void display() {
		System.out.println("\n**Departments and Location**\n");
		for (Department dept : departmentSet) {
			System.out.println(dept.getName() + "\t" + dept.getLocation());
		}

	}
	public static void main(String[] args) {
		DepartmentController deptController = new DepartmentController();
		deptController.add();
		deptController.display();

	}

}

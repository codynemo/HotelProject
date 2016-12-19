package src.hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Human {

	private float salary;
	private Department dept;

	public Employee(String first_name, String last_name, long id, float salary) {
		super(first_name, last_name, id);
		this.salary = salary;
	}

	public static double CalcSalary(ArrayList<Employee> e) {
		double t_salary = 0;
		for (int i = 0; i < e.size(); i++) {
			t_salary += e.get(i).salary;
		}
		return t_salary;
	}

	public static void SaveEmployees(ArrayList<Employee> emplist)
			throws FileNotFoundException {
		String mydocpath = Files_Handling.getdocpath();
		File empfile = new File(mydocpath + "\\Hotel System\\Employees.txt");
		PrintWriter p1 = new PrintWriter(empfile);
		for (int i = 0; i < emplist.size(); i++)
			p1.println(emplist.get(i).FiletoString());
		p1.close();
	}

	public static ArrayList<Employee> LoadEmployees()
			throws FileNotFoundException {
		String[] part = new String[4];
		String data;
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		String mydocpath = Files_Handling.getdocpath();
		File empfile = new File(mydocpath + "\\Hotel System\\Employees.txt");
		Scanner in = new Scanner(empfile);
		while (in.hasNextLine()) {
			data = in.nextLine();
			part[0] = data.substring(0, 20).replaceAll(" ", "");
			part[1] = data.substring(26, 46).replaceAll(" ", "");
			part[2] = data.substring(52, 67).replaceAll(" ", "0");
			part[3] = data.substring(73).replaceAll(" ", "0");
			emplist.add(new Employee(part[0], part[1], Long.parseLong(part[2]), Float.parseFloat(part[3])));
		}
		in.close();
		return emplist;
	}

	public String FiletoString() {
		return super.FiletoString() + String.format("//*&//%5.2f", salary);
	}

	public String toString() {
		return super.toString() + "\nSalary : " + this.salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
}

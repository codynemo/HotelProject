
package src.hotel;

import java.util.ArrayList;
import java.util.Iterator;


public class Department {

	private String name;
	private static int total_employee_no=0,total_dept_number=0;
	private Manager manager;
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public Department(String name, Manager manager, ArrayList<Employee> employees) {
		super();
		this.name = name;
		this.manager = manager;
		this.employees = employees;
		total_dept_number++;
		total_employee_no += employees.size();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getTotal_employee_no() {
		return total_employee_no;
	}
	public static void setTotal_employee_no(int total_employee_no) {
		Department.total_employee_no = total_employee_no;
	}
	public static int getTotal_dept_number() {
		return total_dept_number;
	}
	public static void setTotal_dept_number(int total_dept_number) {
		Department.total_dept_number = total_dept_number;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}
	
	public int getEmployeeByFirstName(String name)
	{
		Iterator<Employee> i = employees.iterator();
		int j=0;
		//employees.forEach(action);
		boolean found = false;
		while(i.hasNext() && !found)
		{
			found = name.equalsIgnoreCase(employees.get(j).getFirst_name());
			j++;
		}
		if (found)
			return j;
		else
			return 0;
	}
	
	public int getEmployeeByLastName(String name)
	{
		Iterator<Employee> i = employees.iterator();
		int j=0;
		//employees.forEach(action);
		boolean found = false;
		while(i.hasNext() && !found)
		{
			found = name.equalsIgnoreCase(employees.get(j).getLast_name());
			j++;
		}
		if (found)
			return j;
		else
			return 0;
	}
}

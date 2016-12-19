/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.hotel;

import static java.awt.Frame.MAXIMIZED_BOTH;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Felo computer
 */
public class test {

	private static ArrayList<Employee> employeelist = new ArrayList<Employee>();
	private static ArrayList<Department> departmentlist = new ArrayList<Department>();
	private static ArrayList<Room> roomlist = new ArrayList<>();
	private static ArrayList<Guest> guestlist = new ArrayList<Guest>();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Files_Handling.DirectoryIntialization();
		employeelist = Employee.LoadEmployees();
		roomlist = Room.LoadRooms();
		guestlist = Guest.LoadGuests();
		main_Window.start();
	}

	public static void onExit() {
		try {
			Room.SaveRooms(roomlist);
			Guest.SaveGuests(guestlist);
			Employee.SaveEmployees(employeelist);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Closing");
	}

	public static void newroom(Room c) {
		roomlist.add(c);
	}

	public static ArrayList<Employee> getEmployeelist() {
		return employeelist;
	}

	public static void setEmployeelist(ArrayList<Employee> employeelist) {
		test.employeelist = employeelist;
	}

	public static ArrayList<Department> getDepartmentlist() {
		return departmentlist;
	}

	public static void setDepartmentlist(ArrayList<Department> departmentlist) {
		test.departmentlist = departmentlist;
	}

	public static ArrayList<Room> getRoomlist() {
		return roomlist;
	}

	public static void setRoomlist(ArrayList<Room> roomlist) {
		test.roomlist = roomlist;
	}

	public static Scanner getInput() {
		return input;
	}

	public static void setInput(Scanner input) {
		test.input = input;
	}
	
	public static ArrayList<Guest> getGuestlist() {
		return guestlist;
	}

	public static void addGuest(Guest guest) {
		guestlist.add(guest);
	}

	public static void AddEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeelist.add(employee);
	}

}

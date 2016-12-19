/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author Felo computer
 */
public abstract class Room {
	protected int roomnumber;
	protected int guest;
	protected int floor;
	protected boolean reserved;
	protected String type;
	protected static int k=0;
	protected int id;

	public abstract double calculateprice();

	public static void SaveRooms(ArrayList<Room> rooms)
			throws FileNotFoundException {
		String mydocpath = Files_Handling.getdocpath();
		File roomsfile = new File(mydocpath + "\\Hotel System\\Rooms.txt");
		PrintWriter p1 = new PrintWriter(roomsfile);
		for (int i = 0; i < rooms.size(); i++)
			p1.println(rooms.get(i).FiletoString());
		p1.close();
	}
	
	public static ArrayList<Room> LoadRooms()
			throws FileNotFoundException {
		String[] part = new String[4];
		String data;
		ArrayList<Room> roomlist = new ArrayList<Room>();
		String mydocpath = Files_Handling.getdocpath();
		File roomsfile = new File(mydocpath + "\\Hotel System\\Rooms.txt");
		Scanner in = new Scanner(roomsfile);
		int i=0;
		while (in.hasNextLine()) {
			data = in.nextLine();
			part[0] = data.substring(0,4).replaceAll(" ", "");
			part[1] = data.substring(10, 13).replaceAll(" ", "");
			part[2] = data.substring(19,29).replaceAll(" ", "");
			part[3] = data.substring(35).replaceAll(" ", "");
			if(part[3].equals("Single"))
				roomlist.add(new SingleRoom(Integer.parseInt(part[0]), Integer.parseInt(part[1]), Boolean.parseBoolean(part[2]), part[3]));
			else if(part[3].equals("Double"))
				roomlist.add(new DoubleRoom(Integer.parseInt(part[0]), Integer.parseInt(part[1]), Boolean.parseBoolean(part[2]), part[3]));
			else if(part[3].equals("Suite"))
				roomlist.add(new Suite(Integer.parseInt(part[0]), Integer.parseInt(part[1]), Boolean.parseBoolean(part[2]), part[3]));
			else if(part[3].equals("Conference"))
				roomlist.add(new Conference(Integer.parseInt(part[0]), Integer.parseInt(part[1]),500, Boolean.parseBoolean(part[2]), part[3]));
		}
		in.close();
		return roomlist;
	}
	
	public String FiletoString() {
		return String.format("%4d//*&//%3d//*&//%10s//*&//%s", roomnumber,floor,reserved,type);
	}
}

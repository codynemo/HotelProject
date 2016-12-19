package src.hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Guest extends Human {

	
	
	public Guest(String first_name,String last_name,long id) {
		super(first_name, last_name, id);
	}
	
	public static void SaveGuests(ArrayList<Guest> guestslist)
			throws FileNotFoundException {
		String mydocpath = Files_Handling.getdocpath();
		File guestfile = new File(mydocpath + "\\Hotel System\\Guests.txt");
		PrintWriter p1 = new PrintWriter(guestfile);
		for (int i = 0; i < guestslist.size(); i++)
			p1.println(guestslist.get(i).FiletoString());
		p1.close();
	}
	
	public static ArrayList<Guest> LoadGuests()
			throws FileNotFoundException {
		String[] part = new String[3];
		String data;
		ArrayList<Guest> guestslist = new ArrayList<Guest>();
		String mydocpath = Files_Handling.getdocpath();
		File guestfile = new File(mydocpath + "\\Hotel System\\Guests.txt");
		Scanner in = new Scanner(guestfile);
		while (in.hasNextLine()) {
			data = in.nextLine();
			part[0] = data.substring(0, 20);
			part[1] = data.substring(26, 46);
			part[2] = data.substring(52).replaceAll(" ", "");
			guestslist.add(new Guest(part[0], part[1], Long.parseLong(part[2])));
		}
		in.close();
		return guestslist;
	}
	
        public String toString()
        {
            return (super.toString());
        }
	
}
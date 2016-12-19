/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.hotel;

/**
 *
 * @author Felo computer
 */
public class Conference extends Room {
	private int capasity = 100;
	private double price;

	// private boolean reserved;
	// public String type;
	public void setReserved(boolean reerved) {
		this.reserved = reerved;
	}

	public boolean isReserved() {
		return reserved;
	}

	public Conference(int r_no, int floor, double price, boolean reserved,
			String type) {
		roomnumber = r_no;
		this.floor = floor;
		this.setPrice(price);
		this.reserved = reserved;
		this.type = type;
		id = Room.k;
		Room.k++;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setGest(int gest) {
		if (gest > capasity)
			System.out.println("The numer of people is more than the capasity");
	}

	public String toString() {

		String s = ("the rom number is:" + roomnumber + "\n"
				+ "the floor number is:" + floor + "\n"
				+ "the price of single room is:" + price + "the capasity is" + capasity);
		return s;
	}

	@Override
	public double calculateprice() {
		return (price * roomnumber);
	}

}

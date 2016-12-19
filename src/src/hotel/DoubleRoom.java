
package src.hotel;


public class DoubleRoom extends Room{
private double price;
//private boolean reserved;
//public String type;
    public void setReserved(boolean reerved) {
        this.reserved = reerved;
    }

    public boolean isReserved() {
        return reserved;
    }
     public void setPrice(double p)
    {
    	price=p;
    }

    public String toString()
    {
         
         String s=("the rom number is:"+roomnumber+"\n"+"the floor number is:"+floor+"\n"+
                  "the price of single room is:"+price);
         return s;
    }

    public DoubleRoom(int r_no,int floor,boolean reserved,String type)
	{
		roomnumber = r_no;
		this.floor = floor;
        this.reserved=reserved;
        this.type=type;
        id = Room.k;
        Room.k++;
	}
     
    public void setGest(int gest) {
        if(gest>2)
            System.out.println("The numer of people is more than the capasity");
    }

    @Override
    public double calculateprice()
    {
        return (price*roomnumber);
    }
    //ckek for date and reseravation
}

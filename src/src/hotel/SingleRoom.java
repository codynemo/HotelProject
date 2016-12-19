 
package src.hotel;


public class SingleRoom extends Room{
    private static double price;
   // public String type;
  // private boolean reserved;

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isReserved() {
        return reserved;
    }
    public SingleRoom(int r_no,int floor,boolean reserved,String type)
	{
		roomnumber = r_no;
		this.floor = floor;
        this.reserved=reserved;
        this.type=type;
        id = Room.k;
        Room.k++;
	}
    public void setPrice(double p){
        price=p;
    }
    public void setGest(int gest) {
        if(gest>1)
            System.out.println("The numer of people is more than the capasity");
    }
    public String toString()
    {
         
         String s=("the rom number is:"+roomnumber+"\n"+"the floor number is:"+floor+"\n"+
                  "the price of single room is:"+price);
         return s;
    }
    public double calculateprice ()
    {
        return (1*price);
    }
    
    //chek for date or room erserved
   
}

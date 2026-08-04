/*1. Create a Java application where we have one interface like Movie having fields 
like M. NAME = "RRR" and PRICE 250 Also create a separate abstract 
class 'Theatre having private fields Mneme and price. These values should not be initialized 
directly but we have to initialize by using constructor injection. The abstract class contain
an abstract method display(). Inherit this abstract class in a concrete class like BookMyShow,
where the user provides values while creating the object. Compare the provided values with the 
values defined in the interface. If the values match, print "Ticket Booked Successfully" and 
display the movie name and price using the display() method; otherwise, raise a user-defined 
exception Invalid Details Exception.*/
import java.util.Scanner;
interface Movie{
	String name = "RRR";
	int price  =250; 

}
class InvalidException extends Exception{
	InvalidException(String msg){
	super(msg);
	}
}
abstract class Theatre{

	String mname ;
	int mprice ;

	Theatre(String mname, int mprice){
	this.mname = mname;
	this.mprice = mprice;
	}
	
	String getMname(){
	 return mname;
	}
	int getMprice(){
	 return mprice;
	}
	abstract  void display();
}
class BookMyShow extends Theatre implements Movie{

	BookMyShow(String mname, int mprice){
	super(mname, mprice);
	}	
		
		void display(){
				try{
				    if(getMname().equals(name)&& getMprice()==price){
					System.out.println("booked sucees");
	
					}
					else{
						throw new InvalidException("Invalid movie details");
					}
	
				}
				catch(Exception e){ 
				System.out.print(e.getMessage());
                                 }
		
			}



}


class Main{

public static void main(String [] args){
	Scanner sc = new Scanner(System.in);


BookMyShow bms = new BookMyShow(sc.next(),sc.nextInt());
bms.display();




}







}
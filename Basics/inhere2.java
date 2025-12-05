//2.	Create a java application where we have one Mobile Manufacturing Company, they will design a respective branded mobile with specifications like RAM, ROM, OS Name, OS Version, Camera, Processor, Battery, Display Type, and price then, this mobile will be released into the wholesale market then the price has to increase, from here it will be released into the retail market again price has to increase then from here this mobile will be purchased by the customer, customer has to display all these values with updated price with respect to one user-defined method and then invoke display method under the main method. (Apple.java)

import java.util.Scanner;
class Manufacture{
static Scanner sc = new Scanner(System.in);
int Ram = sc.nextInt();
String Rom = sc.next();
String os = sc.next();
String version = sc.next();
String camera = sc.next();
String processor = sc.next();
String Battery= sc.next();
String Display= sc.next();
double price = sc.nextDouble();
}
class whole extends Manufacture{
double price1 = price+(price*0.1);
}
class retail extends whole{
double price2 = price1+(price1*0.1);
}
class customer extends retail{
 void display(){
System.out.println(Ram);
System.out.println(Rom);
System.out.println(os);
System.out.println(version);
System.out.println(Display);
System.out.println(price2);
}
public static void main(String [] args){
customer c = new customer();
c.display();

}



}

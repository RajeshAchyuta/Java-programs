//1.	create a java application where we have a bank, it will provide customer details like account number, IFSC Code, and ATM Pin No. and available balance to the customer then, the customer has to display all these values with respect to one user-defined method and then invoke that method under the main method. (I.java)

import java.util.Scanner;
class Bank{
static Scanner sc = new Scanner(System.in);
long acNo=sc.nextLong();
String IFSC = sc.next();
int pin = sc.nextInt();
double ab =sc.nextDouble();
}
class Customer extends Bank{

void display(){
System.out.println(acNo);
System.out.println(IFSC);
System.out.println(pin);
System.out.println(ab);

}
public static void main(String [] args){
Customer c1 = new Customer();
c1.display();
}
}
//Create Java Application where we have one class it contains one non-static method m1 having a parameter integer and it is going to return an integer value and then, invoke this method under the main method by providing dynamic input. ( Integral.java)

import java.util.Scanner;

class Example{

 int m1(int i){
 return i ;
}
public static void main(String [] args){
Scanner s = new Scanner(System.in);
Example e = new Example();
System.out.println("Enter any value");

int i = s.nextInt();
System.out.println(e.m1(i));
}
}










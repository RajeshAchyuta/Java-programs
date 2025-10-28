//12.	Create one java application where we have one class it contains one non-static method m1 having parameter character and it is going to a Boolean value, invoke this method under main by providing dynamic input. (abba.java)  


import java.util.Scanner;
class Example{

 static Scanner sc = new Scanner(System.in);

boolean m1(char c ){
System.out.println(c);
return sc.nextBoolean();
}
 
public static void main(String [] args){
 
Example e = new Example();
System.out.println(e.m1(sc.next().charAt(0)));



}
}
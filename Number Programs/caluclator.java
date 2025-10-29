//6	Write a program to perform simple math based on the user inputs by using Switch condition.(+ , - , * , /).

import java.util.Scanner;
class Caluclator{
 static Scanner sc = new Scanner(System.in);
public static void main(String [] args){
System.out.println("Enter  any + - % *");
char c = sc.next().charAt(0);
System.out.println("Enter  a value");
int a = sc.nextInt();
System.out.println("Enter  b value");
int b = sc.nextInt();
switch(c){
case   '+' : System.out.println(a+b);
             break;
case   '-' : System.out.println(a-b);
             break;

case   '*' : System.out.println(a*b);
             break;

case   '%' : System.out.println(a%b);
             break;

case   '/' : System.out.println(a/b);
             break;
default    : System.out.println("wrong input");
            break;

}



}

}

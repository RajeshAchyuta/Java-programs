//4	create a java application where we need to satisfy this keyword at variable, method, and constructor levels. (X.java)
 

import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);
int a =10;
 
Example(int a){
System.out.println(a);
System.out.println(this.a);
}
void m1(){
System.out.println("jwckjhwekjcbkjhebkjber");
}
Example(){
this(sc.nextInt());
this.m1();
}
public static void main(String [] args){
Example e = new Example();
}
}
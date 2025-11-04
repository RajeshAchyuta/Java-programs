//28.	Create a java application where we have one class, it contains one static method m1 having no parameters and returns a class variable, nonstatic method m2 having a parameter class variable and returns a boolean, nonstatic method m3 having a parameter boolean and returns a String value, nonstatic method m4 having parameter integer and returns float value, then invoke all the methods under main by providing dynamic inputs and without creating object directly or without using object reference directly.

import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);

static Example m1(){
return new Example();
}

Boolean m2(Example e){
System.out.println(e);
return sc.nextBoolean();
}
String m3(boolean b){
System.out.println(b);
return sc.next();
}

float m4(int a){
System.out.println(a);
return sc.nextFloat();
}
public static void main(String [] args){
m1();
System.out.println(m1().m2(new Example()));
System.out.println(m1().m3(sc.nextBoolean()));
System.out.println(m1().m4(sc.nextInt()));


}
}
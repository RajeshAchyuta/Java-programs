//4.	Create a java application where we have one abstract class, it contains 2 abstract methods, and inherit this class into another abstract class that contains 2 more abstract methods, one defined method, and one parameterized constructor, then inherit this class into a concrete class, provide partial functionality for the first abstract class and complete functionality for second abstract class and then invoke all the properties under the main by providing dynamic inputs

import java.util.Scanner;
abstract class A{
abstract void m1(int a);
abstract void m2(String s);
}
abstract class B extends A{
abstract void m3(float f);
abstract void m4(double d);
void m5(){
System.out.println("this is m5 in class B");
}
B(int a){
System.out.println(a);
}
}

class C extends B{
static Scanner sc = new Scanner(System.in);
C(){
super(sc.nextInt());
}
void m1(int a){
System.out.println(a);
}

void m3(float f){
System.out.println(f);
}
 void m4(double d){
System.out.println(d);
}

 void m2(String s){
System.out.println(s);
}
public static void main(String [] args){

C c = new C();
c.m1(sc.nextInt());
c.m2(sc.next());
c.m3(sc.nextFloat());
c.m4(sc.nextDouble());
}
}

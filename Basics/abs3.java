//3.	Create a java application where we have one abstract class which contains 2 abstract methods one defined method and one parameterized constructor, inherit this class into a concrete class and provide functionality for these abstract methods and invoke all the properties under the main method by providing Dynamic inputs.

import java.util.Scanner;
abstract class A{

abstract void m1(int a);

abstract void m2(int b);

void m3(){
System.out.println("this is m3 in abstract class A");
}

A(int a){
System.out.println(a);
}

}
class B extends A{
static Scanner  sc = new Scanner(System.in);


void m1(int a){
System.out.println(a);
}
void m2(int b){
System.out.println(b);
}

B(){
super(sc.nextInt());

}
public static void main(String [] args){
B b = new B();
b.m1(sc.nextInt());
b.m2(sc.nextInt());
b.m3();

}
}


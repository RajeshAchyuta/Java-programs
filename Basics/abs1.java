//1	Create a java application where we have one abstract class which contains 2 abstract methods, inherit this class into a concrete class and provide functionality for these abstract methods and invoke all the properties under the main method by providing Dynamic inputs.
import java.util.Scanner;
abstract class A{

abstract void m1(int a);
abstract void m2(String b);
}
class B extends A{

void m1(int a){
System.out.println(a);
}
void m2(String b){
System.out.println(b);
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
B b = new B();
b.m1(sc.nextInt());
b.m2(sc.next());
}
}
//2	Create a java application where we have one abstract class which contains 2 abstract methods and one defined method, inherit this class into a concrete class and provide functionality for these abstract methods and invoke all the properties under the main method by providing Dynamic inputs.

 import java.util.Scanner;
 abstract class A{
abstract void m1(String s);
abstract void m2(int a);
void m3(){
System.out.println("this is m3 defined methood");
}
}
class B extends A{
void m1(String s){
System.out.println(s);
}
void m2(int  a){
System.out.println(a);
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
B b = new B();
b.m1(sc.next());
b.m2(sc.nextInt());
b.m3();
}
}
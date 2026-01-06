//6.	Create a java application where we have one abstract class, which contains one parameterized constructor, one defined method, and two abstract methods, we also have one concrete class which contains one defined method and one parameterized constructor, then inherit both these classes into another concrete class to provide functionality for abstract methods and invoke all the properties under main method by providing dynamic inputs.


import java.util.Scanner;
abstract class A{
A(int a){
System.out.println(a);
}
void m1(int a){
System.out.println(a);
}
abstract void m2();
abstract  void m3();
}


class B{
void m4(int a){
System.out.println(a);
}
B(int a){
System.out.println(a);
}
}


class C extends A{
 static Scanner sc = new Scanner(System.in);
C(){
 super(sc.nextInt());
}
 void m2(){
System.out.println("this is m2");
  }
 void m3(){
System.out.println("this is m3");

}

public static void main(String [] args){
 B b = new B(sc.nextInt());
C c = new C();
 c.m1(sc.nextInt());
c.m2();
c.m3();
b.m4(sc.nextInt());
}
}
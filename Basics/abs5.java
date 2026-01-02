//5.	Create a java application where we have one concrete class, it contains one parameterized constructor and one defined method, inherit this class into an abstract class that contains one parameterized constructor, one defined method, and two abstract methods, and inherit this class into another concrete class to provide functionality and then invoke all the properties under main method by providing dynamic inputs.



import java.util.Scanner;
class A{
    A(int a){
     System.out.println(a);
     } 
    void m1(String s){
    System.out.println(s);
   }
}

abstract class B extends A{
static Scanner sc = new Scanner(System.in);

B(int a){
super(sc.nextInt());
System.out.println(a);
}

 void m2(float f){
System.out.println(f);
}
abstract void m3(int a);
abstract void m4(String  st);
}


class C extends B{
static Scanner sc = new Scanner(System.in);
C(){
super(sc.nextInt());
}
void m3(int a){
System.out.println(a);
}

void m4(String st){
System.out.println(st);
}

public static void main(String [] args){
C c = new C();
c.m1(sc.next());
c.m2(sc.nextFloat());
c.m3(sc.nextInt());
c.m4(sc.next());

}
}
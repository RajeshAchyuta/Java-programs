//7.	Create a Java app where we have one class it contains one DC then inherit this class into the DC of another class then inherit this class into the PC of another class and then this class into the PC of another class and then inherit this class into the DC of another class. then if we invoke the bottommost derived class constructor under the main method from there it has to invoke intermediate base class constructors by using the super keyword and then from there it has to invoke top most base class constructor by using a super keyword by giving dynamic inputs.


import java.util.Scanner;
class A{
static Scanner sc = new Scanner(System.in);
A(){
System.out.println("tihis is class A");
}
}

class B extends A{
B(){
super();
System.out.println("tihis is class B");
}
}
class C extends B{
C(int a ){
super();
System.out.println(a);
}
}
class D extends C{
D(String str){
super(sc.nextInt());
System.out.println(str);
}
}
class E extends D{
E(){
super(sc.next());
System.out.println("this is class D");
}
public static void main(String [] args){
E e = new E();
}
}
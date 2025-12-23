import java.util.Scanner;
class A{
static Scanner sc = new Scanner(System.in);

 void m1(){
System.out.println("this is m1 method in A class ");
}
}
 class B extends A{
void m1(){
super.m1();
System.out.println("this is m1 method in B class");
}
public static void main(String [] args){
B b = new B();
b.m1();

}
}
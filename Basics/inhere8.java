//8.	create a java application where we need to satisfy both this and the super keyword at the variable method and constructor levels. (TS.java)
import java.util.Scanner;
class A{
static Scanner sc = new Scanner(System.in);
int a =10;
A(int a){
System.out.println(a);
System.out.println(this.a);
}
A(){
this(sc.nextInt());
}




}
class B extends A{

int a = 40;
void m1(){
System.out.println(a);
System.out.println(super.a);
}
B(){
super();
System.out.println("this is b  default comsu");
}
public static void main(String [] args){
new B().m1();

}
}
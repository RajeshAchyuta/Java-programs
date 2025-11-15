//6.	Create a Java Application where we have one static variable integer, two non-static variables Boolean and double, one non static method with parameter char and returns long value, a default constructor and a parameterized constructor. then invoke all the properties under main by providing dynamic inputs. 


import java.util.Scanner;
class Example{
static Scanner sc =new Scanner(System.in);
static int a =sc.nextInt();
boolean b =sc.nextBoolean();
double d = sc.nextDouble();

int m1(char c){
System.out.println(c);
return sc.nextInt();
}

Example(){
System.out.println("bdcjhgekhgcek");
}
Example(int a){
System.out.println(a);
}
public static void main(String [] args){
Example e1 = new Example();
System.out.println(e1.m1(sc.next().charAt(0)));
System.out.println(Example.a);
System.out.println(e1.b);
System.out.println(e1.d);
Example e2 = new Example(sc.nextInt());
System.out.println(e2.b);
System.out.println(e2.d);
} 

}
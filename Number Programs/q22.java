//18	Create a java application where we have one class, it contains methods like m1 having parameter int and it is going returns a string value, method m2 having parameter boolean and it is going returns the m1’s return value as the return type, method m3 having parameter float and it is going to return a boolean value, method m4 having parameter char and it is going to returns the m3’s boolean value as return type then invoke m2 and m4 methods under main by providing dynamic inputs.

import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);

String  m1(int a){
 System.out.println(a);
 sc.nextLine();
 return sc.nextLine(); 
}
String m2(boolean b){
System.out.println(b);
return (m1(sc.nextInt()));
}
boolean m3(float f){
System.out.println(f);
return sc.nextBoolean();
}
boolean  m4(char c){
 System.out.println(c);
 return m3(sc.nextFloat());

}
public static void main(String [] args){
Example e = new Example();
System.out.println(e.m2(sc.nextBoolean()));
System.out.println(e.m4(sc.next().charAt(0)));

}

}
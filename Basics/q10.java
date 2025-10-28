//Create a java application where we have one class, it contains a non-static method m1 having parameter float and returns nothing. A static method m2 having parameter integer returns nothing. A non-static method m3 having parameter Boolean returns nothing. Then invoke all these methods under main by providing dynamic inputs.


import java.util.Scanner;
class J {
  
 void m1(float f){
 System.out.println(f);
}

 void m2(int a){
System.out.println(a);
}
 
 void m3(Boolean b){
System.out.println(b);
}
 public static void main(String [] args){
  Scanner s = new Scanner(System.in);
  J j =new J();

System.out.println("Enter a float value");
float f = s.nextFloat();
  
System.out.println("Enter a int value");
int a = s.nextInt();

 System.out.println("Enter a boolean value");
boolean b= s.nextBoolean();

j.m1(f);
j.m2(a);
j.m3(b);



}

}
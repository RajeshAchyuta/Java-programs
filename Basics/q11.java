//Create Java Application where we have one class it contains one non-static method m1 having parameters float and string, it has to print both values and it returns nothing, one static method m2 having parameters Boolean and long, has to print both values and it returns nothing, one non-static method m3 having parameters character and integer, it has to print both values and it returns nothing then invoke all these methods under the main by providing dynamic inputs(Mixed.java)


import java.util.Scanner;
class Example{
  
void m1(float f , String st){
  System.out.println(f);
System.out.println(st);
  }
 
void m2(boolean b , long l){
 System.out.println(b);
 System.out.println(l);
}

 void m3(int i){
 System.out.println(i);
}


public static void main(String [] arg){
Scanner s = new Scanner(System.in);
Example e = new Example();

System.out.println("Enter floating ue");
float f = s.nextFloat();

System.out.println("Enter string value");
String st =s.nextLine();

System.out.println("Enter Boolean value");
Boolean b = s.nextBoolean();

System.out.println("Enter longer lue");
long l =s.nextLong();

System.out.println("Enter integer value");
int i =s.nextInt();

e.m1(f,st);
e.m2(b,l);
e.m3(i);
}
}

















  





 
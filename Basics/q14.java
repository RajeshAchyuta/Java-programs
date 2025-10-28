//  10 .Create a Java Application where we have one class, it contains one non-static method m1 with parameter int and returns a Boolean value, and a static method m2 with parameter float and returns a character value, then invoke both the methods under the main method by providing dynamic inputs.

import java.util.Scanner;
class Example{
 Scanner sc = new Scanner(System.in);

 boolean  m1(int a){
 System.out.println(a);
 return sc.nextBoolean();
}

 char m2(float f){
 System.out.println(f);
 return sc.next().charAt(0); 
}

public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 Example e  = new Example();
System.out.println(e.m1(sc.nextInt()));
System.out.println(e.m2(sc.nextFloat()));




}



}
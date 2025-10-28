// 13.	Create a java application where we have one class it contains one non-static method m1 having the parameter String and is going to return an integer value, and a static method m2 having the parameter Boolean and it is going to return a float value, a non-static method m3 having parameter character and it is going to return a double value, then invoke all these methods under the main by providing dynamic inputs for both parameters and return types. (Blah.java)


import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);
 
 int m1(String str){
 System.out.println("ENETR ANY STRING");
 System.out.println(str);
 System.out.println("ENETR ANY INT");
 return sc.nextInt();
 }
 
 static float m2(boolean b){
 System.out.println(b);
 return sc.nextFloat();
}

double m3(char c){
System.out.println(c);
return sc.nextDouble();
}
public static void main(String [] args){
 Example e  = new Example();
System.out.println(e.m1(sc.nextLine()));
System.out.println(e.m2(sc.nextBoolean()));
System.out.println(e.m3(sc.next().charAt(0)));



}


}

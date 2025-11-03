//23.	Create a java application where we have one class it contains methods like M1 does not have any parameter and it has to return a float value, method M2 which does not have any parameter and returns a Boolean value then invoke method M1 under M2 and then invoke method M2 under the main method by providing dynamic inputs (Bahubali.java)


import java.util.Scanner;
 class Example{
 static Scanner sc = new Scanner(System.in);


float m1(){
System.out.println("no parameters in this meathood");
return sc.nextFloat();
}
boolean m2(){
System.out.println("there is no parametrs");
System.out.println(m1());
return sc.nextBoolean();
}
public static void main(String [] args){
Example e = new Example();
 System.out.println(e.m2());


}
}
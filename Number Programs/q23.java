//19Create a java application where we have one class it contains methods like M1 having a parameter string and it is going to return a Boolean value, method M2 has a parameter float and it is going to return nothing then invoke method M1 under M2 and then M2 under the main method by providing dynamic inputs. //(Nylon.java).

import java.util.Scanner;
class Example{
 static Scanner sc = new Scanner(System.in);

Boolean m1(String str){
System.out.println(str);
return sc.nextBoolean();
}
void m2(float f){
System.out.println(f);
sc.nextLine();
System.out.println(m1(sc.nextLine()));
}
public static void main(String [] args){
Example e = new Example();
 e.m2(sc.nextFloat());


}
}
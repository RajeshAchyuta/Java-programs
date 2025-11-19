//2	create java application where we have one class it contains three methods m1 has a parameter integer and it is going to returns a String value, method m2 having parameter float and it is going to return boolean value and method m3 having parameter string and it is going to return double value then invoke m3 under main method, m2 under m3 and m1 under m2 by using this keyword with dynamic inputs. (this.java)

import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);

 String m1(int a){
System.out.println(a);
return sc.next();
}

boolean m2(float f){
System.out.println(f);
System.out.println(this.m1(sc.nextInt()));
return sc.nextBoolean();
} 

double m3(String s){
System.out.println(s);
System.out.println(this.m2(sc.nextFloat()));
return sc.nextDouble();
}
public static void main(String [] args){
Example e = new Example();
System.out.println(e.m3(sc.next()));
}
}
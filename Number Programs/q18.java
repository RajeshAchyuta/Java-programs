//14.	Create a java application where we have one class, it contains one non-static method like m1 having a parameter integer and is going to return nothing, the nonstatic method m2 has a parameter string and it is going to return nothing, nonstatic method m3 has a parameter float and it returns nothing, nonstatic method m4 having parameter boolean and it is going to return nothing, nonstatic method m5 having parameter double and it returns nothing. then invoke m1 method under m2, m2 method under m3, m3 under m4, m4 under m5 and m5 under main method by providing dynamic input (Shashi.java)

import java.util.Scanner;
class Example{
 static Scanner sc =new Scanner(System.in);

void m1(int a){
System.out.println(a);
}

void m2(String  str){
System.out.println(str);
m1(sc.nextInt());
}

void m3(float  f){
System.out.println(f);
sc.nextLine();
m2(sc.nextLine());
}

void m4(boolean b){
System.out.println(b);
m3(sc.nextFloat());
}

void m5(double d){
System.out.println(d);
m4(sc.nextBoolean());
}

public static void main(String [] args){
Example e = new Example();
e.m5(sc.nextDouble());


}



}





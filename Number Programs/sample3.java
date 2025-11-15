//CREATE A JAVA APPLICATION WHERE  WE  HAVE ONE CLASS IT CONTAINS 3 NON STATIC VARIABLES INT,CHAR,FLOAT WE ALSO HAVE 3 STATIC VARIABLES BOOLEAN,STRING,DOUBLE.WE ALSO HAVE NON STATIC METHOD M1 HAVING NO PARAMETERS RETURNS NOTHING THE WE HAVE STATIC METHOD M2 NO PARAMETERS AND NO RETURN TYPE PRINT ALL THE INSTANCE VARIABLES AND STATIC VARIABLE VALUEIN THE BOTH M1 AND M2 METHODS
//INVOKE M1 AND M2 UNDER THE MAIN METHOD.

import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);
static Example e = new Example();
int a =sc.nextInt();
char c =sc.next().charAt(0);
float f =sc.nextFloat();
static boolean b =sc.nextBoolean();
static String str =sc.next();
static double d = sc.nextDouble();


void m1(){
System.out.println(a);
System.out.println(c);
System.out.println(f);
System.out.println(b);
System.out.println(str);
System.out.println(d);
}

static void m2(){

System.out.println(e.a);
System.out.println(e.c);
System.out.println(e.f);
System.out.println(b);
System.out.println(str);
System.out.println(d);
}
public static void main(String [] args){

e.m1();
m2();


}
}
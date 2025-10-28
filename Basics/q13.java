//9.  Create Java Application where we have one class, it contains one static method like m2, having parameter String and it is going to return String value then invoke this method under main by providing dynamic input (W.java)


import java.util.Scanner;
class Example{

static String m2(String Str){
 return Str;
}
 public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
System.out.println("enter a string value");
String str = sc.next();
System.out.println(Example.m2(str));

}
}

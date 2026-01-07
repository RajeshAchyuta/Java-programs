//3.	Create a java application where we have three interfaces with one abstract method each, inherit all these interfaces at a time into a concrete class to provide functionality for abstract methods and invoke all the methods under main by providing dynamic inputs.

import java.util.Scanner;
interface I1{
    int m1(String s);
}
interface I2 extends I1{
    String  m2(int a);
}
interface I3 extends I2{
    float m3(boolean b);
}
class A implements I3{
   static  Scanner sc = new Scanner(System.in);
  public int m1(String s){
 System.out.println(s);
 return sc.nextInt();
}
 public String m2(int a){
 System.out.println(a );
  return sc.next();
}
 public float m3(boolean b){
 System.out.println(b);
  return sc.nextFloat();
}
  public static void main(String [] args){
 A a = new A();
System.out.println(a.m1(sc.next()));
System.out.println(a.m2(sc.nextInt()));
System.out.println(a.m3(sc.nextBoolean()));

}

}



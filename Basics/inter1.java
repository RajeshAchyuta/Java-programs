//1.	Create a java application where we have one interface which contains two abstract methods, inherit this interface into one concrete class to provide functionality for abstract methods, and invoke these methods under main by providing dynamic inputs.

import java.util.Scanner;
interface I{
 
       int  m1(String s);
       boolean m2(int a);
}
class A implements I{
   static Scanner sc = new Scanner(System.in);
    public int m1(String s){
      System.out.println(s);
       return (sc.nextInt());
     }
     public boolean m2(int a){
      System.out.println(a);
       return (sc.nextBoolean());
     }
    public static void main(String [] args){
      A a=new A();
   System.out.println(a.m1(sc.next()));
   System.out.println(a.m2(sc.nextInt()));
 
}

}
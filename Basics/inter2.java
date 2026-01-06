//2.	Create a java application where we have one interface which contains two abstract methods and one defined method, inherit this interface into one concrete class to provide functionality for abstract methods and invoke these methods under main by providing dynamic inputs.


import java.util.Scanner;
interface I{
static Scanner sc = new Scanner(System.in);
    void m1();
    void m2();
   static int m3(String s){
 System.out.println(s);
 return sc.nextInt();
}
}
 class A implements I{
  //static Scanner sc = new Scanner(System.in);
    public void m1(){
       System.out.println("this is m1");
  }
    public void m2(){
       System.out.println("this is m2");
   }
public static void main(String [] args){
      
      A a =new A();
    a.m1();
    a.m1();
   System.out.println(I.m3(sc.next()));
    }
  }
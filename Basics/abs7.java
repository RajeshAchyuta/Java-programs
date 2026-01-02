//7.	Create a java application where we have one abstract class which contains three abstract methods and one parameterized constructor, inherit this class into three different concrete classes, and provide functionalities for all abstract methods in each class. We also have one concrete class test which contains a method display with parameter as Abstract class object and returns Abstract class,  invoke this method under main with the appropriate object input as a parameter and then this method has to invoke all the abstract class’ properties with respect to the parameter passed statically.


// UPCASTING : CONVERTING CHILD CLASS OBJECT TO THE PARENT CLASS REFERENCE.

import java.util.Scanner;
abstract  class ab{
     abstract String m1(int a);
     abstract float m2(char a);
     abstract double m3(String a);
     ab(int a){
        System.out.println(a);
      }   
}
 class A extends ab{

      A(){
     super(69);
       }
   String m1(int a){
   System.out.println(a);
    return "Rajesh";
   }

   float m2(char a){
   System.out.println(a);
    return 334.4f;
   }

    double m3(String a){
   System.out.println(a);
    return 2344.456;
   }


}
class B extends ab{

      B(){
        super(34);
       }
   String m1(int a){
   System.out.println(a);
    return "Rajesh";
   }

   float m2(char a){
   System.out.println(a);
    return 334.4f;
   }

    double m3(String a){
   System.out.println(a);
    return 2344.456;
   }


}

class C extends ab{

      C(){
     super(78);
       }
   String m1(int a){
   System.out.println(a);
    return "Rajesh";
   }

   float m2(char a){
   System.out.println(a);
    return 334.4f;
   }

    double m3(String a){
   System.out.println(a);
    return 2344.456;
   }


}

class Test{
 ab  dispaly(ab x){
System.out.println(x.m1(34));
System.out.println(x.m2('A'));
System.out.println(x.m3("nanna"));
return x;
}
public static void main(String [] args){
     Test t = new Test();

  ab a = new A();
  ab b = new B();
  ab c = new C();
System.out.println(t.dispaly(a));
System.out.println(t.dispaly(b));
System.out.println(t.dispaly(c));

}
 }
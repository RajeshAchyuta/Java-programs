//8.	Create a java application where we have one abstract class which contains three abstract methods and one parameterized constructor, inherit this class into three different concrete classes, and provide functionalities for all abstract methods in each class. We also have one concrete class test which contains a method display with parameter and Abstract class object and returns Abstract class,  invoke this method under main with the appropriate object input as a parameter and then this method has to invoke all the abstractct class’ properties with respect to the parameter passed Dynamically.


import java.util.Scanner;
abstract  class ab{
    static Scanner sc = new Scanner(System.in);
     abstract String m1(int a);
     abstract float m2(char a);
     abstract double m3(String a);
     ab(int a){
        System.out.println(a);
      }   
}
 class A extends ab{

      A(){
     super(sc.nextInt());
       }
   String m1(int a){
   System.out.println(a);
    return sc.next();
   }

   float m2(char a){
   System.out.println(a);
    return sc.nextFloat();
   }

    double m3(String a){
   System.out.println(a);
    return sc.nextDouble();
   }


}
class B extends ab{

      B(){
        super(sc.nextInt());
       }
   String m1(int a){
   System.out.println(a);
    return sc.next();
   }

   float m2(char a){
   System.out.println(a);
    return sc.nextFloat();
   }

    double m3(String a){
   System.out.println(a);
    return sc.nextDouble();
   }


}

class C extends ab{

      C(){
     super(sc.nextInt());
       }
   String m1(int a){
   System.out.println(a);
    return sc.next();
   }

   float m2(char a){
   System.out.println(a);
    return sc.nextFloat();
   }

    double m3(String a){
   System.out.println(a);
    return sc.nextDouble();
   }


}

class Test{
static Scanner sc = new Scanner(System.in);
 ab  dispaly(ab x){
System.out.println(x.m1(sc.nextInt()));
System.out.println(x.m2(sc.next().charAt(0)));
System.out.println(x.m3(sc.next()));
return x;
}
public static void main(String [] args){
     Test t = new Test();
System.out.println("Enter a choice for which class are you executed !");
int n =sc.nextInt();
switch(n){
case 1 : ab a = new A();
         System.out.println(t.dispaly(a));
         break;
case 2 : ab b = new B();
         System.out.println(t.dispaly(b));
         break;
 case 3: ab c = new C();
         System.out.println(t.dispaly(c));
         break;
 default:System.out.print("invaid choice");
}
  
}
 }
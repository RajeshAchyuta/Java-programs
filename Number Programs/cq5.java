//5.	Create a java app where we have one class, it contains a default constructor, double parameterized constructor, Tripple parameterized constructor, methods like m1, m2, and m3 with parameters and return types then invoke all constructors under main by providing dynamic inputs, invoke m1 under default constructor, m2 under double parameterized constructor and m3 under Tripple parameterized constructor by giving dynamic inputs. (D.java)

import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);

Example(){
System.out.println(m1(sc.nextInt()));
System.out.println("The default constructor");
}

Example(int a, float f){
System.out.println(m2(sc.nextInt()));
System.out.println(a);
System.out.println(f);
}

Example(int a ,float f, String str){
System.out.println(m3(sc.nextInt()));
System.out.println(a);
System.out.println(f);
System.out.println(str);

}

String m1(int a){
System.out.println(a);
return sc.next();
}
String m2(int a){
System.out.println(a);
return sc.next();
}
String m3(int a){
System.out.println(a);
return sc.next();
}

public static void main(String [] args){
Example e1 = new Example();
Example e2 = new Example(sc.nextInt(),sc.nextFloat());
Example e3 = new Example(sc.nextInt(),sc.nextFloat(),sc.next());

}

}
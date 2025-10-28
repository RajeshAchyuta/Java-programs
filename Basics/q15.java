// 11. Create a Java Application where we have one class, it contains methods like static m1 having parameter Boolean which is going to return a Boolean value. non-static method m2 having parameter character which is going to return character value. static method m3 having parameter double which is going to return a double value. non-static method m4 having parameter long which is going to return a long value. static method m5 having parameter float which is going to return float value non-static method m6 having parameter String which is going to return String value. then invoke all these methods under the main method by providing dynamic inputs. (Mixture.java)

import java.util.Scanner;
class Example{

 static Scanner sc = new Scanner(System.in);
 
 boolean m1(boolean b){
 System.out.println(b);
 return sc.nextBoolean();
}


char m2(char c){
 System.out.println(c);
 return sc.next().charAt(0);
}

 static double m3(double d){
 System.out.println(d);
 return sc.nextDouble();
}


long m4(long l){
 System.out.println(l);
 return sc.nextLong();
}

static float m5(float f){
 System.out.println(f);
 return sc.nextLong();
}

public static void main(String [] args){
Example e = new Example();
System.out.println(e.m1(sc.nextBoolean()));
System.out.println(e.m2(sc.next().charAt(0)));
System.out.println(Example.m3(sc.nextDouble()));
System.out.println(e.m4(sc.nextLong()));
System.out.println(Example.m5(sc.nextFloat()));

}

}
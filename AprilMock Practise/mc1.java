import java.util.Scanner;
abstract class ab {

 static Scanner sc = new Scanner(System.in);

	int m1(String s){
	System.out.println(s);
	return sc.nextInt();
	}
	String  m2(int a){
	System.out.println(a);
	return sc.next();
	}
      abstract int m3(String s);
       abstract String m4(int a);
ab(int a){
	System.out.println(a);
}
}
class A extends ab{
	
	A(ab o){
	super(ab.sc.nextInt());
	}
	int m3(String s){
	System.out.println(s);
	return ab.sc.nextInt();
	}
	String  m4(int a){
	System.out.println(a);
	return ab.sc.next();
	}
	
}
class B extends ab{
	
	B(ab o){
	super(ab.sc.nextInt());
	}
	int m3(String s){
	System.out.println(s);
	return ab.sc.nextInt();
	}
	String  m4(int a){
	System.out.println(a);
	return ab.sc.next();
	}
	
}
class Main{

public static void main(String [] args){

A a = new A(null);


System.out.println(a.m1(ab.sc.next()));
System.out.println(a.m2(ab.sc.nextInt()));
System.out.println(a.m3(ab.sc.next()));
System.out.println(a.m4(ab.sc.nextInt()));
B b = new B(null);
System.out.println(b.m1(ab.sc.next()));
System.out.println(b.m2(ab.sc.nextInt()));
System.out.println(b.m3(ab.sc.next()));
System.out.println(b.m4(ab.sc.nextInt()));






}

}




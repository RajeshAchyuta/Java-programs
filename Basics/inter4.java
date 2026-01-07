//4.	Create a java application where we have two interfaces with respect to individual abstract methods, inherit these interfaces into one more interface which contains one abstract method and one defined method, then inherit this interface into an abstract class where we have one parameterized constructor, one defined method and one abstract method, then inherit this class into a concrete class where we need to provide functionality for all the abstract methods and invoke all the properties under main by providing dynamic inputs.
import java.util.Scanner;

interface I1{

	Scanner sc = new Scanner(System.in);
	   void m1();

}
interface I2{

     void m2();

}
interface I3 extends I1,I2{

	int m3();

	 static void m4(int a){

		System.out.println(a);

	}

}
abstract class Ab implements I3{
	
	Ab (int a , int b){

		System.out.println(a+" "+b);
	}
	
	void m5(){

		System.out.println("This is defined method in abstract class");
	}

	abstract void m6();
}
class A extends Ab{

	A(){

	super(sc.nextInt(),sc.nextInt());
	
	}

	public void m1(){

		System.out.println("this is method m1");

	}
	public void m2(){

		System.out.println("this is methos m2");
	
	}
	public int m3(){

		System.out.println("this is m3");

		return sc.nextInt();

	}
	public void m6(){

		
	System.out.println("this is m6");
	
	}
public static void main(String args[]){

	A a = new A();
	
	a.m1();

	a.m2();

	System.out.println(a.m3());

	I3.m4(I1.sc.nextInt());
	
	a.m5();
	
	a.m6();
}
}

	
import java.util.*;
class A extends Thread{


public static void main(String [] args) throws Exception{
Scanner sc = new Scanner(System.in);
 
Runnable r = ()->{
	String a = null;
	try{
	System.out.println(a.length());
	}
	catch(Exception e){
	System.out.println(e);
	}
	
	};
Runnable r2 = ()->{
	String k = sc.next();
	try{
	System.out.println(Integer.parseInt(k));
	}
	catch(Exception e){
	throw new NumberFormatException("NumberformatException");
	}
	
	};
Runnable r4 = ()->{
	int n= sc.nextInt();
	try{
	System.out.println(n);
	}
	catch(Exception e){
	throw new InputMismatchException("InputMismatchException");
	}
	
	};


A a = new A();
Thread t1 = new Thread(a);
Thread t3 = new Thread(r2);
Thread t2 = new Thread(r);
Thread t4 = new Thread(r4);
 t1.start();
 t1.join();
 t2.start();
 t2.join();
 t3.start();
 t4.join();
 t4.start();


}

}
import java.util.*;
class A implements Runnable{

 public  void run(){

	int arr[] = {1, 2, 3 };
	int sum =0;
	try{
	for(int i =0; i<4; i++){
		sum = sum+arr[i];
	}
	}
	catch(Exception e){
	System.out.println(e);
	}
	
	}


	 


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
	String k = "rajesh";
	try{
	System.out.println(Integer.parseInt(k));
	}
	catch(Exception e){
	throw new NumberFormatException("NumberformatException");
	}
	
	};

A a = new A();
Thread t1 = new Thread(a);
Thread t3 = new Thread(r2);
Thread t2 = new Thread(r);

 t1.start();
 t1.join();
 t2.start();
 t2.join();
 t3.start();


}

}
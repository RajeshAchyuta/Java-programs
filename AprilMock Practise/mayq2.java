import java.util.*;
class A implements Runnable{

 public  void run(){

	for(int i =1 ; i<=30; i=i+2){
	System.out.println(i);
	}

	}
public static void main(String [] args) throws Exception{
Scanner sc = new Scanner(System.in);
 
Runnable r = ()->{
	
	try{
	int a = 10/0;
	System.out.print(a);
	}
	catch(Exception e){
	System.out.print(e);
	}
	try{
	int a = sc.nextInt();
	System.out.print(a);
	}
	catch(Exception e){
	System.out.print(e);
	}

	
	};
A a = new A();
Thread t1 = new Thread(a);
Thread t2 = new Thread(r);

 t1.start();
 t1.join();
 t2.start();


}

}
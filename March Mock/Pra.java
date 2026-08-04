import java.util.Scanner;
class A implements Runnable{
	
	public void run(){
	for(int i =0; i<30; i++){
	System.out.println(i);
	}
	}
public static void main(String [] args) throws Exception{
	A a = new A();
	
	Runnable r = ()->{
		try{
			int k = 2, b=0;
			int c = k/b;
			System.out.println(c);
		}
		catch(Exception e){
		System.out.print("hii this eroe");
	
		}
	
	};
	Thread t1 = new Thread(a);
	Thread t2 = new Thread(r);
	t1.start();
	t1.join();
	t2.start();
	}
}
import java.util.Scanner;
class A implements Runnable{
static Scanner sc = new Scanner(System.in);
	public void run(){
	for(int i =1; i<=30; i++){
	System.out.println(i);
	}
	
	}


	public static void main(String [] args)throws Exception {
	
	A a = new A();
	Thread t1 = new Thread(a);
	Runnable r = () ->{
	try{
		int k =1 ,b =0;
		int c =k/b;
		System.out.print(c);
	}
	catch(Exception e){}
	System.out.print("zero division error");
	};

	try{
	int s = sc.nextInt();
	System.out.print(s);
	}
	catch(Exception e){
	System.out.print("input mismatch");
	}
	
	Thread t2 = new Thread(r);
	t1.start();
	t1.join();
	t2.start();
	}

}
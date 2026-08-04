import java.util.*;
class Main  implements Runnable {

public void run(){
	 Thread t=Thread.currentThread();
	if(t.getName().equals("even")){
		try{
		for(int i =1; i<=20 ; i++)
		{
		  if(i%2==0){
			System.out.println(i);
				Thread.sleep(2000);
			}
		}
		}
		catch(Exception e){}
	
	}
	else {
		try{
		for(int i =20; i<=40; i++){
			if(i%2==1){
			System.out.println(i);
				Thread.sleep(1000);
			}
		}
		
		}	
		
		catch(Exception e){}
	}

	
	}
public static void main(String [] args) throws Exception{

	Main a = new Main();
	Thread t1 = new Thread(a);
	Thread t2 = new Thread(a);
	t1.setName("even");
	t2.setName("odd");
	
	t1.start();
	t1.join();
	t2.start();
	
	}


}
//Create a Java application where we have two threads and two shared resources. Each thread should try to access both resources in reverse order, such that the program //leads to a deadlock situation during execution.

class A implements Runnable{

	String r1 = "hii";
	
	String r2 = "hello";

	public void run(){

	Thread t = Thread.currentThread();

	if(t.getName().equals("first")){

		person1();

	}
	else{

		person2();
	
	}


	}

	public static void main(String [] args){

	A obj = new A();

	Thread t1 = new Thread(obj);

	Thread t2 = new Thread(obj);

	t1.setName("first");
	t2.setName("second");

	t1.start();

	t2.start();

	}

	void person1(){

		synchronized(r1){

			System.out.println(r1);
		  try{ Thread.sleep(1000); }catch(Exception e){}

			synchronized(r2){

				System.out.println(r2);

			}

		}


	}
	
	void person2(){

		synchronized(r2){

			System.out.println(r2);

			  try{ Thread.sleep(1000); }catch(Exception e){}

			synchronized(r1){

				System.out.println(r1);

			}

		}


	

	}	


\
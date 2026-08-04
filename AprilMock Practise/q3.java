class A implements Runnable{
 
	public void run(){
}

public void main(String [] args){

Runnable r = ()->{
System.out.print("hii");

};
Thread t = new Thread(r);
t.start();

	
	}
}
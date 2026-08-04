import java.util.Scanner;
abstract class Ab{
static Scanner sc = new Scanner(System.in);

	abstract String m1(int a);

	float m2(String s){
	System.out.println(s);
	return sc.nextFloat();
	}
}

interface I1{
	int m3(String s);
	}
class Main {

	private String name;
	private int pwd ;
	
	Main(String name , int pwd){
	this.name = name;
	this.pwd = pwd;
	}

	public String getName(){
	return name;
	}
	public int getPwd(){
	return pwd;
	}

	public static void main(String [] args){
	Main m = new Main(Ab.sc.next(), Ab.sc.nextInt());
	Ab k = new Ab(){
	String m1(int a){
	System.out.println(a);
	return Ab.sc.next();
	}
	};
	System.out.println(k.m1(Ab.sc.nextInt()));
	System.out.println(k.m2(Ab.sc.next()));

	I1 i= (String s) -> {
	System.out.print(s);
	return Ab.sc.nextInt();
	};
System.out.println(i.m3(Ab.sc.next()));
System.out.println(m.getName());
System.out.println(m.getPwd());

}
}
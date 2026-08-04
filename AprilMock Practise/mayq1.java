import java.util.*;
interface I1{
Scanner sc = new Scanner(System.in);
 String m1(int a);
	
}
class Main implements I1{
	public String m1(int a){
	System.out.println(a);
	return I1.sc.next();
	}
}
class two{
public static void main(String [] args){
System.out.println("Enter choice");
     I1 i = new I1() {
	public String m1(int a){
	System.out.println(a);
	return I1.sc.next();
}
	};

	I1 i2  = (int a) ->{
	System.out.println(a);
	return I1.sc.next();
	};

int n = I1.sc.nextInt();

switch(n){
case 1: Main m = new Main();
	m.m1(I1.sc.nextInt());
case 2: i.m1(I1.sc.nextInt());
case 3: i2.m1(I1.sc.nextInt());
default:
	break;



}


}
}

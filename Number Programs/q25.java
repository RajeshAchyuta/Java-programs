//21	Create a java application where we have one class it contains methods like M1 which does not have any parameter and returns nothing, method M2 which does not have any parameter and returns nothing then invoke M1 under M2 and then M2 under the main method, both M1 and M2 methods have to print any user-friendly message on the console (RRR.java).


class Example{
void m1(){
System.out.println("this is method m1");
}

void m2(){
System.out.println("this is method m2");
m1();
}

public static void main(String [] args){
Example e = new Example();
e.m2();


}
}
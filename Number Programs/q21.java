//17	create a java application where we have one class, it contains methods like add having two parameters as integers, it is going returns the value as the addition of two formal parameters, method sub having two parameters as integers and it is going to return the value as subtraction of two parameters, method multi which doesn't have any parameters and it has to return the value as multiplication of both ‘add’ and ‘sub’ method results. then invoke multi under the main method by providing input values dynamically. (P.java)


import java.util.Scanner;
class Example{
 static Scanner sc = new Scanner(System.in);
int add(int a, int b){
return a+b;
}
int sub(int a ,int b){
return a-b;
}
 int  mul(){
 int a= add(sc.nextInt(),sc.nextInt());
 int b= sub(sc.nextInt(),sc.nextInt());
 return a*b;
}



public static void main(String [] args){

Example e = new Example();
 System.out.println(e.mul());

}
}



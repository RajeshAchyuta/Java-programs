//Create a java application where we have one class it contains one non-static method display having a parameter integer, it has to print the value of an integer. and which is going to return nothing then invoke this method under the main method by providing dynamic input (R.java)


import java.util.Scanner; 
class I {
 
void display(int a){
System.out.println(a);
}
public static void main(String[] args){

Scanner s = new Scanner(System.in);
I i =new I ();
System.out.println("Enter any number :");
int a = s.nextInt();
 i.display(a);
}
}
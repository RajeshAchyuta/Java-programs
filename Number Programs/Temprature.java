import java.util.Scanner;
class Temprature{
static Scanner sc =new  Scanner(System.in);
 
public static void main(String [] args){
System.out.println("Enter the celisus");
 float   c= sc.nextFloat();
 float fh = (c * 9/5) + 32;
System.out.printf("%.2f"  ,fh);



}


}
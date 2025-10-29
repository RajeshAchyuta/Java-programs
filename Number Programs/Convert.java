import java.util.Scanner;
class Convert{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter kgs");
float a = sc.nextFloat();
int b = (int)(a * 1000);
System.out.println(b +" " +"Kilograms");
}

}
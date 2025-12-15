import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);
private int pin =sc.nextInt();

int getPin(){
return pin;
}
void setPin(int pin){
this.pin= pin;
}
public static void main(String [] args){
Example e = new Example();
System.out.println(e.getPin());
e.setPin(sc.nextInt());
System.out.println(e.getPin());


}
}
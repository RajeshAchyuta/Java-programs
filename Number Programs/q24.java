//20	Create a java application where we have one class it contains methods like m having parameter string and it is going to return a Boolean value, method n having parameter Boolean and it is going to return double value and then invoke m under n method and n method under main by providing dynamic inputs (Movie.java)

import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);
 
boolean m(String str){
System.out.println(str);
return sc.nextBoolean();
} 

double n(boolean b){
System.out.println(b);
System.out.println(m(sc.next()));
return sc.nextDouble();
}
public static void main(String [] args){
Example e = new Example();
System.out.println(e.n(sc.nextBoolean()));


}
}
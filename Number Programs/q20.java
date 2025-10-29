//16.create a java application where we have one class where we have methods like non-static method m1 having parameter string and it is going to return an integer value, static method m2 having parameter boolean and it's going to return an integer value. then invoke m1 method under m2, m2 has to return the integer value with addition of m1 return value, then invoke m2 under main by taking dynamic inputs(bang.java)

import java.util.Scanner;
class  Example{
static Scanner sc = new Scanner(System.in);

int m1(String str){
System.out.println(str);
return sc.nextInt();
}

static int m2(boolean b){
System.out.println(b);
Example e = new Example();
return sc.nextInt() + e.m1(sc.next());


}
 public static void main(String [] args){
 System.out.println(m2(sc.nextBoolean()));

}
}

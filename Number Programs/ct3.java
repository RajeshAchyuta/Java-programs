//3	Create a java application where we have one class it contains constructors like a single parameter as Integer, default, double parameter as String and boolean, and Tripple parameter like double long and character. then invoke a single parameter under default, default under double parameter, and double under Tripple and Tripple under main by using this keyword with dynamic inputs. (Z.java)


import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);

Example(int a){
System.out.println(a);
}

Example(){
this(sc.nextInt());
System.out.println("sncnkjehvkjhetlkjb");
}

Example(String s, boolean  b){
this();
System.out.println(s);
System.out.println(b);
}

Example(double d, long l, char c){
this(sc.next(),sc.nextBoolean());
System.out.println(d);
System.out.println(l);
System.out.println(c);
}
public static void main(String [] args){
Example e = new Example(sc.nextDouble(),sc.nextLong(),sc.next().charAt(0));

}

}
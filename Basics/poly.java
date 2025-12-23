import java.util.Scanner;
class A{
 Scanner sc = new Scanner(System.in);


 int add(int a ,int b){
return a+b;
}

int add(int a,int b, int c){
 System.out.println(add(sc.nextInt(),sc.nextInt()));
return a+b+c;
}

}
class B extends A{
 int add(int a,int b,int c){
 System.out.println(super.add(sc.nextInt(),sc.nextInt(),sc.nextInt()));
 return a+b+c;
}

public static void main(String [] args){
Scanner sc = new Scanner(System.in);
B b = new B();
System.out.println(b.add(sc.nextInt(),sc.nextInt(),sc.nextInt()));

}
}
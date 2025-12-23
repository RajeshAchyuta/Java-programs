import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);
  
 int add(int a, int b)
{
 return a+b;
}
int add(int a, int b, int c)
{
 return a+b+c;
}
int sub(int a , int b){
return a-b;
}
int sub(int a , int b ,int c){
return a-b-c;
}
public static void main(String []args){
Example e =new Example();
System.out.println(e.add(sc.nextInt(),sc.nextInt()));
System.out.println(e.add(sc.nextInt(),sc.nextInt(),sc.nextInt()));
System.out.println(e.sub(sc.nextInt(),sc.nextInt()));
System.out.println(e.sub(sc.nextInt(),sc.nextInt(),sc.nextInt()));
}

}
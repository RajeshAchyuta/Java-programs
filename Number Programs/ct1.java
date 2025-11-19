//1	create a Java application where we need to satisfy this keyword at a variable level.  (example.java).

class Example{
int a = 50;

Example(int a){
System.out.println(a);
System.out.println(this.a);
}
public static void main(String [] args){

Example e = new Example(19);
}

}
interface I{

void m1();

default void m2(int a){
   System.out.println(a);
}


}
class Main implements I{

void m1(){
System.out.println("heknjjeklhf");

}



 public static void main(String [] args){

Main m = new Main();
m.m1();

I.m2();


}

}
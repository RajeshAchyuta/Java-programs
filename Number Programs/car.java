import java.util.Scanner;
class Car{
static Scanner sc = new Scanner(System.in);
  String brand;
  String name;
  String colour;
  int model;
  double price;

 Car(String brand,String name, String colour, int model, double price){
     this.brand=brand;
     this.name=name;
     this.colour=colour;
     this.model=model;
     this.price=price;
}

 Car(Car c){
     this.brand=c.brand;
     this.name=c.name;
     this.colour=c.colour;
     this.model=c.model;
     this.price=c.price;

}
public static void main(String [] args){
Car thar1 = new Car(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
Car thar2 = new Car(thar1);
System.out.println("*****************new car************");
System.out.println(thar1.brand);
System.out.println(thar1.name);
System.out.println(thar1.colour);
System.out.println(thar1.model);
System.out.println(thar1.price);
System.out.println("*****************old car************");

System.out.println(thar1.brand);
System.out.println(thar1.name);
System.out.println(thar1.colour);
System.out.println(thar1.model);
System.out.println(thar1.price);

}
}
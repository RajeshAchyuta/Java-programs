//3.	Create a java application where we have a software company, it will provide details like EmpID, EmpDes, EmpSal, and EmpWorkLoc to the 5 employees, every employee has to display their own details with respect to one method and then invoke all those methods under main. (CVCORP.java)

import java.util.Scanner;
class SoftwareCompany{
static Scanner sc = new Scanner(System.in);
int empId =sc.nextInt();
String EmpDes = sc.next();
double EmpSal = sc.nextDouble();
String EmpWorkloc = sc.next();
}
class Employee1 extends SoftwareCompany{
  void display(){
System.out.println(empId);
System.out.println(EmpDes);
System.out.println(EmpSal);
System.out.println(EmpWorkloc);
}
}
class Employee2 extends SoftwareCompany{
  void display(){
System.out.println(empId);
System.out.println(EmpDes);
System.out.println(EmpSal);
System.out.println(EmpWorkloc);
}
}
class Employee3 extends SoftwareCompany{
  void display(){
System.out.println(empId);
System.out.println(EmpDes);
System.out.println(EmpSal);
System.out.println(EmpWorkloc);
}
}
class Employee4 extends SoftwareCompany{
  void display(){
System.out.println(empId);
System.out.println(EmpDes);
System.out.println(EmpSal);
System.out.println(EmpWorkloc);
}
}
class Employee5 extends SoftwareCompany{
  void display(){
System.out.println(empId);
System.out.println(EmpDes);
System.out.println(EmpSal);
System.out.println(EmpWorkloc);
}
}
class Main{
public static void main(String [] args){

Employee1 e1= new Employee1();
Employee2 e2= new Employee2();
Employee3 e3= new Employee3();
Employee4 e4= new Employee4();
Employee5 e5= new Employee5();

e1.display();
e2.display();
e3.display();
e4.display();
e5.display();


}
}
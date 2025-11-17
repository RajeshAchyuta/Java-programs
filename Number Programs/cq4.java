//4.	Create a java application where we have one employee, they have to display the details emp ID, name, salary, designation, and mobile number by using the parameterized constructor, then invoke the constructor under main by providing dynamic inputs. (Employee.java)

import java.util.Scanner;
class Example{
static Scanner sc = new Scanner(System.in);

Example(int empid, String ename, float esal, String edesignation,int em){

System.out.println("Employee Id:"+ empid);
System.out.println("Employee Name :"+ ename);
System.out.println("Employee Salary :"+ esal);
System.out.println("Employee Designation :"+ edesignation);
System.out.println("Employee Moblie Number :"+ em);
}
public static void main(String [] args){
Example e = new Example(sc.nextInt(),sc.next(),sc.nextFloat(),sc.next(),sc.nextInt());

}


}
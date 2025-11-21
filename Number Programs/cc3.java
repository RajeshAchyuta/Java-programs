//Create a Java application where we have an Organization with details like EmpId, EmpName, EmpSalary, EmpDesignation, and EmpWorkLocation, OrganizationName. Create instances for Five employees. There is a method named EmployeeDetails with a Class variable as a parameter and it returns nothing. Invoke this method under main and while invoking, According to user choice, the respective employee details should be displayed.Provide Dynamic inputs.
	//Note: Do not use an Import statement.
class Example{
static java.util.Scanner sc= new java.util.Scanner(System.in);

int EmpId =sc.nextInt();
String EmpName= sc.next();
float EmpSalary = sc.nextFloat();
String Empdes = sc.next();
String EmpLoc = sc.next();
String Org = sc.next();

static void employeeDetails(Example e){
System.out.println(e.EmpId);
System.out.println(e.EmpName);
System.out.println(e.EmpSalary);
System.out.println(e.Empdes);
System.out.println(e.EmpLoc);
System.out.println(e.Org);
}


public static void main(String [] args){
System.out.println("1 employee");
Example e1 = new Example();

System.out.println("2 employee");
Example e2 = new Example();

System.out.println("3 employee");
Example e3 = new Example();

System.out.println("4 employee");
Example e4 = new Example();

System.out.println("5 employee");
Example e5 = new Example();
System.out.println("Enter choice");
int n = sc.nextInt();
switch(n){
case 1: employeeDetails(e1);
        break;
case 2 : employeeDetails(e2);
         break;
case 3 : employeeDetails(e3);
         break;
case 4 : employeeDetails(e4);
         break;
case 5: employeeDetails(e5);
         break;
default:
System.out.println("Invalid Inputs");
break;

}





}

}
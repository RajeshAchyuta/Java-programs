import java.util.*;
class Employee{
	
	int id ;
	String name;
 	int sal;
	Employee(int id, String name, int sal){
	this.id= id;
	this.name = name;
	this.sal = sal;
	}
int getId(){
	return id;
}
String getName(){
	return name;
	}
int  getSal(){
	return sal;
}
public String toString(){
	return(getId()+" "+ getName()+" "+ getSal() );
	}
}
class A{

	public static void main(String [] args){

      FileOutputStream fos = new FileOutputStream();

	ArrayList<Employee> al = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i =0; i<n; i++){
	 al.add(new Employee(sc.nextInt(), sc.next(), sc.nextInt()));
	}
System.out.print(al);
	}

}
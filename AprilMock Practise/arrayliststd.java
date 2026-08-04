/*Create a java application where we have a class like Student having private fields 
like std id, std name, std_marks without initialization provide setter and getters for 
these variables and the take a separate class Test, create a ArrayList object and add 6 
student details to this then display the student data in descending order based on marks 
if they got same marks then sort according to name in dictionary order.*/

import java.util.*;
class Student{

private int std_id;
private String std_name;
private int std_marks;

	Student(int std_id, String std_name, int std_marks){
	this.std_id= std_id;
	this.std_name = std_name;
	this.std_marks = std_marks;
	}
int getStdid(){
	return std_id;
}
String getStdName(){
	return std_name;
}
int getStdMarks(){
	return std_marks;
}
public String toString(){
return " StudentId "+getStdid() + " StudentName "+getStdName() +"StudentMarks"+ getStdMarks();
}
}
class Markscom implements Comparator<Student>{

	public int compare(Student a , Student b){
	
	if(a.getStdMarks()==b.getStdMarks()){
	 return a.getStdName().compareTo(b.getStdName());
	}
	else if(a.getStdMarks()<b.getStdMarks()){
	return 1;
	}
	
	else{
		return -1;
		}
	}

	
}
class Test{

public static void main(String [] args){
Scanner sc = new Scanner(System.in);
	ArrayList<Student> al = new ArrayList<>();
	
	for(int i =0; i<5; i++){
	Student s = new Student(sc.nextInt(), sc.next(), sc.nextInt());
	al.add(s);
	}
	Collections.sort(al, new Markscom());
for(Student i :al){
System.out.println(i);
}
	
	}

}
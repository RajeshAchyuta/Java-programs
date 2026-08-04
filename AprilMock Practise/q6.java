/*Create a java application where we have a class like Student having private fields 
like std id, std name, std_marks without initialization provide setter and getters for 
these variables and the take a separate class Test, create a ArrayList object and add 6 
student details to this then display the student data in descending order based on marks 
if they got same marks then sort according to name in dictionary order.*/

import java.util.*;
class Student{

private int stdid;
private String stdname;
private int stdmarks;
	
	int getStdid(){
		return stdid;
	}
	String getStdname(){
		return stdname;
	}
	int getStdmarks(){
		return stdmarks;
	}

	void setStdid(int stdid){
	this.stdid = stdid;
	}
	void setStdname(String stdname){
	this.stdname = stdname;
	}
	void setStdmarks(int stdmarks){
	this.stdmarks = stdmarks;
	}

}
class Markscom implements Comparator<Student>{

	public int compare(Student a, Student b)
	{
	if(a.getStdmarks()>b.getStdmarks())
	{
		return 1;
	}
	else if(a.getStdmarks()<b.getStdmarks())
	{
		return -1;
	}
	else{
	return a.getStdname().compareTo(b.getStdname());
	}
	}
	}

class Main{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> al = new ArrayList<>();
	for(int i =1; i<=3; i++){
	Student s = new Student();
	s.setStdid(sc.nextInt());
	s.setStdname(sc.next());
	s.setStdmarks(sc.nextInt());
	al.add(s);
	
	}
	Collections.sort(al,new Markscom());
for(Student e:al){
System.out.println(e.getStdid()+" " +e.getStdname()+" "+e.getStdmarks());
}

}
}
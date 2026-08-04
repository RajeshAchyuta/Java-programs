/*1. Create a Java application where we have to create user defined class like
Student, it contains variables like stid, stname and stmarks with setter and
getter methods then we have to store student details like id, name and
marks into properties file by getting the values from getter methods then
we have to get and display all those values from properties file.*/

import java.io.*;
import  java.util.*;
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
class Main{

public static void main(String [] args)throws Exception{

Scanner sc  = new Scanner(System.in);


ArrayList<Student> al = new ArrayList<>();

for(int i =1; i<=3; i++){
Student s = new Student();
	s.setStdid(sc.nextInt());
	s.setStdname(sc.next());
	s.setStdmarks(sc.nextInt());
	al.add(s);

	}
Properties p = new Properties();

for(int i =0; i<al.size(); i++){
p.setProperty("id"+(i+1),String.valueOf(al.get(i).getStdid()));
p.setProperty("name"+(i+1),al.get(i).getStdname());
p.setProperty("marks"+(i+1),String.valueOf(al.get(i).getStdmarks()));
}

FileOutputStream fos = new FileOutputStream("C:\\Users\\bsubb\\OneDrive\\Desktop\\AprilMock Practise\\tst.txt");
p.store(fos, "deatils");
fos.close();
FileInputStream fis = new FileInputStream("C:\\Users\\bsubb\\OneDrive\\Desktop\\AprilMock Practise\\tst.txt");
p.load(fis);
fis.close();
System.out.print(p);





}


}
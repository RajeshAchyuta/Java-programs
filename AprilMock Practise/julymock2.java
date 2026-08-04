import java.util.*;
import java.io.*;
class Main{
 public static void main(String [] args) throws Exception {
  Scanner sc = new Scanner(System.in);
	
	Properties p = new Properties();
	
	FileOutputStream fos = new FileOutputStream("C:\\Users\\bsubb\\OneDrive\\Desktop\\AprilMock Practise\\mocktxt.txt");

   for(int i =0; i<3; i++){
     
       p.put(""+i , sc.nextInt()+sc.next()+sc.nextDouble()+sc.next()+sc.next());
	p.store(fos, "data");
	
	}
 FileInputStream fis = new FileInputStream("C:\\Users\\bsubb\\OneDrive\\Desktop\\AprilMock Practise\\mocktxt.txt");

p.load(fis);

  System.out.print(p);
 }
 }
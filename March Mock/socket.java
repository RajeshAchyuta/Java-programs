
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.net.UnknownHostException;
import java.util.Scanner;
 class socket {
public static void main(String [] args) throws UnknownHostException, IOException {
	Scanner sc = new Scanner(System.in);
	Socket s = new  Socket("192.168.26.108",1010);
	
	DataOutputStream  dos  = new DataOutputStream(s.getOutputStream());
	DataInputStream   dis = new DataInputStream(s.getInputStream());
	while(true) {
		System.out.print(dis.readUTF());
		dos.writeUTF(sc.nextLine());
		
	}
}
}

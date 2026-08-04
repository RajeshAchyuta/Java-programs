import java.util.*;
class Insta {
static Scanner sc = new Scanner(System.in);

private String username;
private String password;
private String email;

	Insta(String username , String password, String email){
	this.username = username;
	this.password = password;
	this.email = email;
	}
public  String getUser(){
	return username;
}
public  String getPwd(){
	return password;
}
public  String getEmail(){
	return email;
}

	void profileInfo(Insta in){
	System.out.println(in.getUser());
	System.out.println(in.getPwd());
	System.out.println(in.getEmail());
	}

	void login(String user, String pwd, Insta in){
	System.out.println("username: ");
	String userid = sc.next();
	System.out.println("password: ");
	String pwdd = sc.next();
	if(in.getUser().equals(userid) && in.getPwd().equals(pwdd)){
		System.out.println("login successfully");
	}
	else{
		System.out.println("invalid details");
	}
	in.profileInfo(in);
	}
	void signUp(Insta in){

		System.out.println("signup sucessfully");
		System.out.println("Login here");
	in.login(in.getUser(), in.getPwd() ,in);
	

	}
public static void main(String [] args){

	Insta in = new Insta(sc.next(), sc.next(), sc.next());

	in.signUp(in);
	


}

}
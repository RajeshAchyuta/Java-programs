import java.util.Scanner;
class Bank{
private String username ;
private long  phno ;
private String email ;
private String ifsc;
private int pin;

Bank(String username, long phno, String email, String ifsc, int pin){
this.username=username;
this.phno=phno;
this.email=email;
this.ifsc=ifsc;
this.pin=pin;

}
String getUsername(){
    return username;
}
long getPhno(){
    return phno;
}
String getEmail(){
    return email;
}
String getIfsc(){
    return ifsc;
}
int getPin(){
    return pin;
}

void setUsername(String username){
this.username=username;
}
void setPhno(long phno){
this.phno=phno;
}

void setEmail(String email){
this.email=email;
}
void setPin(int pin){
this.pin=pin;
}
}
class user{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
System.out.println("Create an account");
String un =sc.next();
long ph =sc.nextLong();
String email =sc.next();
String ifsc =sc.next();
int pin = sc.nextInt();
Bank u1 = new Bank(un,ph,email,ifsc,pin);
System.out.println(u1.getUsername());
System.out.println(u1.getPhno());
System.out.println(u1.getEmail());
System.out.println(u1.getIfsc());
System.out.println(u1.getPin());
System.out.println("welcome to login");
String lusername =sc.next();
int lpin = sc.nextInt();
String username1 =u1.getUsername();
 int pin1=u1.getPin();
if(lusername.equals(username1) && lpin==pin1){
System.out.println("login suceesfully");
}
else{
System.out.println("sorry invakid");

}





}
}
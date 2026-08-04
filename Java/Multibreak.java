import java.util.Scanner;
public class Multibreak {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String k = sc.next();
        boolean b = true;
        loo1:
        for(int i =0; i<str.length(); i++){
            loop2:
            for(int j =i; j<str.length(); j++){
                String result =str.substring(i, j+1);
                if(k.equals(result)){
                        b= false;
                        break loo1 ;
                }
            }
        }
if(b==false){
    System.out.println("found");
}
else{
    System.out.print("Not foubd");
}
    }
}

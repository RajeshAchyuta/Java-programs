import java.util.Scanner;
public class reverse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String k = "";
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            k = ch+k;
        }
        System.out.print(k);
    }
}

import java.util.Scanner;
public class Stringsum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int sum =0;
        int c= 0;
        String k = "";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch) || ch =='-' && k.isEmpty()){
                k = k+ch;
            }
            else{
                if(!k.isEmpty() && !k.equals('-')){
                    int n = Integer.parseInt(k);
                    if(c>0 && n>=0){
                        System.out.print("+");
                    }
                    System.out.print(n);
                    sum = sum+n;
                    c++;
                }
                k="";
            }
        }
        if(!k.isEmpty() && !k.equals('-')){
                    int n = Integer.parseInt(k);
                    if(c>0 && n>=0){
                        System.out.print("+");
                    }
                    System.out.print(n);
                    sum = sum+n;
                   
                }
System.out.print("="+sum);

    }
}

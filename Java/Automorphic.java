import java.util.Scanner;
public class Automorphic {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int dc =0;
        while(temp>0)
        {
            dc++;
            temp= temp/10;
        }
        int s = n*n;
        int p = (int)Math.pow(10,dc);
    
    if(n==s%p){
        System.out.print("Auytomorphic");
    }
    else{
        System.out.print("not an automorphic");
    }
}
}

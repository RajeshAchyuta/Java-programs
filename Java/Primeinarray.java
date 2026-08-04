import java.util.Scanner;
public class Primeinarray {
    static int isPrime(int n){
        int fc = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                fc++;
            }
        }
        if(fc==2){
            return n;
        }
        else{
            return 0;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h1 = Integer.MIN_VALUE;
        int h2 = h1; 
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++){
            int result = (isPrime(arr[i]));
            if(result != 0){
                if(result>h1){
                    h2= h1;
                    h1= result;
                }
                else if(result>h2 && h2>h1){
                    h2= result;
                }
            }
        }
        System.out.print(h2);
    }
}

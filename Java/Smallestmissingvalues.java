import java.util.Scanner;
public class Smallestmissingvalues {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int arr[] = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        int l = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
                if(arr[i]<l){
                    l= arr[i];
                
            }
        }
    
        for(int i = l+1; ;i++){
            boolean b = true;
            for(int j =0; j<n; j++){
                if(arr[j]==l){
                    b= false;
                    break;
                    
                }
            }
            if(b==false){
                System.out.print(i);
                c++;
            }
        }
    }
}

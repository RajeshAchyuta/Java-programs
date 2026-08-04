import java.util.Scanner;
public class lcm {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    int h =Integer.MIN_VALUE; 
    for(int i =0; i<n; i++){
        if(arr[i]>h){
            h = arr[i];
        }
    }
    for(int i =h;; i=i+h){
        int c =0;
        for(int j=0; j<n; j++){
            if(i%arr[j]==0){
                c++;
            }
        }
        if(c==n){
            System.out.print(i);
            break;
        }
        
    }

  }  
}

import java.util.Scanner;
public class Arraypra3 {
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
    }
      int k = sc.nextInt();
    for(int i =0; i<n; i++){
        for(int j =i+1; j<n; j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
  
    int s =0;
    int l =n-1;
    
    boolean b = true;
    while(s<=l){
        int m = (s+l)/2;
        if(arr[m]==k){
            b= false;
            break;
        }
        else if(k>arr[m]){
            s = m+1;
        }
        else{
            l = m-1;
        }
    }
    if(!b){
        System.out.print("found");
    }
    else{
        System.out.print("not found");
    }
   } 
   } 


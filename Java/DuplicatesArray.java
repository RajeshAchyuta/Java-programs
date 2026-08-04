import java.util.Scanner;
public class DuplicatesArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int h =0;
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }
        for(int i =0; i<n; i++){
            int c=0;
            for(int j =i; j>=0; j--){
                    if(arr[i]==arr[j]){
                        c++;
                    }
            }
            if(c==1){
                int dc = 0;
                for(int j =0;j<n; j++){
                    if(arr[i] == arr[j]){
                        dc++;
                    }
                }
                if(dc>h){
                    h= arr[i];
                    
                }
            }
        }
        System.out.print(h);
    }
}

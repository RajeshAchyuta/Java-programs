import java.util.Scanner;
public class Circulararrays {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++){
        for(int j =0; j<n ;j++){
            System.out.print(arr[j]+" ");
        }
        int temp = arr[0];
        for(int k =1; k<n; k++){
            arr[k-1] = arr[k];
        }
        arr[n-1] = temp;
        System.out.println();
    }

    }
}

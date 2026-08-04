import java.util.Scanner;
public class Arraypra1 {
  public static void   main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h1 = Integer.MIN_VALUE;
    int h2 = h1;
    int h3 = h2;
    int arr[] = new int[n];
    for(int i =0; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    for(int i =0; i<n; i++){
        if(arr[i]>h1){
            h3= h2;
            h2= h1;
            h1 = arr[i];
        }
        else if(arr[i]>h2 && h1>h2){
            h2 = arr[i];
        }
        else if(arr[i]>h3 && h2>h3){
            h3= arr[i];
        }

    }
    System.out.println(h1);
    System.out.println(h2);
    System.out.print(h3);
  }
}

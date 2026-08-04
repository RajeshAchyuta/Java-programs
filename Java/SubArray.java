import java.util.Scanner;
class Sa{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = Integer.MIN_VALUE;
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        for(int i =0; i<n; i++){
            
            for(int j =i; j<n; j++){
                int result = 1;
                for(int k =i; k<=j; k++){
                    result = result*arr[k];
                        if(result>h){
                            h = result;
                        }
                    // System.out.print(result);
                }
            //    System.out.println();
            }
            
        }
        System.out.print(h);
    }
}
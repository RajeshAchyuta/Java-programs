import java.util.Scanner;
class Subseq{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i =1; i<(int)Math.pow(2,n); i++){
            int t = i;
            int index = 0;
            String str = " ";
           
            while(t>0){
                 int sum =0;
                int r = t%2;
                if(r==1){
                    str= arr[index]+" ";
                    sum = sum+arr[index];
                }
                index++;
                t= t/2;
            
            if(sum == k){
                System.out.print(str);
            }
        }

            System.out.println();
        }
    }
}

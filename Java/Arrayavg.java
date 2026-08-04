public class Arrayavg {
    public static void main(String [] args){
        int arr[] = {25 , 2,15 ,17 ,50};
        int sum = 0;
        int c = 0;
        float avg = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]%2==1){
                c++;
                sum = sum+arr[i];
                
            }

        }
        System.out.println(sum);
        System.out.println(c);
        System.out.printf("%.2f",(float)sum/c);


    }
}

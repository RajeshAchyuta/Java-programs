import java.util.*;
class frequency{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int al=0;
        String arr[] = str.split(" ");
        for(int i =0; i<arr.length; i++){
            int c=0;
            for(int j=i; j>=0; j--){
                if(arr[i].equals(arr[j])){
                    c++;
                }
            }
            if(c==1){
                al++;
            }
        } 
        int index =0;
        String arr1[] = new String[al];
        int arr2[] = new int [al];  
        for(int i =0; i<arr.length; i++){
            int c=0;
            for(int j=i; j>0; j--){
                if(arr[i].equals(arr[j])){
                    c++;
                }
            }
            if(c==1){
                int dc = 0;
                for(int j=0; j<arr.length; j++){
                    if(arr[i].equals(arr[j])){
                        dc++;
                    }
                }
                arr2[index] = dc;
                arr1[index] = arr[i];
                index++;
            }
        }
        for(int i =0; i<arr2.length; i++){
            for(int j =i+1; j<arr2.length; j++){
                if(arr2[i]>arr2[j]){
                    int temp = arr2[i];
                    arr2[i]   = arr2[j];
                    arr2[j] = temp;
                    String  t = arr1[i];
                    arr1[i]   = arr1[j];
                    arr1[j] = t;

                }
            }
        }
        for(int i=0; i<arr1.length; i++){
        System.out.println(arr1[i]+"->>"+arr2[i]);
        }
        // System.out.println(Arrays.toString(arr1));
        // System.out.print(Arrays.toString(arr2));   
}
}
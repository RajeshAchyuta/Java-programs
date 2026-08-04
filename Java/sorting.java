import java.util.Arrays;
import java.util.Scanner;
public class sorting {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String arr[] = s.split(" ");
      for(int i =0; i<arr.length; i++){
        for(int j =i+1; j<arr.length; j++){
            if(arr[i].length()<arr[j].length()){
                String temp = arr[i];
                arr[i]  = arr[j];
                arr[j] = temp;
            }
        }
      } 
      System.out.print(Arrays.toString(arr)); 
    }
}

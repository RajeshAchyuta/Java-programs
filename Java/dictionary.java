//47.	Write a program to print the all words in decreasing order(word size) of a Given String? 
import java.util.Arrays;
import java.util.Scanner;
public class dictionary {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = "red black white blue green";
        String arr[] = s.split(" ");
        for(int i =0; i<arr.length; i++){
            for(int j =i ; j<arr.length; j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;

                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}

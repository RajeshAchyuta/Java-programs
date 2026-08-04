import java.util.Scanner;
public class common {
  public static void main(String [] args){
    String s1 = "rajesh is good boy";
    String s2 = "pradep is bad boy";
    String arr1[] = s1.split(" ");
    String arr2[] = s2.split(" ");
    for(int i =0; i<arr1.length; i++){
        for(int j =0; j<arr2.length; j++){
            if(arr1[i].equals(arr2[j])){
                System.out.println(arr1[i]);
            }
        }
    }
  }  
}

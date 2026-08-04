// Second Largest Element in an Array 
// Topic: Arrays 
// Asked in: 2020, 2021, 2022, 2023, 2024 
// Easy 
// Given an array of integers, find the second largest distinct element. If no such element exists, return -1. 
// Sample Input: arr = [12, 35, 1, 10, 34, 1] 
// Expected Output: 34
import java.util.Scanner;
class A{
   
   public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     int h1 = Integer.MIN_VALUE;
     int h2 = h1;

   int n = sc.nextInt();
   int arr[] = new int[n];
   for(int i =0; i<n; i++){
    arr[i] = sc.nextInt();
   }
   for(int i =0; i<n; i++){
      if(arr[i]>h1){
         h2=h1;
         h1= arr[i];
      }
      else if(arr[i]>h1 && h2<h1){
         h2= arr[i];
      }
   }
System.out.print(h2);
}
}




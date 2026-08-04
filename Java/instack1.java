// Description:
// Write a Program to read the array Size and array Elements and then print the Numbers which are missing in array from Smallest Number in array to Largest number in array?
// Constraints:
// Input: First line of Input Consists of Array Size
//     second line of Input Consists of Array Elements Separated by space
// Output:     Print the Numbers which are not there in Given Array
// Example:
// Input1:        5
//               7 3 8 4 1

// Output1:     2 5 6 
// Input2:        10
//                 3 12 18 9 4 0 10 19 5 16

// Output2:     1 2 6 7 8 11 13 14 15 17
// Input3:        6
//              0 4 3 2 7 5

// Output3:     1 6 


import java.util.Scanner;
class A{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int l = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i]>h){
                h = arr[i];
            }
        }
        for(int i =0; i<n; i++){
            if(arr[i]<l){
            l = arr[i];
            }
        }
        for(int i = l+1; l<h; i++){
            boolean b = true;
            for(int j =0; j<n; j++){
                if(arr[j]==l){
                    b = false;
                }
            }
            if(b){
                System.out.print(i);
            }
        }
    }
}
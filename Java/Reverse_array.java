import java.util.*;

public class Reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6, 7};
        int n = arr.length;

        // reverse first half
        reverse(arr, 0, n/2 - 1);

        // reverse second half
        reverse(arr, n/2, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
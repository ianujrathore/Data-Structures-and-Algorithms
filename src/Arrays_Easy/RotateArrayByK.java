package Arrays_Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {
    public static void reverse(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = {10,20,30,40,50,60};
        System.out.print("Enter Target : ");
        int target = sc.nextInt();
        int n = nums.length;
        target %= n;

        int start = 0;
        int mid = target-1;

        reverse(nums,start,mid);
        reverse(nums,mid+1,n-1);
        reverse(nums,start,n-1);

        System.out.println(Arrays.toString(nums));
    }
}

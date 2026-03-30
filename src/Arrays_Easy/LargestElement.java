package Arrays_Easy;

import java.util.Scanner;

public class LargestElement {
    public static int largestElement(int [] arr){
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest) largest = arr[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] arr = new int [size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(largestElement(arr));
        sc.close();
    }
}

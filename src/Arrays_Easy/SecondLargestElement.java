package Arrays_Easy;

import java.util.Scanner;

public class SecondLargestElement {
    public static int secondLargestElement(int [] arr) {
        int largest = arr[0];
        int slargest = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] arr = new int [size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(secondLargestElement(arr));
        sc.close();
    }
}

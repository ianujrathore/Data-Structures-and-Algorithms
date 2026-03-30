package Arrays_Easy;

import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDup (int [] arr){
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if (arr[i] != arr[j]){
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] arr = new int [size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(removeDup(arr));
        sc.close();
    }
}

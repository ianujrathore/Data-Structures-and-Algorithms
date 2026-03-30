package Arrays_Easy;

import java.util.Scanner;

class CheckIfArraySorted {
    public static boolean isCheck (int [] arr){
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > arr[i - 1]){
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] arr = new int [size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isCheck(arr));
        sc.close();
    }
}
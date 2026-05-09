package BasicRecursion;

public class ReverseArray {

    public static void rev(int[] arr, int l, int r) {

        if (l >= r) {
            return;
        }

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        rev(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        rev(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
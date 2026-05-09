package Arrays_Easy;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 3, 0, 2, 0, 0, 3};
        int n = nums.length;

        int i = -1;

        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                i = j;
                break;
            }
        }

        for (int j = i + 1; j < n; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
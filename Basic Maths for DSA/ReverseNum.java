import java.util.*;

class ReverseNum {
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println("Reverse number : " + result);
        sc.close();
    }
}
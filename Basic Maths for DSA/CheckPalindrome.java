import java.util.*;

public class CheckPalindrome {
    public static boolean palindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0){
            int lastDigit = temp % 10;
            rev = (rev * 10) + lastDigit;
            temp /= 10;
        }
        return rev == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        if(palindrome(n)){
            System.out.println("True! Palindrome");
        } else {
            System.out.println("False! Not Palindrome");
        }

        sc.close();
    }
}

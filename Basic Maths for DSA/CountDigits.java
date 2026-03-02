import java.util.*;

class CountDigits {
    public static int count(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int countDigit = count(n);
        System.out.print("Number of digit : " + countDigit);
        sc.close();
    }
}
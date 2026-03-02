import java.util.*;

public class Armstrong {

    public static boolean isArmstrong(int n){
        int dup = n;
        int sum = 0;
        while (n > 0){
            int last = n % 10;
            sum = sum + (last * last * last);
            n /= 10;                 
        }
        return dup == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(isArmstrong(n)){
            System.out.print("True! Armstrong");
        } else {
            System.out.print("False! Not Armstrong");
        }
        sc.close();
    }
}

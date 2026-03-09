import java.util.*;

public class SumPrint {
    public static void print(int i, int sum){
        
        if ( i < 1 ){
            System.out.print("The sum is : " + sum);
            return;            
        } 
        print(i - 1, sum + i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        print(n,0);
        sc.close();
    }
}
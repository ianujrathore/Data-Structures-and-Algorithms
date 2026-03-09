import java.util.*;

public class PrintName {
    public static void print(int i, int n){
        if ( i > n ){
            return; 
        } System.out.println("Anuj Rathore");
        print(i + 1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("How many times you want to print your name? Enter number : ");
        int n = sc.nextInt();
        
        print(1,n);
        sc.close();
    }

}
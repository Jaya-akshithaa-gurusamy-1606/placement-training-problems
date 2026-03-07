package march_06_2026;
import java.util.*;
public class Infosys_01 {
    public static int reversenum(int n){
        int rev = 0;
        while(n>0){
            int r = n%10;
            n /= 10;
            rev = rev * 10 + r;
        }
        return rev;
    }
    public static boolean ispalin(int n){
        return n == reversenum(n);
    }
    public static int palinchecker(int n){
        while(!ispalin(n)){
            int r = reversenum(n);
            n += r;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int n = sc.nextInt();
        int ans = palinchecker(n);
        System.out.print(ans);
    }
}

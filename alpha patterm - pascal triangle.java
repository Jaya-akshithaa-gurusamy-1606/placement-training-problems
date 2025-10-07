import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sp; j++) {//space loop
                System.out.print(" ");  
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)(65 + j));//increaing part of the triangle
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)(65 + j));//decreaing part of the triangle
            }
            System.out.println();
            sp--;
        }
    }
}

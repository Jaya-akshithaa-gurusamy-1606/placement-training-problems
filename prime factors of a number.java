import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        int n = sc.nextInt();
        System.out.print("The prime factors are ");
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }
}

import java.util.*;
class Main {
    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcdValue = gcd(n, m);
        int lcmValue = lcm(n, m);
        System.out.println("GCD = " + gcdValue);
        System.out.println("LCM = " + lcmValue);
    }
}

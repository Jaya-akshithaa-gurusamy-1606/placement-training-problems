import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // original number stays intact

        // Find the highest divisor (10^(number of digits - 1))
        int divisor = 1;
        while (num / divisor >= 10) {
            divisor *= 10;
        }

        int rev = 0;
        int tempDivisor = divisor;

        while (tempDivisor > 0) {
            int digit = (num / tempDivisor) % 10; // extract digit without modifying num
            rev = rev * 10 + digit;
            tempDivisor /= 10;
        }

        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + rev);
    }
}

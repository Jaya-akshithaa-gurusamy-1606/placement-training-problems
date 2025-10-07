import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // original number stays intact
        int rev = 0;
        int temp = num; // used only for calculation
        while (temp != 0) {
            int rem = temp % 10;  // get last digit
            rev = rev * 10 + rem; // build reversed number
            temp /= 10;            // remove last digit
        }

        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + rev);
    }
}

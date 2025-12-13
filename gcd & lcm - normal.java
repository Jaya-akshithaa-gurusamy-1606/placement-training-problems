import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int g = Math.min(n, m);
        int gcd = 1;
        for(int i = 1; i <= g; i++){
            if(n % i == 0 && m % i == 0){
                gcd = i;
            }
        }
        int lcm = (n * m) / gcd;
        System.out.println("GCD:"+gcd + "\nLCM:" + lcm);
    }
}

import java.util.*;
public class Main {
    static void rotateRight(int[] arr, int n, int last) {
        if (n == 0) {
            arr[0] = last;
            return;
        }
        arr[n] = arr[n - 1];
        rotateRight(arr, n - 1, last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n > 1) {
            int last = arr[n - 1];
            rotateRight(arr, n - 1, last);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

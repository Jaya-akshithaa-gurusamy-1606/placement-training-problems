import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        while (i < n - 1) {
            int correctIndex = arr[i] - 1;

            if (arr[i] <= n - 1 && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < n - 1; i++) {
            if (arr[i] != i + 1) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(n);
    }
}

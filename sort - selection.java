import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the values of array: ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int min = a[i],mini = i;
            for(int k = i;k<n;k++){
                if(min > a[k]) {
                    min = a[k];
                    mini = k;
                }
            }
            int temp = a[i];
            a[i] = a[mini];
            a[mini] = temp;
        }
        System.out.println("Array sorted: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}

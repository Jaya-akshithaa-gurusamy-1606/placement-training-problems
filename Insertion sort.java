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
            int j=i;
            while(j>0 && (a[j] < a[j-1])){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
        System.out.println("Array sorted: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}

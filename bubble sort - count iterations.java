import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int c = 0;
        for(int i=1;i<n;i++){
            if(a[i-1] > a[i]){
                int temp = a[i-1];
                a[i-1] = a[i];
                a[i] = temp;
                c++;
                i=0;
            }
            else if(a[i] == a[i-1]){
                a[i] *= a[i];
                c++;
                i=0;
            }
        }
        System.out.print("The number of steps to sort the array is "+c+"\nThe sorted array is :");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}

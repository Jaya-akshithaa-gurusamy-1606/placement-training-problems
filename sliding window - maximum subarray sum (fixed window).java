import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Enter the array values: ");
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		System.out.print("Enter the size of array to find sum: ");
		int k = sc.nextInt();
		int[] b = new int[n];
		int sum = 0;
		for(int i=0;i<k;i++) sum+=a[i];
		int max = sum;
		for(int i=1;i<n-k+1;i++){
		    sum = (sum - a[i-1]) + a[i+k-1];
		    if(max < sum) max=sum;
		}
		System.out.print(max);
	}
}

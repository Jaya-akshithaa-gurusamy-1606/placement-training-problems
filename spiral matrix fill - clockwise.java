import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the square matrix : ");
		int n = sc.nextInt();
		int c = 1;
		int[][] a = new int[n][n];
		int t = 0,b = n-1,l = 0,r = n-1;
		while(t <= b && l <= r){
		    for(int i=l;i<=r;i++)
		        a[t][i] = c++;
		    t++;
		    for(int i=t;i<=b;i++)
		        a[i][r] = c++;
		    r--;
		    for(int i=r;i>=l;i--)
		        a[b][i] = c++;
		    b--;
		    for(int i=b;i>=t;i--)
		        a[i][l] = c++;
		    l++;
		}
		System.out.println("After Adding Values in Array : ");
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(a[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}

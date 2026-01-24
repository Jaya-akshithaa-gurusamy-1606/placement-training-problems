import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the square matrix : ");
		int n = sc.nextInt();
		System.out.print("Enter the elements of the matrix : ");
		int[][] a = new int[n][n];
		for(int i=0;i<n;i++)
		    for(int j=0;j<n;j++)
		        a[i][j] = sc.nextInt();
		List<Integer> lt = new ArrayList<>();
		int t = 0,b = n-1,l = 0,r = n-1;
		while (t <= b && l <= r) {
		    for (int i = t; i <= b; i++)
                lt.add(a[i][l]);
            l++;
            for (int i = l; i <= r; i++)
                lt.add(a[b][i]);
            b--;
            for (int i = b; i >= t; i--)
                lt.add(a[i][r]);
            r--;
            for (int i = r; i >= l; i--)
                lt.add(a[t][i]);
            t++;
        }
		System.out.println("After Sprial Traversal : ");
		for(int i=0;i<lt.size();i++){
		    System.out.print(lt.get(i)+" ");
		}
	}
}

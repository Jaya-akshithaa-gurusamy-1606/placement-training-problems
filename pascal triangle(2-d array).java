import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        
        // Build Pascal's Triangle
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==j || j==0) 
                    a[i][j] = 1;
                else 
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }

        // Print with spacing for pyramid shape
        for(int i=0;i<n;i++){
            // print spaces before numbers
            for(int s=0; s<n-i-1; s++){
                System.out.print(" ");
            }
            // print numbers
            for(int j=0;j<=i;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

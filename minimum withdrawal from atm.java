package march_06_2026;
import java.util.*;
public class Infosys_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter the target : ");
        int t = sc.nextInt();
        int total = 0;
        for(int num : a) total += num;
        int x = total - t;
        if(x < 0){
            System.out.println(-1);
            return;
        }
        if(x == 0){
            System.out.println(n);
            return;
        }
        int left = 0, sum = 0, maxLen = -1;
        for(int right = 0; right < n; right++){
            sum += a[right];
            while(sum > x){
                sum -= a[left];
                left++;
            }
            if(sum == x){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        if(maxLen == -1)
            System.out.println(-1);
        else
            System.out.println(n - maxLen);
    }
}

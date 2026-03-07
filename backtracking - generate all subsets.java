package dsa_revision;
import java.util.*;
public class backtracking_ht01 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        backtracking(a,res,new ArrayList<>(),0);
        System.out.print(res);
    }
    public static void backtracking(int[] nums,List<List<Integer>> res,List<Integer> list,int st){
        res.add(new ArrayList<>(list));
        for(int i = st;i<nums.length;i++){
            list.add(nums[i]);
            backtracking(nums,res,list,i+1);
            list.remove(list.size()-1);
        }
    }
}

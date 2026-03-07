package dsa_revision;
import java.util.*;

public class backtracking_ht02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String st = sc.nextLine();
        List<String> res = new ArrayList<>();
        boolean[] vis = new boolean[st.length()];
        backtrack(st,"",vis,res);
        System.out.print(res);
    }
    public static void backtrack(String st,String path,boolean[] vis,List<String> res){
        if(path.length() == st.length()){
            res.add(path);
            return;
        }
        for(int i=0;i<st.length();i++){
            if(vis[i]) continue;
            vis[i] = true;
            backtrack(st,path+st.charAt(i),vis,res);
            vis[i] = false;
        }
    }
}

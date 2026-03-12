import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static TreeNode buildtree(){
        System.out.print("Enter the size of the tree : ");
        int n = sc.nextInt();
        int[] values = new int[n+1];
        System.out.print("Enter the values of the tree : ");
        for(int i=1;i<=n;i++)
            values[i] = sc.nextInt();
        System.out.print("Enter the edges of the tree : ");
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        for(int i=1;i<=n;i++)
            adj[i] = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        TreeNode[] nodes = new TreeNode[n+1];
        for(int i=1;i<=n;i++)
            nodes[i] = new TreeNode(values[i]);
        build(1,0,adj,nodes);
        return nodes[1];
    }
    public static void build(int u,int parent,ArrayList<Integer>[] adj,TreeNode[] nodes){
        int count = 0;
        for(int v : adj[u]){
            if(v == parent) continue;
            if(count == 0){
                nodes[u].left = nodes[v];
                count++;
            }
            else
                nodes[u].right = nodes[v];
            build(v,u,adj,nodes);
        }
    }
    public static int maxSet(TreeNode root){
        int[] res = dfs(root);
        return Math.max(res[0],res[1]);
    }
    public static int[] dfs(TreeNode root){
        if(root == null) return new int[]{0,0};
        int[] l = dfs(root.left);
        int[] r = dfs(root.right);
        int[] res = new int[2];
        res[0] = root.data + l[1] + r[1];
        res[1] = Math.max(l[0],l[1]) + Math.max(r[0],r[1]);
        return res;
    }
    public static void main(String[] args){
        TreeNode root = buildtree();
        int n = maxSet(root);
        System.out.println("The maximum sum of independent set is " + n);
    }
}

import java.util.*;
class TreeNode{
    int data;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(int data){
        this.data = data;
    }
}
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static TreeNode buildTree(){
        System.out.print("Enter the data (-1 for no node): ");
        int val = sc.nextInt();
        if(val == -1) return null;
        TreeNode root = new TreeNode(val);
        System.out.println("Enter the left child of " + val + " : ");
        root.left = buildTree();
        System.out.println("Enter the right child of " + val + " : ");
        root.right = buildTree();
        return root;
    }
    public static TreeNode prune(TreeNode root){
        if(root == null) return null;
        root.left = prune(root.left);
        root.right = prune(root.right);
        if(root.data == 0 && root.left == null && root.right == null){
            return null;
        }
        return root;
    }
    public static void display(TreeNode root){
        if(root == null) return;
        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args){
        TreeNode root = buildTree();
        root = prune(root);
        display(root);
    }
}

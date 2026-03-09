import java.util.*;
class TreeNode{
    int data;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode (int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static  TreeNode buildtree(){
        System.out.print("Enter the data ( -1 for no node) : ");
        int val = sc.nextInt();
        if(val == -1) return null;
        TreeNode root = new TreeNode(val);
        System.out.println("Enter the left child of "+val);
        root.left = buildtree();
        System.out.println("Enter the right child of "+val);
        root.right = buildtree();
        return root;
    }
    
    public static void preorder(TreeNode root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
	public static void main(String[] args) {
	    TreeNode root = buildtree();
	    System.out.print("Preorder Traversal : ");
	    preorder(root);
	}
}

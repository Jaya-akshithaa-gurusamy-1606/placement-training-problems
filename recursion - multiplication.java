import java.util.*;
public class Main{
    public static int mul(int x,int y){
        if(y == 0) return 0;
        return (x+mul(x,y-1));
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Multiplication without '*' and recursion function");
		System.out.print("Enter 2 values:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print("Product of the 2 numbers : " + mul(x,y));
	}
}

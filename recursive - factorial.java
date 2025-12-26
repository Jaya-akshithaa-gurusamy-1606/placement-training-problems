import java.util.*;
public class Main{
    public static int fact(int x){
        if(x == 1) return 1;
        return (x*fact(x-1));
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int x = sc.nextInt();
		System.out.println("Factorial value : "+fact(x));
	}
}

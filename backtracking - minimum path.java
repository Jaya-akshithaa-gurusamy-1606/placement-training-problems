package march_06_2026;
import java.util.*;
public class Infosys_04 {
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and column size : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        System.out.print("Enter the index of blocked cell : ");
        int bx = sc.nextInt();
        int by = sc.nextInt();
        maze[bx - 1][by - 1] = 1;
        back(maze, 0, 0, 0);
        System.out.print("The total number of ways are "+ans);
    }
    public static void back(int[][] maze,int r,int c,int st){
        int n = maze.length;
        int m = maze[0].length;
        if(r == n-1 && c == m-1){
            ans = Math.min(ans,st);
            return;
        }
        if(r < 0 || r >= n || c < 0 || c >= m || maze[r][c] == 1) return;
        maze[r][c] = 1;
        back(maze, r+1,c,st+1);
        back(maze, r-1,c,st+1);
        back(maze, r,c+1,st+1);
        back(maze, r,c-1,st+1);
        maze[r][c] = 0;
    }
}

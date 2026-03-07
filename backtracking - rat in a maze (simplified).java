package dsa_revision;
import java.util.*;
public class backtracking_ht03 {
    static List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        int n = maze.length;
        if (maze[0][0] == 1)
            solve(maze, 0, 0, "", n);
        System.out.println(result);
    }
    public static void solve(int[][] maze, int row, int col, String path, int n) {
        if (row == n - 1 && col == n - 1) {
            result.add(path);
            return;
        }
        if (row + 1 < n && maze[row + 1][col] == 1) {
            solve(maze, row + 1, col, path + "D", n);
        }
        if (col + 1 < n && maze[row][col + 1] == 1) {
            solve(maze, row, col + 1, path + "R", n);
        }
    }
}

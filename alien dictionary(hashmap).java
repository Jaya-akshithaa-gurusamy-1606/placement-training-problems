import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for(int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        System.out.print("Enter number of unique characters (K): ");
        int K = sc.nextInt();
        Map<Character, List<Character>> graph = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();
        for(char c = 'a'; c < 'a' + K; c++) {
            graph.put(c, new ArrayList<>());
            indegree.put(c, 0);
        }
        for(int i = 0; i < n - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];
            if(w1.length() > w2.length() && w1.startsWith(w2)) {
                System.out.println("Alien Dictionary Order:");
                System.out.println("Invalid ordering");
                return;
            }
            int len = Math.min(w1.length(), w2.length());
            for(int j = 0; j < len; j++) {
                if(w1.charAt(j) != w2.charAt(j)) {
                    char u = w1.charAt(j);
                    char v = w2.charAt(j);
                    graph.get(u).add(v);
                    indegree.put(v, indegree.get(v) + 1);
                    break;
                }
            }
        }
        Queue<Character> q = new LinkedList<>();
        for(char c : indegree.keySet()) {
            if(indegree.get(c) == 0)
                q.add(c);
        }
        String ans = "";
        while(!q.isEmpty()) {
            char cur = q.poll();
            ans += cur;
            for(char next : graph.get(cur)) {
                indegree.put(next, indegree.get(next) - 1);
                if(indegree.get(next) == 0)
                    q.add(next);
            }
        }
        System.out.println("Alien Dictionary Order:");
        if(ans.length() != K)
            System.out.println("Invalid ordering");
        else
            System.out.println(ans);
    }
}

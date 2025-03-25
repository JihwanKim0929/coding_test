import java.util.*;
import java.io.*;

class p46{
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static PriorityQueue<Integer> answer;
    static int k;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++)
            graph[i] = new ArrayList<>();
        visited = new boolean[n + 1];
        answer = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int orig = Integer.parseInt(st.nextToken());
            int dest = Integer.parseInt(st.nextToken());
            graph[orig].add(dest);
        }

        bfs(x);

        if (answer.isEmpty())
            System.out.println(-1);
            else {
                while (!answer.isEmpty())
                    System.out.println(answer.poll());
            }
        }

    static void bfs(int startNode){
        Queue<int[]> queue = new LinkedList<>();
        visited[startNode] = true;
        queue.offer(new int[]{startNode,0});
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowNode = now[0];
            int nowDistance = now[1];
            for(int i:graph[nowNode]){
                if(!visited[i]){
                    int nextDistance = nowDistance+1;
                    if(nextDistance==k)
                        answer.offer(i);
                    visited[i]=true;
                    queue.offer(new int[]{i,nextDistance});
                }
            }
        }
    }
}
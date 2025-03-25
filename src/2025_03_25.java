//import java.util.*;
//import java.io.*;
//
//class p46{
//    static ArrayList<Integer>[] graph;
//    static boolean[] visited;
//    static PriorityQueue<Integer> answer;
//    static int k;
//    public static void main(String[] args)throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        k = Integer.parseInt(st.nextToken());
//        int x = Integer.parseInt(st.nextToken());
//        graph = new ArrayList[n + 1];
//        for (int i = 1; i <= n; i++)
//            graph[i] = new ArrayList<>();
//        visited = new boolean[n + 1];
//        answer = new PriorityQueue<>();
//        for (int i = 0; i < m; i++) {
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            graph[orig].add(dest);
//        }
//
//        bfs(x);
//
//        if (answer.isEmpty())
//            System.out.println(-1);
//            else {
//                while (!answer.isEmpty())
//                    System.out.println(answer.poll());
//            }
//        }
//
//    static void bfs(int startNode){
//        Queue<int[]> queue = new LinkedList<>();
//        visited[startNode] = true;
//        queue.offer(new int[]{startNode,0});
//        while(!queue.isEmpty()){
//            int[] now = queue.poll();
//            int nowNode = now[0];
//            int nowDistance = now[1];
//            for(int i:graph[nowNode]){
//                if(!visited[i]){
//                    int nextDistance = nowDistance+1;
//                    if(nextDistance==k)
//                        answer.offer(i);
//                    visited[i]=true;
//                    queue.offer(new int[]{i,nextDistance});
//                }
//            }
//        }
//    }
//}

import java.util.*;
import java.io.*;
class p47{
    static int n;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] howMany;
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n+1];
        for(int i=1;i<=n;i++)
            graph[i] = new ArrayList<>();

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int dest = Integer.parseInt(st.nextToken());
            int orig = Integer.parseInt(st.nextToken());
            graph[orig].add(dest);
        }

        howMany = new int[n+1];

        for(int i=1;i<=n;i++)
            bfs(i);

        int max = howMany[1];
        for(int i=2;i<=n;i++)
            if(howMany[i]>max)
                max = howMany[i];

        for(int i=1;i<=n;i++)
            if(howMany[i]==max)
                System.out.print(i+" ");
    }
    static void bfs(int startNode){
        visited = new boolean[n+1];
        Queue<Integer>queue = new LinkedList<>();
        queue.offer(startNode);
        visited[startNode] = true;
        howMany[startNode]++;
        while(!queue.isEmpty()){
            int nowNode = queue.poll();
            for(int i:graph[nowNode]){
                if(!visited[i]){
                    howMany[startNode]++;
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}
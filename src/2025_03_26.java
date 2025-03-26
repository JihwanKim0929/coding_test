//import java.io.*;
//import java.util.*;
//
//class p48{
//    static ArrayList<Integer>[] graph;
//    static boolean[] visited;
//    static int[] set;
//    static boolean answer;  //true면 NO
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int t = Integer.parseInt(br.readLine());
//        for(int z=0;z<t;z++){
//            st = new StringTokenizer(br.readLine());
//            int v = Integer.parseInt(st.nextToken());
//            int e = Integer.parseInt(st.nextToken());
//            graph = new ArrayList[v+1];
//            for(int i=1;i<=v;i++)
//                graph[i] = new ArrayList<>();
//            for(int i=0;i<e;i++){
//                st = new StringTokenizer(br.readLine());
//                int orig = Integer.parseInt(st.nextToken());
//                int dest = Integer.parseInt(st.nextToken());
//                graph[orig].add(dest);
//                graph[dest].add(orig);  //여기가 핵심
//            }
//            visited = new boolean[v+1];
//            set = new int[v+1];
//            answer = false;
//            for(int i=1;i<=v;i++){
//                if(!answer)
//                    dfs(i);
//            }
//            if(answer)
//                System.out.println("NO");
//            else
//                System.out.println("YES");
//        }
//
//    }
//    static void dfs(int node){
//        if(visited[node])
//            return;
//        visited[node] = true;
//        for(int i:graph[node]){
//            if(visited[i]){
//                if(set[i]==set[node])
//                    answer = true;
//            }
//            else{
//                set[i] = (set[node]+1)%2;
//                dfs(i);
//            }
//        }
//    }
//}

import java.util.*;
import java.io.*;
class p49{
    static int[] sender = {0,0,1,1,2,2};
    static int[] receiver = {1,2,0,2,0,1};
    static int[] volume;    //각 용량
    static boolean[][] visited;
    static boolean[] answer;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //각 용량 따로 저장
        volume = new int[3];
        for(int i=0;i<3;i++)
            volume[i] = Integer.parseInt(st.nextToken());
        answer = new boolean[volume[2]+1];
        visited = new boolean[volume[0]+1][volume[1]+1];

        //처음에는 a,b가 0
        visited[0][0] = true;
        answer[volume[2]] = true;

        //bfs하면서 각 경우들에 대해 한번도 없던 경우면 큐에 추가,
        //만약 a가 0이면 answer에 추가
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowA = now[0];
            int nowB = now[1];
            int nowC = volume[2] - nowA - nowB;
            for(int i=0;i<6;i++){
                int[] next = {nowA,nowB,nowC};
                next[receiver[i]]+=next[sender[i]];
                next[sender[i]] = 0;
                //넘치면
                if(next[receiver[i]]>volume[receiver[i]]){
                    next[sender[i]] = next[receiver[i]]-volume[receiver[i]];
                    next[receiver[i]] = volume[receiver[i]];
                }

                if(!visited[next[0]][next[1]]){
                    visited[next[0]][next[1]] = true;
                    queue.offer(new int[]{next[0],next[1]});
                    if(next[0]==0)
                        answer[next[2]] = true;
                }
            }
        }

        for(int i=0;i<=volume[2];i++)
            if(answer[i])
                System.out.print(i+" ");

    }
}
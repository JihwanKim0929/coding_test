//import java.util.*;
//import java.io.*;
//class p26{
//    static ArrayList<Integer>[] graph;
//    static boolean[] visited;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        int s = Integer.parseInt(st.nextToken());
//
//        graph = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            graph[i] =  new ArrayList<>();
//        visited = new boolean[n+1];
//
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            graph[a].add(b);
//            graph[b].add(a);
//        }
//
//        for(int i=1;i<=n;i++)
//            Collections.sort(graph[i]);
//
//        dfs(s);
//
//        System.out.println();
//
//        Arrays.fill(visited,false);
//
//        bfs(s);
//
//
//
//    }
//
//    static void dfs(int node){
//        if(visited[node])
//            return;
//        System.out.print(node+" ");
//        visited[node] = true;
//        for(int i:graph[node]){
//            if(!visited[i])
//                dfs(i);
//        }
//    }
//
//    static void bfs(int node){
//        //큐 하나 만들고 1번 삽입, 이후 원소 하나씩 폴 하면서 해당 원소에 연결된 방문
//        //안된 원소들 큐에 삽입
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(node);
//        visited[node] = true;
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            System.out.print(now+" ");
//            for(int i:graph[now]){
//                if(!visited[i]){
//                    visited[i] = true;
//                    queue.offer(i);
//                }
//            }
//        }
//    }
//}

//nxm 배열을 만들어서 최소 거리 저장
//만약 i,j 노드에 도달 했다고 하면 이제 거기서 갈 수 있는 곳들을 찾아야함
//그때 현재 위치의 최소거리+1이 기존 i,j의 최소거리보다 짧다면 업데이트 하고 큐에 삽입

//import java.util.*;
//import java.io.*;
//class p27{
//    static int n,m;
//    static int[][] A;
//    static boolean[][] visited;
//    static int[] dx = {0,0,-1,1};
//    static int[] dy = {-1,1,0,0};
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        A = new int[n+1][m+1];
//        for(int i=1;i<=n;i++){
//            String s = br.readLine();
//            for(int j=1;j<=m;j++){
//                A[i][j] = s.charAt(j-1)-'0';
//            }
//        }
//        visited = new boolean[n+1][m+1];
//        bfs(1,1);
//        System.out.println(A[n][m]);
//    }
//    static void bfs(int a,int b){
//        Queue<int[]> queue = new LinkedList<>();
//        visited[a][b] = true;
//        queue.offer(new int[]{a,b});
//        while(!queue.isEmpty()){
//            int[] now = queue.poll();
//            for(int i=0;i<4;i++){
//                int x = now[0]+dx[i];
//                int y = now[1]+dy[i];
//                if(x>=1&&x<=n&&y>=1&&y<=m
//                &&!visited[x][y]&&A[x][y]!=0){
//                    visited[x][y] = true;
//                    A[x][y]=A[now[0]][now[1]]+1;
//                    queue.offer(new int[]{x,y});
//                }
//            }
//        }
//    }
//}

//why wrong
//import java.util.*;
//import java.io.*;
//class p28{
//    static ArrayList<int[]>[] graph;
//    static boolean[] visited;
//    static int[] distance;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        graph = new ArrayList[n+1];
//        for(int i=1;i<=n;i++){
//            graph[i] = new ArrayList<>();
//        }
//        visited = new boolean[n+1];
//        distance = new int[n+1];
//        for(int i=1;i<=n;i++){
//            st = new StringTokenizer(br.readLine());
//            st.nextToken();
//            while(true){
//                int a = Integer.parseInt(st.nextToken());
//                if(a==-1)
//                    break;
//                int b = Integer.parseInt(st.nextToken());
//                graph[i].add(new int[]{a,b});
//            }
//        }
//
//        //아무거나 하나 잡아서 제일 먼놈 찾기
//        bfs(1);
//        //찾은놈에서 또 제일 먼 곳 찾기
//        int maxIdx = 1;
//        for(int i=2;i<=n;i++){
//            if(distance[maxIdx]<distance[i])
//                maxIdx = i;
//        }
//
//        Arrays.fill(visited,false);
//        Arrays.fill(distance,0);
//        bfs(maxIdx);
//
//        int answer = distance[1];
//        for(int i=2;i<=n;i++)
//            if(distance[i]>answer)
//                answer = distance[i];
//
//        System.out.println(answer);
//    }
//
//    static void bfs(int node){
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(node);
//        visited[node] = true;
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            for(int[] next: graph[now]){
//                if(!visited[next[0]]){
//                    visited[next[0]] = true;
//                    distance[next[0]] = distance[now]+next[1];
//                    queue.offer(next[0]);
//                }
//            }
//        }
//    }
//}
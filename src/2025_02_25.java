//import java.util.*;
//import java.io.*;
//class p74{
//    static int n;
//    static ArrayList<Integer>[] A;
//    static int[] parent;
//    static int[] depth;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        n = Integer.parseInt(br.readLine());
//        A = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            A[i] = new ArrayList<>();
//        parent = new int[n+1];
//        depth = new int[n+1];
//        for(int i=0;i<n-1;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            A[a].add(b);
//            A[b].add(a);
//        }
//        BFS(1);
//        int m = Integer.parseInt(br.readLine());
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(LCA(a,b));
//        }
//    }
//
//    static int LCA(int a, int b){
//        if(depth[a]>depth[b]) {
//            int tmp = a;
//            a = b;
//            b = tmp;
//        }
//        while(depth[a]<depth[b])
//            b = parent[b];
//        while(a!=b) {
//            a = parent[a];
//            b = parent[b];
//        }
//        return a;
//    }
//
//    static void BFS(int startNode){
//        Queue<Integer> q = new LinkedList<>();
//        boolean[] visited = new boolean[n+1];
//        visited[startNode] = true;
//        depth[startNode] = 1;
//        q.offer(startNode);
//        while(!q.isEmpty()){
//            int now = q.poll();
//            for(int i:A[now]){
//                if(!visited[i]){
//                    visited[i] = true;
//                    parent[i] = now;
//                    depth[i] = depth[now]+1;
//                    q.offer(i);}
//                }
//        }
//    }
//
//}

//import java.util.*;
//import java.io.*;
//class p75{
//    static ArrayList<Integer>[] A;
//    static int[] depth;
//    static int[][] parent;
//    static boolean[] visited;
//    static int maxK;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        A = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            A[i] = new ArrayList<>();
//        for(int i=0;i<n-1;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            A[a].add(b);
//            A[b].add(a);
//        }
//        depth = new int[n+1];
//        maxK = 0;
//        int tmp = 1;
//        while(tmp<=n){
//            tmp*=2;
//            maxK++;
//        }
//        parent = new int[maxK+1][n+1];
//        visited = new boolean[n+1];
//        BFS(1);
//        for(int i=1;i<=maxK;i++){
//            for(int j=1;j<=n;j++){
//                parent[i][j]=parent[i-1][parent[i-1][j]];
//            }
//        }
//
//        int m = Integer.parseInt(br.readLine());
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(LCA(a,b));
//        }
//    }
//
//    static int LCA(int a, int b){
//        //a가 depth가 더 작도록
//        if(depth[a]>depth[b]){
//            int tmp = a;
//            a = b;
//            b = tmp;
//        }
//        //a와 b depth 동일하게
//        for(int i = maxK;i>=0;i--){
//            if(Math.pow(2,i)<=depth[b]-depth[a])
//                if(depth[a] <= depth[parent[i][b]])
//                    b = parent[i][b];
//        }
//
//        for(int i= maxK;i>=0;i--){
//            if(parent[i][a]!=parent[i][b]){
//                a = parent[i][a];
//                b = parent[i][b];
//            }
//        }
//        int result = a;
//        //k가 0되서 다르면 위에꺼 아니면 현재위치
//        if(a!=b)
//            result = parent[0][a];
//        return result;
//    }
//
//    static void BFS(int node){
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(node);
//        visited[node] = true;
//        depth[node] = 0;
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            for(int i:A[now]){
//                if(!visited[i]){
//                    visited[i]=true;
//                    depth[i]=depth[now]+1;
//                    parent[0][i]=now;
//                    queue.add(i);
//                }
//            }
//        }
//    }
//}
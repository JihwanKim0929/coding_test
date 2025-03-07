//import java.io.*;
//import java.util.*;
//class p64{
//    static int[] A;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int v = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        A = new int[v+1];
//        for(int i=0;i<v+1;i++)
//            A[i]=i;
//        PriorityQueue<Edge> q = new PriorityQueue<>();
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            int val = Integer.parseInt(st.nextToken());
//            q.add(new Edge(orig,dest,val));
//        }
//        int useEdge = 0;
//        int sum = 0;
//        while(useEdge<v-1){
//            Edge nowEdge = q.poll();
//            if(find(nowEdge.s)!=find(nowEdge.e)){
//                union(nowEdge.s,nowEdge.e);
//                useEdge++;
//                sum+=nowEdge.val;
//            }
//        }
//        System.out.println(sum);
//    }
//    static int find(int node){
//        if(A[node]==node)
//            return node;
//        A[node] = find(A[node]);
//        return A[node];
//    }
//    static void union(int a, int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b)
//            A[b]=a;
//    }
//
//}
//
//class Edge implements Comparable<Edge>{
//    int s;
//    int e;
//    int val;
//    Edge(int s, int e, int val){
//        this.s=s;
//        this.e=e;
//        this.val=val;
//    }
//
//    @Override
//    public int compareTo(Edge e){
//        return val-e.val;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p65{
//    static int[] dr = {0,0,-1,1};
//    static int[] dc = {1,-1,0,0};
//    static int[][] map;
//    static int n,m;
//    static int islandNum;
//    static ArrayList<ArrayList<int[]>> islandList;
//    static ArrayList<int[]> mList;
//    static boolean[][] visited;
//    static PriorityQueue<Edge> edgeQ;
//    static int[] parent;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        map = new int[n][m];
//        for(int i=0;i<n;i++){
//            st = new StringTokenizer(br.readLine());
//            for(int j=0;j<m;j++){
//                map[i][j]=Integer.parseInt(st.nextToken());
//            }
//        }
//        islandNum = 1;
//        islandList = new ArrayList<>();
//        visited = new boolean[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(map[i][j]!=0 && !visited[i][j]){
//                    BFS(i,j);
//                    islandList.add(mList);
//                    islandNum++;
//                }
//            }
//        }
//
//        edgeQ = new PriorityQueue<>();
//
//        for(int i=0;i<islandList.size();i++){
//            ArrayList<int[]> now = islandList.get(i);
//            for(int[] j:now){
//                int r = j[0];
//                int c = j[1];
//                int now_s = map[r][c];
//                for(int d=0;d<4;d++){
//                    int tmpR = dr[d];
//                    int tmpC = dc[d];
//                    int bLength = 0;
//                    while(r+tmpR>=0 && r+tmpR<n && c+tmpC>=0 && c+tmpC<m){
//                        if(map[r+tmpR][c+tmpC]==now_s)
//                            break;
//                        else if(map[r+tmpR][c+tmpC]!=0) {
//                            if (bLength > 1)
//                                edgeQ.add(new Edge(now_s, map[r + tmpR][c + tmpC], bLength));
//                            break;
//                        }
//                        else
//                            bLength++;
//
//                        if(tmpR>0) tmpR++;
//                        else if(tmpR<0) tmpR--;
//                        else if(tmpC>0) tmpC++;
//                        else if(tmpC<0) tmpC--;
//                    }
//                }
//            }
//        }
//
//        parent = new int[islandNum];
//        for(int i=0;i<islandNum;i++){
//            parent[i]=i;
//        }
//
//        int useEdge = 0;
//        int result = 0;
//        while(!edgeQ.isEmpty()){
//            Edge now = edgeQ.poll();
//            if(find(now.s)!=find(now.e)){
//                union(now.s,now.e);
//                useEdge++;
//                result+=now.val;
//            }
//        }
//
//        if(useEdge==islandNum-2)
//            System.out.println(result);
//        else
//            System.out.println(-1);
//
//
//    }
//    static void BFS(int a, int b){
//        Queue<int[]> q = new LinkedList<>();
//        mList = new ArrayList<>();
//        int[] start = {a,b};
//        q.add(start);
//        visited[a][b]=true;
//        map[a][b]=islandNum;
//        mList.add(start);
//        while(!q.isEmpty()){
//            int[] now = q.poll();
//            for(int i=0;i<4;i++){
//                int tmpR = dr[i];
//                int tmpC = dc[i];
//                while(now[0]+tmpR>=0 && now[0]+tmpR<n && now[1]+tmpC>=0 && now[1]+tmpC<m){
//                    if(map[now[0]+tmpR][now[1]+tmpC]!=0 && !visited[now[0]+tmpR][now[1]+tmpC]){
//                        addToIsland(now[0]+tmpR,now[1]+tmpC,q);
//                    }else break;
//                    if(tmpC<0) tmpC--;
//                    else if(tmpC>0) tmpC++;
//                    else if(tmpR>0) tmpR++;
//                    else if(tmpR<0) tmpR--;
//                }
//            }
//        }
//    }
//
//    static void addToIsland(int a, int b, Queue<int[]> q){
//        map[a][b]=islandNum;
//        visited[a][b]=true;
//        q.add(new int[]{a,b});
//        mList.add(new int[]{a,b});
//    }
//
//    static int find(int a){
//        if(parent[a]==a)
//            return a;
//        else parent[a] = find(parent[a]);
//        return parent[a];
//    }
//
//    static void union(int a, int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b)
//            parent[b]=a;
//    }
//}
//
//class Edge implements Comparable<Edge>{
//    int s;
//    int e;
//    int val;
//    Edge(int s, int e, int val){
//        this.e=e;
//        this.s=s;
//        this.val=val;
//    }
//    public int compareTo(Edge e){
//        return val-e.val;
//    }
//}
//

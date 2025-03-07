//import java.io.*;
//import java.util.*;
//
//class p56{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int v = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        int startNode = Integer.parseInt(br.readLine());
//        ArrayList<Edge>[] A = new ArrayList[v+1];
//        for(int i=1;i<=v;i++)
//            A[i] = new ArrayList<>();
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            int distance = Integer.parseInt(st.nextToken());
//            A[orig].add(new Edge(dest,distance));
//        }
//        int[] dist = new int[v+1];
//        for(int i=1;i<=v;i++)
//            dist[i] = Integer.MAX_VALUE;
//        dist[startNode] = 0;
//        boolean[] visited = new boolean[v+1];
//        PriorityQueue<Edge> q = new PriorityQueue<Edge>();
//        q.offer(new Edge(startNode,0));
//        while(!q.isEmpty()){
//            Edge nowEdge = q.poll();
//            if(visited[nowEdge.vertex])
//                continue;
//            visited[nowEdge.vertex] = true;
//            for(Edge i:A[nowEdge.vertex]){
//                if(dist[i.vertex]>dist[nowEdge.vertex]+i.value){
//                    dist[i.vertex] = dist[nowEdge.vertex]+i.value;
//                    q.add(new Edge(i.vertex,dist[i.vertex]));
//                }
//            }
//        }
//        for(int i=1;i<=v;i++){
//            if(dist[i]==Integer.MAX_VALUE)
//                System.out.println("INF");
//            else
//                System.out.println(dist[i]);
//        }
//    }
//}
//
//class Edge implements Comparable<Edge>{
//    int vertex;
//    int value;
//    Edge(int vertex, int value){
//        this.vertex = vertex;
//        this.value = value;
//    }
//    @Override
//    public int compareTo(Edge e) {
//        if(this.value>e.value)
//            return 1;
//        return -1;
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p57{
//    public static void main(String[] args)throws IOException{
//        ArrayList<Edge>[] A;
//        int[] cost;
//        boolean[] visited;
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int v = Integer.parseInt(br.readLine());
//        int e = Integer.parseInt(br.readLine());
//        A = new ArrayList[v+1];
//        for(int i=1;i<=v;i++)
//            A[i] = new ArrayList<>();
//        cost = new int[v+1];
//        for(int i=1;i<=v;i++)
//            cost[i] = Integer.MAX_VALUE;
//        visited = new boolean[v+1];
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            int val = Integer.parseInt(st.nextToken());
//            A[orig].add(new Edge(dest,val));
//        }
//        st = new StringTokenizer(br.readLine());
//        int startVertex = Integer.parseInt(st.nextToken());
//        int endVertex = Integer.parseInt(st.nextToken());
//        cost[startVertex] = 0;
//        PriorityQueue<Edge> q = new PriorityQueue<>();
//        q.add(new Edge(startVertex,0));
//        while(!q.isEmpty()){
//            Edge now = q.poll();
//            if(visited[now.dest])
//                continue;
//            visited[now.dest]=true;
//            for(Edge next:A[now.dest]){
//                if(cost[next.dest]>cost[now.dest]+next.value){
//                    cost[next.dest]=cost[now.dest]+next.value;
//                    q.add(new Edge(next.dest,cost[next.dest]));
//                }
//            }
//        }
//        System.out.println(cost[endVertex]);
//    }
//}
//
//class Edge implements Comparable<Edge>{
//    int dest;
//    int value;
//    Edge(int dest, int value){
//        this.dest = dest;
//        this.value = value;
//    }
//
//    @Override
//    public int compareTo(Edge e){
//        if(this.value>e.value)
//            return 1;
//        return -1;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p58{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int v = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        ArrayList<Edge>[] A = new ArrayList[v+1];
//        for(int i=1;i<=v;i++)
//            A[i] = new ArrayList<>();
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int o = Integer.parseInt(st.nextToken());
//            int d = Integer.parseInt(st.nextToken());
//            int val = Integer.parseInt(st.nextToken());
//            A[o].add(new Edge(d,val));
//        }
//        PriorityQueue<Integer>[] dist = new PriorityQueue[v+1];
//        Comparator<Integer> cp = new Comparator<>(){
//            @Override
//            public int compare(Integer o1, Integer o2){
//                return o2-o1;
//            }
//        };
//        for(int i=1;i<=v;i++)
//            dist[i] = new PriorityQueue<>(k,cp);
//
//        dist[1].add(0);
//
//        PriorityQueue<Edge> q = new PriorityQueue<>();
//        q.add(new Edge(1,0));
//        while(!q.isEmpty()){
//            Edge now = q.poll();
//            for(Edge next:A[now.dest]){
//                if(dist[next.dest].size()<k){
//                    dist[next.dest].add(now.value+next.value);
//                    q.add(new Edge(next.dest,now.value+next.value));
//                }
//                else if(dist[next.dest].peek()>now.value+next.value){
//                    dist[next.dest].poll();
//                    dist[next.dest].add(now.value+next.value);
//                    q.add(new Edge(next.dest,now.value+next.value));
//                }
//            }
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for(int i=1;i<=v;i++){
//            if(dist[i].size()==k)
//                bw.write(dist[i].peek()+"\n");
//            else
//                bw.write(-1+"\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}
//class Edge implements Comparable<Edge>{
//    int dest;
//    int value;
//    Edge(int dest, int value){
//        this.dest = dest;
//        this.value = value;
//    }
//    public int compareTo(Edge e){
//        if(this.value>e.value)
//            return 1;
//        return -1;
//    }
//}
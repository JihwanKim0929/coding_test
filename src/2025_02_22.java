//import java.util.*;
//import java.io.*;
//
//class p66{
//    static int[] parent;
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int v = Integer.parseInt(br.readLine());
//        int sum = 0;
//        PriorityQueue<Edge> edgeList = new PriorityQueue<>();
//        for(int i=0;i<v;i++){
//            String s = br.readLine();
//            for(int j=0;j<s.length();j++){
//                char c = s.charAt(j);
//                int tmp=0;
//                if(c>='A'&&c<='Z')
//                    tmp = c-'A'+27;
//                else if(c>='a'&&c<='z')
//                    tmp = c-'a'+1;
//                sum+=tmp;
//                if(i!=j && tmp!=0)
//                    edgeList.add(new Edge(i,j,tmp));
//            }
//        }
//        parent = new int[v];
//        for(int i=0;i<v;i++){
//            parent[i]=i;
//        }
//
//        int useEdge = 0;
//        while(!edgeList.isEmpty()){
//            Edge now = edgeList.poll();
//            if(find(now.s)!=find(now.e)){
//                union(now.s,now.e);
//                useEdge++;
//                sum-=now.val;
//            }
//        }
//        if(useEdge==v-1)
//            System.out.println(sum);
//        else
//            System.out.println(-1);
//
//    }
//
//    static int find(int node){
//        if(parent[node]==node)
//            return node;
//        return parent[node] = find(parent[node]);
//    }
//
//    static void union(int a, int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b)
//            parent[b] = a;
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
//        return val - e.val;
//    }
//}
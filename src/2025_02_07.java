//import java.io.*;
//import java.util.*;
//class p44{
//    static ArrayList<node>[] A;
//    static boolean[] visited;
//    static long lcm;
//    static long[] D;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        A = new ArrayList[n];
//        visited = new boolean[n];
//        D = new long[n];
//        for(int i=0;i<n;i++){
//            A[i] = new ArrayList<>();
//        }
//        lcm = 1;
//        for(int i=0;i<n-1;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int p = Integer.parseInt(st.nextToken());
//            int q = Integer.parseInt(st.nextToken());
//            A[a].add(new node(b,p,q));
//            A[b].add(new node(a,q,p));
//            lcm = lcm*(p*q/gcd(p,q));
//        }
//        D[0] = lcm;
//        DFS(0);
//        long mgcd = lcm;
//        for(int i=1;i<n;i++){
//            mgcd = gcd(mgcd,D[i]);
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(D[i]/mgcd+" ");
//        }
//
//    }
//    static long gcd(long a, long b){
//        if(b==0)
//            return a;
//        else
//            return gcd(b,a%b);
//    }
//    static void DFS(int n){
//        visited[n] =true;
//        for(node i: A[n]){
//            int next = i.dest;
//            if(!visited[next]){
//                D[next] = D[n] * i.q / i.p;
//                DFS(next);
//            }
//        }
//    }
//}
//
//class node{
//    int dest;
//    int p;
//    int q;
//    public node(int dest,int p, int q){
//        this.dest=dest;
//        this.p=p;
//        this.q=q;
//    }
//}
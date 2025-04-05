//import java.util.*;
//import java.io.*;
//
//class p71{
//    static int[] tree;
//    static int leafSize;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        //리프 노드 사이즈 정하기
//        leafSize = 1;
//        while(leafSize<=n){
//            leafSize*=2;
//        }
//
//        //리프노드 *2 만큼 배열 생성
//        int treeSize = leafSize*2;
//        tree = new int[treeSize];
//        Arrays.fill(tree,Integer.MAX_VALUE);
//
//
//        //데이터 입력받아 리프부터 채우기
//        for(int i=getIdx(1);i<=getIdx(n);i++){
//            int tmp = Integer.parseInt(br.readLine());
//            tree[i] = tmp;
//        }
//        setTree();
//
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(cal(a,b));
//        }
//
//    }
//
//    static int getIdx(int n){
//        return leafSize+n-1;
//    }
//
//    static void setTree(){
//        int idx = leafSize-1;
//        while(idx>=1){
//            tree[idx] = Math.min(tree[idx*2],tree[idx*2+1]);
//            idx--;
//        }
//    }
//
//    static int cal(int a, int b){
//        int l = getIdx(a);
//        int r = getIdx(b);
//        int min = Integer.MAX_VALUE;
//
//        while(l<=r){
//            if(l%2==1)
//                min = Math.min(min,tree[l]);
//            if(r%2==0)
//                min = Math.min(min,tree[r]);
//            l = (l+1)/2;
//            r = (r-1)/2;
//        }
//
//        return min;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p73{
//    static long[] tree;
//    static int leafSize;
//    static final long divisor = 1000000007;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int s = Integer.parseInt(st.nextToken());
//        setLeafSize(n);
//        tree = new long[leafSize*2];
//        Arrays.fill(tree,1);
//        for(int i=getIdx(1);i<=getIdx(n);i++)
//            tree[i] = Long.parseLong(br.readLine());
//        setTree();
//        for(int i=0;i<c+s;i++){
//            st = new StringTokenizer(br.readLine());
//            int menu = Integer.parseInt(st.nextToken());
//            long a = Long.parseLong(st.nextToken());
//            long b = Long.parseLong(st.nextToken());
//            if(menu==1)
//                changeVal((int)a,b);
//            else
//                System.out.println(cal((int)a,(int)b));
//        }
//
//
//    }
//    static int getIdx(int n){
//        return leafSize+n-1;
//    }
//    static void setLeafSize(int n){
//        int tmp = 1;
//        while(tmp<n){
//            tmp*=2;
//        }
//        leafSize = tmp;
//    }
//    static void setTree(){
//        int idx = leafSize-1;
//        while(idx>=1){
//            tree[idx] = tree[idx*2]*tree[idx*2+1]%divisor;
//            idx--;
//        }
//    }
//    static long cal(int a, int b){
//        long ans = 1;
//        int l = getIdx(a);
//        int r = getIdx(b);
//        while(l<=r){
//            if(l%2==1)
//                ans=ans*tree[l]%divisor;
//            if(r%2==0)
//                ans=ans*tree[r]%divisor;
//            l = (l+1)/2;
//            r = (r-1)/2;
//        }
//        return ans;
//    }
//
//    static void changeVal(int n, long val){
//        int idx = getIdx(n);
//        tree[idx] = val;
//        while(idx>1){
//            idx/=2;
//            tree[idx] = tree[idx*2]*tree[idx*2+1]%divisor;
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p74{
//    static boolean[] visited;
//    static ArrayList<Integer>[] graph;
//    static int[] parent;
//    static int[] depth;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        graph = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            graph[i] = new ArrayList<>();
//        depth = new int[n+1];
//        parent = new int[n+1];
//        visited = new boolean[n+1];
//        for(int i=0;i<n-1;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            graph[a].add(b);
//            graph[b].add(a);
//        }
//        depth[1] = 0;
//        dfs(1);
//
//        //질문 받기
//        int q = Integer.parseInt(br.readLine());
//        for(int i=0;i<q;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(getLCA(a,b));
//        }
//    }
//    static void dfs(int n){
//        if(visited[n])
//            return;
//        visited[n]=true;
//        for(int i:graph[n]){
//            if(!visited[i]){
//                depth[i] = depth[n]+1;
//                parent[i] = n;
//                dfs(i);
//            }
//        }
//    }
//
//    static int getLCA(int a, int b){
//        //a가 깊이가 더 작도록 만듦
//        if(depth[a]>depth[b]){
//            int tmp = b;
//            b = a;
//            a = tmp;
//        }
//        //b가 a의 깊이가 되도록 올림
//        while(depth[b]>depth[a]){
//            b = parent[b];
//            if(a==b)
//                return a;
//        }
//        while(true){
//            if(a==b)
//                return a;
//            a = parent[a];
//            b = parent[b];
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p75{
//    static ArrayList<Integer>[] graph;
//    static int[] depth;
//    static int[][] p;
//    static int maxK;
//    static boolean[] visited;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        graph = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            graph[i] = new ArrayList<>();
//
//        StringTokenizer st;
//        for(int i=0;i<n-1;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            graph[a].add(b);
//            graph[b].add(a);
//        }
//        int tmp = 1;
//        maxK=0;
//        while(tmp<n){
//            tmp*=2;
//            maxK++;
//        }
//        depth = new int[n+1];
//        p = new int[maxK+1][n+1];
//
//        depth[1] = 0;
//        visited = new boolean[n+1];
//        dfs(1);
//
//        for(int k=1;k<=maxK;k++){
//            for(int i=1;i<=n;i++){
//                p[k][i] = p[k-1][p[k-1][i]];
//            }
//        }
//
//        int q = Integer.parseInt(br.readLine());
//        for(int i=0;i<q;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(getLCA(a,b));
//        }
//    }
//    static void dfs(int n){
//        if(visited[n])
//            return;
//        visited[n]=true;
//        for(int i:graph[n]){
//            if(!visited[i]){
//                depth[i]=depth[n]+1;
//                p[0][i] = n;
//                dfs(i);
//            }
//        }
//    }
//    static int getLCA(int a, int b){
//        if(depth[a]>depth[b]){
//            int tmp = b;
//            b = a;
//            a = tmp;
//        }
//        //높이 맞추기
//        for(int i = maxK;i>=0;i--){
//            if(depth[b]-depth[a]>=Math.pow(2,i)){
//                b = p[i][b];
//            }
//        }
//        //찾기
//        for(int k = maxK;k>=0;k--){
//            if(p[k][a]!=p[k][b]){
//                a = p[k][a];
//                b = p[k][b];
//            }
//        }
//        if(a!=b)
//            return p[0][a];
//        return a;
//    }
//}
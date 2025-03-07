//import java.util.*;
//import java.io.*;
//
//class p23{
//    static ArrayList<Integer>[] A;
//    static boolean[] visited;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        A = new ArrayList[n+1];
//        visited = new boolean[n+1];
//        for(int i=1;i<=n;i++){
//            A[i] = new ArrayList<Integer>();
//        }
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            A[orig].add(dest);
//            A[dest].add(orig);
//        }
//        int result = 0;
//        for(int i=1;i<=n;i++){
//            if(!visited[i]){
//                result++;
//                DFS(i);
//            }
//        }
//        System.out.println(result);
//    }
//    static void DFS(int v){
//        if(visited[v])
//            return;
//        visited[v]=true;
//        for(int i=0;i<A[v].size();i++){
//            DFS(A[v].get(i));
//        }
//    }
//}
//import java.util.*;
//import java.io.*;
//class p24{
//    static int N;
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        N = Integer.parseInt(br.readLine());
//        DFS(2,1);
//        DFS(3,1);
//        DFS(5,1);
//        DFS(7,1);
//    }
//    static void DFS(int n, int digit){
//        if(digit == N){
//            if(isPrime(n))
//                System.out.println(n);
//            return;
//        }
//        for(int i=1;i<=9;i+=2){
//            int tmp = n*10+i;
//            if(isPrime(tmp))
//                DFS(tmp,digit+1);
//        }
//    }
//    static boolean isPrime(int n){
//        for(int i=2;i*i<=n;i++)
//            if (n % i == 0)
//                return false;
//        return true;
//    }
//}
//import java.util.*;
//import java.io.*;
//class p25{
//    static ArrayList<Integer>[] A;
//    static boolean[] visited;
//    static boolean arrived;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        visited = new boolean[n];
//        A = new ArrayList[n];
//        for(int i=0;i<n;i++){
//            A[i] = new ArrayList<Integer>();
//        }
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            A[orig].add(dest);
//            A[dest].add(orig);
//        }
//        for(int i=0;i<n;i++){
//            DFS(i,1);
//        }
//        if(arrived)
//            System.out.println(1);
//        else{
//            System.out.println(0);
//        }
//    }
//    static void DFS(int n,int depth){
//        if(depth==5 || arrived){
//            arrived = true;
//            return;
//        }
//        visited[n] = true;
//        for(int i:A[n])
//            if(!visited[i])
//                DFS(i,depth+1);
//        visited[n]=false;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p26{
//    static ArrayList<Integer>[] A;
//    static boolean[] visited;
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        int start = Integer.parseInt(st.nextToken());
//        A = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            A[i] = new ArrayList<Integer>();
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            A[orig].add(dest);
//            A[dest].add(orig);
//        }
//        for(int i=1;i<=n;i++){
//            Collections.sort(A[i]);
//        }
//
//        visited = new boolean[n+1];
//        DFS(start);
//
//        System.out.println();
//
//        visited = new boolean[n+1];
//        BFS(start);
//    }
//    static void DFS(int n){
//        System.out.print(n+" ");
//        visited[n]=true;
//        for(int i:A[n])
//            if(!visited[i])
//                DFS(i);
//    }
//
//    static void BFS(int n){
//        Queue<Integer> queue = new LinkedList<Integer>();
//        visited[n]=true;
//        queue.add(n);
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            System.out.print(now+" ");
//            for(int i:A[now])
//                if(!visited[i]) {
//                    visited[i] = true;
//                    queue.add(i);
//                }
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p27{
//    static int n,m;
//    static int[][] A;
//    static boolean[][] visited;
//    static int[] dx = {0,1,0,-1};
//    static int[] dy = {-1,0,1,0};
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        A = new int[n][m];
//        visited = new boolean[n][m];
//        for(int i=0;i<n;i++){
//            String s = br.readLine();
//            for(int j=0;j<m;j++){
//                A[i][j] = s.charAt(j)-'0';
//            }
//        }
//        BFS(0,0);
//        System.out.println(A[n-1][m-1]);
//    }
//    static void BFS(int r, int c){
//        Queue<int[]> queue = new LinkedList<int[]>();
//        visited[r][c]=true;
//        queue.offer(new int[]{r,c});
//        while(!queue.isEmpty()){
//            int[] now = queue.poll();
//            for(int i=0;i<4;i++){
//                int x = now[0]+dx[i];
//                int y = now[1]+dy[i];
//                if(x>=0&&x<n&&y>=0&&y<m){
//                    if(A[x][y]!=0&&!visited[x][y]){
//                        visited[x][y]=true;
//                        A[x][y]=A[now[0]][now[1]]+1;
//                        queue.offer(new int[]{x,y});
//                    }
//                }
//            }
//        }
//    }
//}
//import java.util.*;
//import java.io.*;
//class p67{
//    static boolean[] visited;
//    static int[] parent;
//    static ArrayList<Integer>[] graph;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        graph = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            graph[i] = new ArrayList<>();
//
//        for(int i=0;i<n-1;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            graph[a].add(b);
//            graph[b].add(a);
//        }
//        visited = new boolean[n+1];
//        parent = new int[n+1];
//        DFS(1);
//        for(int i=2;i<=n;i++)
//            System.out.println(parent[i]);
//
//    }
//
//    static void DFS(int n){
//        if(visited[n])
//            return;
//        visited[n]=true;
//        for(int i:graph[n]){
//            if(!visited[i]) {
//                parent[i] = n;
//                DFS(i);
//            }
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p67{
//    static ArrayList<Integer>[] graph;
//    static boolean[] visited;
//    static int removed;
//    static int answer = 0;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        graph = new ArrayList[n];
//        for(int i=0;i<n;i++)
//            graph[i] = new ArrayList<>();
//        visited = new boolean[n];
//        int root = 0;
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0;i<n;i++){
//            int tmp = Integer.parseInt(st.nextToken());
//            if(tmp==-1)
//                root = i;
//            else{
//                graph[i].add(tmp);
//                graph[tmp].add(i);
//            }
//        }
//        removed = Integer.parseInt(br.readLine());
//        if(removed!=root)
//            dfs(root);
//        System.out.println(answer);
//    }
//    static void dfs(int n){
//        if(visited[n])
//            return;
//        visited[n]=true;
//        int child = 0;
//        for(int i:graph[n]){
//            if(!visited[i] && i!=removed){
//                child++;
//                dfs(i);
//            }
//        }
//        if(child==0)
//            answer++;
//    }
//}
//import java.util.*;
//import java.io.*;
//
//class p69{
//    static Node root;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        root = new Node();
//        for(int i=0;i<n;i++){
//            String s = br.readLine();
//            Node parent = root;
//            for(int j=0;j<s.length();j++){
//                int tmp = s.charAt(j)-'a';
//                if(parent.childs[tmp]==null){
//                    parent.childs[tmp] = new Node();
//                }
//                parent = parent.childs[tmp];
//            }
//            parent.isEnd=true;
//        }
//
//        int ans = 0;
//
//        for(int i=0;i<m;i++){
//            String s = br.readLine();
//            Node parent = root;
//            boolean flag = false;
//            for(int j=0;j<s.length();j++){
//                int tmp = s.charAt(j)-'a';
//                if(parent.childs[tmp]!=null){
//                    parent = parent.childs[tmp];
//                }
//                else{
//                    flag = true;
//                    break;
//                }
//            }
//            if(!flag && parent.isEnd)
//                ans++;
//        }
//
//        System.out.println(ans);
//    }
//}
//
//class Node{
//    boolean isEnd;
//    Node[] childs = new Node[26];
//}

//import java.util.*;
//import java.io.*;
//class p70{
//    static int[][] arr;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        arr = new int[n][2];    //[0] : left , [1] : right
//        for(int i=0;i<n;i++){
//            st = new StringTokenizer(br.readLine());
//            int now = st.nextToken().charAt(0)-'A';
//            char leftChar = st.nextToken().charAt(0);
//            if(leftChar!='.'){
//                arr[now][0] = leftChar-'A';
//            }else{
//                arr[now][0] = -1;
//            }
//            char rightChar = st.nextToken().charAt(0);
//            if(rightChar!='.'){
//                arr[now][1] = rightChar-'A';
//            }else{
//                arr[now][1] = -1;
//            }
//        }
//        preOrder(0);
//        System.out.println();
//        inOrder(0);
//        System.out.println();
//        postOrder(0);
//        System.out.println();
//    }
//
//    static void preOrder(int n){
//        System.out.print((char)(n+'A'));
//        if(arr[n][0]!=-1)
//            preOrder(arr[n][0]);
//        if(arr[n][1]!=-1)
//            preOrder(arr[n][1]);
//    }
//
//    static void inOrder(int n){
//        if(arr[n][0]!=-1)
//            inOrder(arr[n][0]);
//        System.out.print((char)(n+'A'));
//        if(arr[n][1]!=-1)
//            inOrder(arr[n][1]);
//    }
//
//    static void postOrder(int n){
//        if(arr[n][0]!=-1)
//            postOrder(arr[n][0]);
//        if(arr[n][1]!=-1)
//            postOrder(arr[n][1]);
//        System.out.print((char)(n+'A'));
//    }
//
//}

//import java.io.*;
//import java.util.*;
//
//class p71{
//    static long[] tree;
//    static int base_size;
//    static int n;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int s = Integer.parseInt(st.nextToken());
//        base_size = 1;
//        while(base_size<n){
//            base_size*=2;
//        }
//        int arr_size = base_size*2;
//        tree = new long[arr_size];
//        for(int i=base_size;i<base_size+n;i++){
//            tree[i] = Long.parseLong(br.readLine());
//        }
//        setTree(base_size+n-1);
//
//        for(int i=0;i<c+s;i++){
//            st = new StringTokenizer(br.readLine());
//            int menu = Integer.parseInt(st.nextToken());
//            long a = Long.parseLong(st.nextToken());
//            long b = Long.parseLong(st.nextToken());
//            if(menu==1){
//                change(a,b);
//            }
//            else{
//                System.out.println(cal(a,b));
//            }
//        }
//    }
//
//    static void setTree(int n){
//        while(n>1){
//            tree[n/2]+=tree[n];
//            n--;
//        }
//    }
//
//    static long getIdx(long n){
//        return base_size+n-1;
//    }
//
//    static void change(long a,long b){
//        long idx = getIdx(a);
//        long diff = b-tree[(int)idx];
//        while(idx>=1){
//            tree[(int)idx]+=diff;
//            idx/=2;
//        }
//    }
//
//    static long cal(long a, long b){
//        long l = getIdx(a);
//        long r = getIdx(b);
//        long sum = 0;
//        while(l<=r){
//            if(l%2==1)
//                sum+=tree[(int)l];
//            if(r%2==0)
//                sum+=tree[(int)r];
//            l = (l+1)/2;
//            r = (r-1)/2;
//        }
//        return sum;
//    }
//}
//import java.util.*;
//import java.io.*;
//class p67{
//    static ArrayList<Integer>[] A;
//    static boolean[] visited;
//    static int[] parent;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int v = Integer.parseInt(br.readLine());
//        A = new ArrayList[v+1];
//        for(int i=1;i<v+1;i++)
//            A[i]  = new ArrayList<>();
//        for(int i=0;i<v-1;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            A[a].add(b);
//            A[b].add(a);
//        }
//        visited = new boolean[v+1];
//        parent = new int[v+1];
//        DFS(1);
//        for(int i=2;i<=v;i++){
//            System.out.println(parent[i]);
//        }
//    }
//
//
//    static void DFS(int n){
//        visited[n] = true;
//        for(int i:A[n]){
//            if(!visited[i]){
//                parent[i] = n;
//                DFS(i);
//            }
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p68{
//    static ArrayList<Integer>[] A;
//    static int result;
//    static boolean[] visited;
//    static int deleteNode;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int v = Integer.parseInt(br.readLine());
//        A = new ArrayList[v];
//        for(int i=0;i<v;i++)
//            A[i] = new ArrayList<>();
//        result = 0;
//        visited = new boolean[v];
//        int root = 0;
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0;i<v;i++){
//            int tmp = Integer.parseInt(st.nextToken());
//            if(tmp!=-1){
//                A[i].add(tmp);
//                A[tmp].add(i);
//            }
//            else
//                root = i;
//
//        }
//        deleteNode = Integer.parseInt(br.readLine());
//        if(deleteNode != root)
////            DFS(root);
//            BFS(root);
//        System.out.println(result);
//    }
////    static void DFS(int node){
////        visited[node] = true;
////        boolean flag = false;
////        for(int i:A[node]){
////            if(!visited[i] && i!=deleteNode){
////                flag = true;
////                DFS(i);
////            }
////        }
////        if(!flag)
////            result++;
////    }
//    static void BFS(int node){
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(node);
//        while(!q.isEmpty()){
//            int now = q.poll();
//            visited[now] = true;
//            boolean flag = false;
//            for(int i:A[now])
//                if(!visited[i] && i!=deleteNode){
//                    q.offer(i);
//                    flag=true;
//                }
//            if(!flag)
//                result++;
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p69{
//    public static void main(String[] args)throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        Node root = new Node();
//
//        for(int i=0;i<n;i++){
//            Node parent = root;
//            String s = br.readLine();
//            for(int j=0;j<s.length();j++){
//                char c = s.charAt(j);
//                if(parent.children[c-'a']==null){
//                    parent.children[c-'a'] = new Node();
//                }
//                parent = parent.children[c-'a'];
//            }
//            parent.isEnd = true;
//        }
//        int answer = 0;
//        for(int i=0;i<m;i++){
//            String s = br.readLine();
//            boolean flag = false;
//            Node parent = root;
//            for(int j=0;j<s.length();j++){
//                char c = s.charAt(j);
//                if(parent.children[c-'a']==null){
//                    flag=true;
//                    break;
//                }
//                parent = parent.children[c-'a'];
//            }
//            if(!flag && parent.isEnd)
//                answer++;
//        }
//        System.out.println(answer);
//    }
//}
//
//class Node{
//    Node[] children = new Node['z'-'a'+1];
//    boolean isEnd;
//}

//import java.util.*;
//import java.io.*;
//class p70{
//    static int[][] tree;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int v = Integer.parseInt(br.readLine());
//        tree = new int[26][2];
//        for(int i=0;i<v;i++){
//            st = new StringTokenizer(br.readLine());
//            int parent = st.nextToken().charAt(0)-'A';
//            char c = st.nextToken().charAt(0);
//            tree[parent][0] = (c!='.')? c-'A':-1;
//            c = st.nextToken().charAt(0);
//            tree[parent][1] = (c!='.')? c-'A':-1;
//        }
//        preOrder(0);
//        System.out.println();
//        inOrder(0);
//        System.out.println();
//        postOrder(0);
//    }
//
//    static void preOrder(int n){
//        System.out.print((char)(n+'A'));
//        if(tree[n][0]!=-1)
//            preOrder(tree[n][0]);
//        if(tree[n][1]!=-1)
//            preOrder(tree[n][1]);
//    }
//
//    static void inOrder(int n){
//        if(tree[n][0]!=-1)
//            inOrder(tree[n][0]);
//        System.out.print((char)(n+'A'));
//        if(tree[n][1]!=-1)
//            inOrder(tree[n][1]);
//    }
//
//    static void postOrder(int n){
//        if(tree[n][0]!=-1)
//            postOrder(tree[n][0]);
//        if(tree[n][1]!=-1)
//            postOrder(tree[n][1]);
//        System.out.print((char)(n+'A'));
//    }
//}
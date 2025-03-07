//import java.util.*;
//import java.io.*;
//
//class p48{
//    static boolean visited[];
//    static ArrayList<Integer>[] A;
//    static int[] check;
//    static boolean isEven;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int testCase = Integer.parseInt(br.readLine());
//        for(int z=0;z<testCase;z++){
//
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            A = new ArrayList[n+1];
//            for(int i=1;i<=n;i++)
//                A[i] = new ArrayList<>();
//            for(int i=0;i<m;i++){
//                st = new StringTokenizer(br.readLine());
//                int s = Integer.parseInt(st.nextToken());
//                int e = Integer.parseInt(st.nextToken());
//                A[s].add(e);
//                A[e].add(s);
//            }
//            visited = new boolean[n+1];
//            check = new int[n+1];
//            isEven = true;
//            for(int i=1;i<=n;i++){
//                if(isEven)
//                    DFS(i);
//                else
//                    break;
//            }
//            if(isEven)
//                System.out.println("YES");
//            else
//                System.out.println("NO");
//        }
//    }
//    static void DFS(int node){
//        visited[node] = true;
//        for(int i:A[node]) {
//            if (!visited[i]){
//                check[i]=(check[node]+1)%2;
//                DFS(i);
//            }
//            else if(check[i]==check[node])
//                isEven = false;
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p49{
//    static int[] sender = {0,0,1,1,2,2};
//    static int[] receiver ={1,2,0,2,0,1};
//    static boolean[][] visited;
//    static int[] capacity;
//    static boolean[] answer;
//    public static void main(String[] args) throws IOException {
//        capacity = new int[3];
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0;i<3;i++)
//            capacity[i]=Integer.parseInt(st.nextToken());
//        visited = new boolean[201][201];
//        answer = new boolean[201];
//        BFS();
//        for(int i=0;i<201;i++)
//            if(answer[i])
//                System.out.print(i+" ");
//    }
//    static void BFS(){
//        Queue<int[]> queue = new LinkedList<>();
//        queue.add(new int[]{0,0});
//        visited[0][0]=true;
//        answer[capacity[2]]=true;
//        while(!queue.isEmpty()){
//            int[] tmp = queue.poll();
//            int A = tmp[0];
//            int B = tmp[1];
//            int C = capacity[2]-A-B;
//            for(int i=0;i<6;i++){
//                int[] next = {A,B,C};
//                next[receiver[i]]+=next[sender[i]];
//                next[sender[i]]=0;
//                if(next[receiver[i]]> capacity[receiver[i]]){
//                    next[sender[i]] = next[receiver[i]]-capacity[receiver[i]];
//                    next[receiver[i]] = capacity[receiver[i]];
//                }
//                if(!visited[next[0]][next[1]]){
//                    if(next[0]==0)
//                        answer[next[2]]=true;
//                    visited[next[0]][next[1]]=true;
//                    queue.add(new int[]{next[0],next[1]});
//                }
//            }
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p50{
//    static int[] A;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        A = new int[n+1];
//        for(int i=0;i<n+1;i++)
//            A[i] = i;
//
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int command = Integer.parseInt(st.nextToken());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            if(command==0)
//                union(a,b);
//            else{
//                if(checkSame(a,b))
//                    System.out.println("YES");
//                else
//                    System.out.println("NO");
//
//            }
//        }
//
//    }
//    static void union(int a, int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b)
//            A[b] = a;
//    }
//    static int find(int a){
//        if(A[a]==a){
//            return a;
//        }
//        A[a]=find(A[a]);
//        return A[a];
//    }
//    static boolean checkSame(int a, int b){
//        a = find(a);
//        b = find(b);
//        return a==b;
//    }
//}
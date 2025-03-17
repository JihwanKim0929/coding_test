//import java.util.*;
//import java.io.*;
//
//class p21{
//    static long[] A, tmp;
//    static long answer;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        answer = 0;
//        int n = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        A = new long[n];
//        tmp = new long[n];
//        for(int i=0;i<n;i++){
//            A[i] = Long.parseLong(st.nextToken());
//        }
//        merge_sort(0,n-1);
//        System.out.println(answer);
//
//    }
//    static void merge_sort(int s, int e){
//        if(s==e)
//            return;
//        int m = s+(e-s)/2;
//        merge_sort(s,m);
//        merge_sort(m+1,e);
//
//        for(int i=s;i<=e;i++){
//            tmp[i] = A[i];
//        }
//        int k = s; // 병합된 배열의 인덱스
//        int idx1 = s;
//        int idx2 = m+1;
//        while(idx1<=m&&idx2<=e){
//            if(tmp[idx1]<=tmp[idx2])
//                A[k++] = tmp[idx1++];
//            else{
//                A[k++] = tmp[idx2++];
//                answer += m-idx1+1;
//            }
//        }
//        while(idx1<=m)
//            A[k++] = tmp[idx1++];
//        while(idx2<=e)
//            A[k++] = tmp[idx2++];
//    }
//}
//

//import java.util.*;
//import java.io.*;
//class p22{
//    static int[] arr;
//    static int n;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
//        arr = new int[n];
//        for(int i = 0;i<n;i++){
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//        int max = arr[0];
//        for(int i=1;i<n;i++)
//            if(arr[i]>max)
//                max = arr[i];
//
//
//        int exp = 1;
//        while(max/exp>0){
//            Queue<Integer>[] queue = new Queue[10];
//            for(int i=0;i<10;i++)
//                queue[i] = new LinkedList<>();
//
//            for(int i=0;i<n;i++){
//                int digit = (arr[i]/exp)%10;
//                queue[digit].offer(arr[i]);
//            }
//            int k = 0;
//            for(int i=0;i<10;i++){
//                while(!queue[i].isEmpty()){
//                    arr[k++] = queue[i].poll();
//                }
//            }
//            exp*=10;
//        }
//
//        for(int i=0;i<n;i++)
//            System.out.println(arr[i]);
//
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p23{
//    static ArrayList<Integer>[] graph;
//    static boolean[] visited;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        graph = new ArrayList[n+1];
//        for(int i = 1;i<=n;i++){
//            graph[i] = new ArrayList<>();
//        }
//        visited = new boolean[n+1];
//
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            graph[a].add(b);
//            graph[b].add(a);
//        }
//        int answer = 0;
//        for(int i=1;i<=n;i++){
//            if(!visited[i]) {
//                answer++;
//                dfs(i);
//            }
//        }
//
//        System.out.println(answer);
//
//    }
//
//    static void dfs(int node){
//        visited[node] = true;
//        for(int i:graph[node]){
//            if(!visited[i]){
//                dfs(i);
//            }
//        }
//    }
//
//}

//import java.util.*;
//import java.io.*;
//class p24{
//    static int n;
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        dfs(2,1);
//        dfs(3,1);
//        dfs(5,1);
//        dfs(7,1);
//    }
//
//    static void dfs(int num, int digit){
//        if(digit==n){
//            if(isPrime(num))
//                System.out.println(num);
//        }
//
//        for(int i=1;i<=9;i+=2){
//            int tmp = num*10+i;
//            if(isPrime(tmp)){
//                dfs(num*10+i,digit+1);
//            }
//        }
//    }
//    static boolean isPrime(int num){
//        for(int i=2;i<num/2;i++){
//            if(num%i==0)
//                return false;
//        }
//        return true;
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p25{
//    static ArrayList<Integer>[] graph;
//    static boolean[] visited;
//    static boolean success;
//    static int n;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        graph = new ArrayList[n];
//        for(int i=0;i<n;i++)
//            graph[i] = new ArrayList<>();
//
//        visited = new boolean[n];
//        success = false;
//
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            graph[a].add(b);
//            graph[b].add(a);
//        }
//
//        for(int i=0;i<n;i++){
//            dfs(i,1);
//            if(success)
//                break;
//        }
//
//        if(success)
//            System.out.println(1);
//        else
//            System.out.println(0);
//
//    }
//    static void dfs(int node, int depth){
//
//        visited[node] = true;
//
//        if(depth==5){
//            success = true;
//            return;
//        }
//
//        for(int i: graph[node]){
//            if(!visited[i])
//                dfs(i,depth+1);
//        }
//        visited[node] = false;
//    }
//}
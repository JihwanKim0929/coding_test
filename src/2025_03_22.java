//import java.util.*;
//import java.io.*;
//class p39{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[10000001];
//        for(int i=2;i<arr.length;i++){
//            arr[i] = i;
//        }
//        for(int i=2;i<=Math.sqrt(arr.length);i++)
//            if(arr[i]!=0)
//                for(int j=2*i;j<arr.length;j+=i)
//                    arr[j]=0;
//
//        for(int i=n;i<=arr.length;i++){
//            if(arr[i]!=0)
//                if(isPalindrome(i)) {
//                    System.out.println(i);
//                    break;
//                }
//        }
//    }
//
//    static boolean isPalindrome(int num){
//        String s = Integer.toString(num);
//        int a = 0;
//        int b = s.length()-1;
//        while(a<b){
//            if(s.charAt(a)!=s.charAt(b))
//                return false;
//            a++;
//            b--;
//        }
//        return true;
//    }
//}

//import java.io.*;
//import java.util.*;
//class p41{    //배열을 통한 소수 판별이 없음 -> 소인수들 다 지워서(n%p==0->n/=p) 중복 제거 막음
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        long answer = n;
//        long p = 2;
//        while(p<Math.sqrt(n)){
//            if(n%p==0){
//                answer -= answer/p;
//                while(n%p==0)
//                    n/=p;
//            }
//            p++;
//        }
//        if(n!=1)
//            answer-=answer/n;
//        System.out.println(answer);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p42{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int t = Integer.parseInt(br.readLine());
//        for(int i=0;i<t;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(a*b/gcd(a,b));
//        }
//    }
//    static int gcd(int a, int b){
//        if(b==0)
//            return a;
//        else
//            return gcd(b,a%b);
//    }
//}

//import java.io.*;
//import java.util.Scanner;
//
//class p43{
//    public static void main(String[] args)throws IOException {
//        Scanner sc = new Scanner(System.in);
//        long a = sc.nextLong();
//        long b = sc.nextLong();
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        long g = gcd(a,b);
//        for(int i=0;i<g;i++){
//            bw.write("1");
//        }
//        bw.flush();
//    }
//    static long gcd(long a, long b){
//        if(b==0)
//            return a;
//        else
//            return gcd(b,a%b);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p44{
//    static boolean[] visited;
//    static ArrayList<Edge>[] graph;
//    static long[] answer;
//    static long lcm;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        graph = new ArrayList[n];
//        for(int i=0;i<n;i++)
//            graph[i] = new ArrayList<>();
//        visited = new boolean[n];
//        lcm = 1;
//        for(int i=0;i<n-1;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int p = Integer.parseInt(st.nextToken());
//            int q = Integer.parseInt(st.nextToken());
//            graph[a].add(new Edge(b,p,q));
//            graph[b].add(new Edge(a,q,p));
//            lcm*=(p*q/gcd(p,q));
//        }
//        answer = new long[n];
//        answer[0] = lcm;
//        dfs(0);
//        long mgcd = answer[0];
//        for(int i=1;i<n;i++){
//            mgcd = gcd(mgcd,answer[i]);
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(answer[i]/mgcd+" ");
//        }
//    }
//    static long gcd(long a, long b){
//        if(b==0)
//            return a;
//        else
//            return gcd(b,a%b);
//    }
//    static void dfs(int n){
//        if(visited[n])
//            return;
//        visited[n]=true;
//        for(Edge e:graph[n]){
//            if(!visited[e.dest]){
//                answer[e.dest] = answer[n]*e.q/e.p;
//                dfs(e.dest);
//            }
//        }
//    }
//}
//
//class Edge{
//    int dest,p,q;
//    Edge(int dest, int p, int q){
//        this.dest=dest;
//        this.p=p;
//        this.q=q;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p45{
//    static int a,b,c;
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        int g = gcd(a,b);
//        if(c%g!=0){
//            System.out.println(-1);
//        }
//        else{
//            int[] xy = execute(a,b);
//            int tmp = c/g;
//            System.out.print(tmp*xy[0]+" ");
//            System.out.print(tmp*xy[1]);
//        }
//    }
//    static int gcd(int a, int b){
//        if(b==0)
//            return a;
//        else
//            return gcd(b,a%b);
//    }
//
//    static int[] execute(int a, int b){
//        //a%b 해서 몫 저장
//        //x=y', y = x'-y'*몫
//        if(b==0)
//            return new int[]{1, 0};
//        int q = a/b;
//        int[] arr_before = execute(b,a%b); //x',y'
//        return new int[]{arr_before[1],arr_before[0]-arr_before[1]*q};
//    }
//}
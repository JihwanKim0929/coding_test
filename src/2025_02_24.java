//2진트리 노드 수(2^h) -1
//공비수열 합 (a(r^n -1)/(r-1)
//세그먼트 트리. 리프 노드 수가 N개면 2^k >= N 인 k 구하고 2^(k+1) 만큼 배열 생성
//리프 노드 시작 인덱스는 2^k
//import java.util.*;
//import java.io.*;
//class p71{
//    static long[] tree;
//    static int k;
//    static int startOfLeaf;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        k=0;
//        int tmp = N;
//        while(tmp!=0){
//            tmp/=2;
//            k++;
//        }
//        tree = new long[(int) Math.pow(2,k+1)];
//        startOfLeaf = (int)Math.pow(2,k);
//        for(int i=startOfLeaf;i<startOfLeaf+N;i++){
//            tree[i] = Long.parseLong(br.readLine());
//        }
//
//        //Initialization
//        int exceptLeaf = startOfLeaf-1;
//        for(int i=exceptLeaf;i>=1;i--){
//            tree[i] = tree[i*2]+tree[i*2+1];
//        }
//
//        for(int i=0;i<M+K;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            long b = Long.parseLong(st.nextToken());
//            long c = Long.parseLong(st.nextToken());
//            if(a==1){
//                changeNum((int)b,c);
//            }
//            else
//                System.out.println(getSum((int)b,(int)c));
//        }
//    }
//    static void changeNum(int b,long c){
//        int idx = startOfLeaf + b -1;
//        long difference = c - tree[idx];
//        while(idx>0){
//            tree[idx] += difference;
//            idx/=2;
//        }
//    }
//
//    static long getSum(int b,int c){
//        int startIdx = startOfLeaf + b -1;
//        int endIdx = startOfLeaf + c -1;
//        long sum = 0;
//        while(startIdx<=endIdx){
//            if(startIdx%2==1)
//                sum+=tree[startIdx];
//            if(endIdx%2==0)
//                sum+=tree[endIdx];
//            startIdx = (startIdx+1)/2;
//            endIdx = (endIdx-1)/2;
//        }
//        return sum;
//    }
//}


//import java.util.*;
//import java.io.*;
//class p72{
//    static int[] tree;
//    static int k;
//    static int startOfLeaf;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        k=0;
//        int tmp = N;
//        while(tmp!=0){
//            tmp/=2;
//            k++;
//        }
//        tree = new int[(int) Math.pow(2,k+1)];
//        startOfLeaf = (int)Math.pow(2,k);
//        for(int i=startOfLeaf;i<startOfLeaf+N;i++){
//            tree[i] = Integer.parseInt(br.readLine());
//        }
//
//        //Initialization
//        int exceptLeaf = startOfLeaf-1;
//        for(int i=exceptLeaf;i>=1;i--){
//            tree[i] = Math.min(tree[i*2],tree[i*2+1]);
//        }
//
//        for(int i=0;i<M;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(getMin(a,b));
//        }
//    }
//
//    static long getMin(int a,int b){
//        int startIdx = startOfLeaf + a -1;
//        int endIdx = startOfLeaf + b -1;
//        int min = Integer.MAX_VALUE;
//        while(startIdx<=endIdx){
//            if(startIdx%2==1)
//                if(min>tree[startIdx])
//                    min = tree[startIdx];
//            if(endIdx%2==0)
//                if(min>tree[endIdx])
//                    min = tree[endIdx];
//            startIdx = (startIdx+1)/2;
//            endIdx = (endIdx-1)/2;
//        }
//        return min;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p73{
//    static long[] tree;
//    static int k;
//    static int startOfLeaf;
//    static int MOD = 1000000007;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        k=0;
//        int tmp = N;
//        while(tmp!=0){
//            tmp/=2;
//            k++;
//        }
//        tree = new long[(int) Math.pow(2,k+1)];
//        Arrays.fill(tree,1);
//        startOfLeaf = (int)Math.pow(2,k);
//        for(int i=startOfLeaf;i<startOfLeaf+N;i++){
//            tree[i] = Long.parseLong(br.readLine());
//        }
//
//        //Initialization
//        int exceptLeaf = startOfLeaf-1;
//        for(int i=exceptLeaf;i>=1;i--){
//            tree[i] = tree[i*2]*tree[i*2+1]%MOD;
//        }
//
//        for(int i=0;i<M+K;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            long b = Long.parseLong(st.nextToken());
//            long c = Long.parseLong(st.nextToken());
//            if(a==1){
//                changeNum((int)b,c);
//            }
//            else
//                System.out.println(getMul((int)b,(int)c));
//        }
//    }
//    static void changeNum(int b,long c){
//        int idx = startOfLeaf + b -1;
//        tree[idx] = c;
//        while(idx>1){
//            idx/=2;
//            tree[idx] = tree[idx*2]*tree[idx*2+1]%MOD;
//        }
//    }
//
//    static long getMul(int b,int c){
//        int startIdx = startOfLeaf + b -1;
//        int endIdx = startOfLeaf + c -1;
//        long Mul = 1;
//        while(startIdx<=endIdx){
//            if(startIdx%2==1)
//                Mul=Mul*tree[startIdx]%MOD;
//            if(endIdx%2==0)
//                Mul=Mul*tree[endIdx]%MOD;
//            startIdx = (startIdx+1)/2;
//            endIdx = (endIdx-1)/2;
//        }
//        return Mul;
//    }
//}
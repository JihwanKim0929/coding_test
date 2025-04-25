//import java.util.*;
//import java.io.*;
//
//class p94{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        int[][] arr = new int[n][2];
//        for(int i=0;i<n;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            arr[i][0] = a;
//            arr[i][1] = b;
//        }
//
//        int[][] dp = new int[n][n];
//        for(int i=0;i<n;i++) {
//            Arrays.fill(dp[i], Integer.MAX_VALUE);
//            dp[i][i] = 0;
//        }
//        for(int i=2;i<=n;i++){
//            for(int j=0;j<=n-i;j++){
//                for(int k = j+1;k<=j+i-1;k++){
//                    dp[j][j+i-1] = Math.min(dp[j][j+i-1],dp[j][k-1]+dp[k][j+i-1]+arr[j][0]*arr[k][0]*arr[j+i-1][1]);
//                }
//            }
//        }
//
//        System.out.println(dp[0][n-1]);
//    }
//}

//import java.util.*;
//import java.io.*;
//class Main{
//    static int n;
//    static int[][] w;
//    static int[][] d;
//    static int inf = 1000000*16+1;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
//        w = new int[n][n];
//        StringTokenizer st;
//        for(int i=0;i<n;i++){
//            st = new StringTokenizer(br.readLine());
//            for(int j=0;j<n;j++){
//                w[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        d = new int[n][1<<n];
//        System.out.println(tsp(0,1));
//    }
//
//    static int tsp(int c, int v){
//        if(v==(1<<n)-1){
//            return w[c][0]==0? inf:w[c][0];
//        }
//        if(d[c][v]!=0){
//            return d[c][v];
//        }
//        d[c][v] = inf;
//        for(int i=0;i<n;i++){
//            if((v&(1<<i))==0 && w[c][i]!=0){
//                d[c][v] = Math.min(d[c][v],tsp(i,(v|(1<<i)))+w[c][i]);
//            }
//        }
//        return d[c][v];
//    }
//}
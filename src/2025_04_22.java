//import java.util.*;
//import java.io.*;
//class p92{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        int l = Integer.parseInt(st.nextToken());
//        int r = Integer.parseInt(st.nextToken());
//
//        long[][][] D = new long[n+1][l+1][r+1];
//        D[1][1][1] = 1;
//        for(int i=2;i<=n;i++){
//            for(int j=1;j<=l;j++){
//                for(int k=1;k<=r;k++){
//                    D[i][j][k] = (D[i-1][j-1][k]+D[i-1][j][k-1]+(i-2)*D[i-1][j][k])%1000000007;
//                }
//            }
//        }
//        System.out.println(D[n][l][r]);
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p93{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        long[][][] dp = new long[100001][5][5];
//        for(int k=0;k<100001;k++) {
//            for (int i = 0; i < 5; i++) {
//                for (int j = 0; j < 5; j++) {
//                    dp[k][i][j] = 400004;
//                }
//            }
//        }
//        dp[0][0][0] = 0;
//        int[][] mp = new int[][]{{0,2,2,2,2},
//                {2,1,3,4,3},
//                {2,3,1,3,4},
//                {2,4,3,1,3},
//                {2,3,4,3,1}};
//
//        int s = 1;
//        int n;
//        while(true){
//            n = sc.nextInt();
//            if(n==0)
//                break;
//            for(int i=0;i<5;i++){
//                if(n==i)
//                    continue;
//                for(int j=0;j<5;j++){
//                    dp[s][i][n] = Math.min(dp[s][i][n],dp[s-1][i][j]+mp[j][n]);
//                }
//            }
//            for(int i=0;i<5;i++){
//                if(n==i)
//                    continue;
//                for(int j=0;j<5;j++){
//                    dp[s][n][i] = Math.min(dp[s][n][i],dp[s-1][j][i]+mp[j][n]);
//                }
//            }
//            s++;
//        }
//
//        s--;
//        long ans = Long.MAX_VALUE;
//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(dp[s][i][j]<ans)
//                    ans = dp[s][i][j];
//            }
//        }
//
//        System.out.println(ans);
//
//    }
//}
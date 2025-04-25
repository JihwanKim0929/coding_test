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

import java.util.*;
import java.io.*;
class p96{
    static int n;
    static int[] A;
    static int[] D;
    static int[] B;
    static int max; //B배열 마지막 인덱스
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        A = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++)
            A[i] = Integer.parseInt(st.nextToken());

        D = new int[n+1]; //각 원소의 LIS 길이

        B = new int[n+1]; //각 LIS 길이에 해당하는 A[i]의 원소들중 제일 큰 인덱스 값
        
        D[1] = 1;
        B[1] = A[1];
        max = 1;
        for(int i=2;i<=n;i++){
            if(A[i]>B[max]){
                D[i] = ++max;
                B[max] = A[i];
            }else{
                int mid;
                int l = 1;
                int r = max;
                while(l<r){
                    mid = (l+r)/2;
                    if(A[i]>B[mid])
                        l = mid+1;
                    else
                        r = mid;
                }   //l이 B 중에서 A[i]보다 크거나 같은 최초의 인덱스번호
                B[l] = A[i];
                D[i] = l;
            }
        }
        System.out.println(max);

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=n;i>=1;i--){
            if(D[i]==max) {
                ans.add(A[i]);
                max--;
            }
            if(max==0)
                break;
        }

        for(int i=ans.size()-1;i>=0;i--){
            System.out.print(ans.get(i)+" ");
        }

    }
}
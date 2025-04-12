//import java.util.*;
//import java.io.*;
//
//class p81{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        long[] F = new long[n+2];
//        for(int i=1;i<=n;i++){
//            F[i] = n-i+1;
//        }
//        for(int i=n;i>=1;i--){
//            for(int j=i-1;j>=1;j--){
//                F[j]*=(n-i+1);
//            }
//        }
//        //[4!,3!,2!,1!,0]
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int menu = Integer.parseInt(st.nextToken());
//        if(menu==1){
//            long k = Long.parseLong(st.nextToken());
//            boolean[] used = new boolean[n+1];
//            int[] ans = new int[n+1];
//            for(int i=1;i<n;i++){
//                long divisor = F[i+1];
//                int cnt = 1;
//                for(int j=1;j<=n;j++){
//                    if(used[j])
//                        continue;
//                    if(divisor*cnt>=k){
//                        ans[i]=j;
//                        used[j]=true;
//                        k-=divisor*(cnt-1);
//                        break;
//                    }
//                    else
//                        cnt++;
//                }
//            }
//            for(int i=1;i<=n;i++){
//                if(!used[i]) {
//                    ans[n] = i;
//                    break;
//                }
//            }
//            for(int i=1;i<=n;i++)
//                System.out.print(ans[i]+" ");
//        }
//        else{
//            boolean[] used = new boolean[n+1];
//            long ans = 1;
//            for(int i=1;i<n;i++){
//                int tmp = Integer.parseInt(st.nextToken());
//                int th = 1;
//                int idx = 1;
//                while(idx!=tmp){
//                    if(!used[idx])
//                        th++;
//                    idx++;
//                }
//                ans+=F[i+1]*(th-1);
//                used[tmp] = true;
//            }
//            System.out.println(ans);
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p82{
//    public static void main(String[] args)throws IOException{
//        int[][] D = new int[201][201];
//        for(int i=0;i<=200;i++){
//            D[i][0] = 1;
//            D[i][i] = 1;
//            D[i][1] = i;
//        }
//        for(int i=3;i<=200;i++){
//            for(int j=2;j<i;j++){
//                D[i][j] = D[i-1][j-1]+D[i-1][j];
//                if(D[i][j]>1000000000)
//                    D[i][j]=1000000001;
//            }
//        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());   //a개수
//        int m = Integer.parseInt(st.nextToken());   //z개수
//        int k = Integer.parseInt(st.nextToken());
//
//        if(D[n+m][m]<k){
//            System.out.println(-1);
//        }else {
//            int l = n + m;
//
//            for (int i = 0; i < l; i++) {
//                if (k <= D[l - i - 1][m]) {
//                    System.out.print("a");
//                } else {
//                    System.out.print("z");
//                    k -= D[l - i - 1][m];
//                    m--;
//                }
//            }
//        }
//    }
//}
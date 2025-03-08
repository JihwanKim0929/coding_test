//import java.util.*;
//import java.io.*;
//class p91{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] arr = new int[n+1][m+1];
//        for(int i=1;i<=n;i++){
//            String s = br.readLine();
//            for(int j=1;j<=m;j++){
//                arr[i][j] = s.charAt(j-1)-'0';
//            }
//        }
//        int answer = 0;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(arr[i][j]!=0){
//                    arr[i][j] = Math.min(arr[i][j-1],Math.min(arr[i-1][j-1],arr[i-1][j]))+1;
//                    if(arr[i][j]>answer)
//                        answer = arr[i][j];
//                }
//            }
//        }
//
//        System.out.println(answer*answer);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p92{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int l = Integer.parseInt(st.nextToken());
//        int r = Integer.parseInt(st.nextToken());
//        long[][][] arr = new long[n+1][l+1][r+1];
//        arr[1][1][1]=1;
//        for(int i=2;i<=n;i++){
//            //[n-1][l-1][r]+[n-1][l][r-1]+[n-1][l][r]*n-2
//            for(int j=1;j<=l;j++){
//                for(int k=1;k<=r;k++){
//                    arr[i][j][k] = (arr[i-1][j-1][k]+arr[i-1][j][k-1]+arr[i-1][j][k]*(i-2))%1000000007;
//                }
//            }
//        }
//        System.out.println(arr[n][l][r]);
//    }
//}
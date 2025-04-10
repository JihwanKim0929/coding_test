//import java.util.*;
//import java.io.*;
//class p79{
//    public static void main(String[] args)throws IOException{
//        long[][] D = new long[31][31];
//        for(int i=0;i<31;i++){
//            D[i][0] = 1;
//            D[i][i] = 1;
//            D[i][1] = i;
//        }
//        for(int i=3;i<31;i++){
//            for(int j=2;j<i;j++){
//                D[i][j] = D[i-1][j-1]+D[i-1][j];
//            }
//        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int q = Integer.parseInt(br.readLine());
//        for(int i=0;i<q;i++) {
//            st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//
//            System.out.println(D[m][n]);
//        }
//
//    }
//}
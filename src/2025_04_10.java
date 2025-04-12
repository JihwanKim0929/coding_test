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

//import java.util.*;
//import java.io.*;
//class p80{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int c = Integer.parseInt(br.readLine());
//        int[] colors = new int[c];
//        int allStones = 0;
//        st = new StringTokenizer(br.readLine());
//        for(int i=0;i<c;i++) {
//            colors[i] = Integer.parseInt(st.nextToken());
//            allStones += colors[i];
//        }
//        int k = Integer.parseInt(br.readLine());
//
//        double ans = 0;
//        for(int i=0;i<colors.length;i++){
//            if(colors[i]>=k) {
//                double tmp = 1;
//                for (int j = 0; j < k; j++) {
//                    tmp *= (double) (colors[i] - j) / (allStones - j);
//                }
//                ans += tmp;
//            }
//        }
//        System.out.println(ans);
//    }
//}


//import java.util.*;
//import java.io.*;
//class p93{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[][][] D = new int[100001][5][5];
//        int[][] P = {{0,2,2,2,2},
//                {2,1,3,4,3},
//                {2,3,1,3,4},
//                {2,4,3,1,3},
//                {2,3,4,3,1}};
//        for(int k=0;k<100001;k++){
//            for(int i=0;i<5;i++){
//                for(int j=0;j<5;j++){
//                    D[k][i][j] = 400004;
//                }
//            }
//        }
//        D[0][0][0] = 0;
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int s = 1;
//        int n = 0;
//        while(true){
//            n = Integer.parseInt(st.nextToken());
//            if(n==0) break;
//            //오른발 옮겼을때
//            for(int i=0;i<5;i++){
//                if(i==n)
//                    continue;
//                for(int j=0;j<5;j++){
//                    D[s][i][n] = Math.min(D[s-1][i][j]+P[j][n],D[s][i][n]);
//                }
//            }
//            //왼발 옮겼을때
//            for(int i=0;i<5;i++){
//                if(i==n)
//                    continue;
//                for(int j=0;j<5;j++){
//                    D[s][n][i] = Math.min(D[s-1][j][i]+P[j][n],D[s][n][i]);
//                }
//            }
//            s++;
//        }
//        s--;
//        int min = Integer.MAX_VALUE;
//        //마지막 n을 따로 저장해두지 않아서 그냥 다 탐색.
//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++)
//                min = Math.min(min,D[s][i][j]);
//        }
//        System.out.println(min);
//    }
//}
//import java.util.*;
//import java.io.*;
//class p94{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        long[][] arr = new long[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                arr[i][j] = Integer.MAX_VALUE;
//            }
//        }
//        for(int i=0;i<n;i++)
//            arr[i][i]=0;
//
//        Matrix[] m = new Matrix[n];
//        for(int i=0;i<n;i++){
//            st = new StringTokenizer(br.readLine());
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//            m[i] = new Matrix(x,y);
//        }
//
//        for(int l = 1; l < n; l++){
//            for(int i = 0; i < n-l; i++){
//                int j = i+l;
//                for(int k=i;k<j;k++){
//                    arr[i][j] = Math.min(arr[i][j],arr[i][k]+arr[k+1][j]+ (long) m[i].x *m[k].y*m[j].y);
//                }
//            }
//        }
//
//        System.out.println(arr[0][n-1]);
//    }
//}
//
//class Matrix{
//    int x;
//    int y;
//    public Matrix(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//}
//import java.util.*;
//import java.io.*;
//class p76{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[][] D = new int[n+1][n+1];
//        for(int i=0;i<=n;i++){
//            D[i][i]=1;
//            D[i][0]=1;
//            D[i][1]=i;
//        }
//        for(int i=3;i<=n;i++){
//            for(int j=2;j<i;j++)
//                D[i][j] = D[i-1][j]+D[i-1][j-1];
//        }
//        System.out.println(D[n][k]);
//
//    }
//}

//import java.util.*;
//import java.io.*;
//class p77{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[][] D = new int[n+1][n+1];
//        for(int i=0;i<=n;i++){
//            D[i][i]=1;
//            D[i][0]=1;
//            D[i][1]=i;
//        }
//        for(int i=3;i<=n;i++){
//            for(int j=2;j<i;j++)
//                D[i][j] = (D[i-1][j]+D[i-1][j-1])%10007;
//        }
//        System.out.println(D[n][k]);
//
//    }
//}

//import java.util.*;
//import java.io.*;
//class p78{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int q = Integer.parseInt(br.readLine());
//        int[][] D = new int[15][15];
//        for(int i=0;i<15;i++){
//            D[0][i]=i;
//            D[i][1]=1;
//        }
//
//        for(int i=1;i<15;i++){
//            for(int j=2;j<15;j++){
//                D[i][j] = D[i][j-1]+D[i-1][j];
//            }
//        }
//
//        for(int i=0;i<q;i++){
//            int a = Integer.parseInt(br.readLine());
//            int b = Integer.parseInt(br.readLine());
//            System.out.println(D[a][b]);
//        }
//    }
//}
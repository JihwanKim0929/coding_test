//import java.util.*;
//import java.io.*;
//
//class p83{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long mod = 1000000000;
//        long[] D = new long[n+1];
//        D[1] = 0;
//        D[2] = 1;
//        for(int i=3;i<=n;i++){
//            D[i] = ((i-1)*(D[i-2]+D[i-1]))%mod;
//        }
//        System.out.println(D[n]);
//    }
//}
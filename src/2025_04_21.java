//import java.util.*;
//import java.io.*;
//
//class p88{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[][] D = new long[n+1][10];
//        for(int i=1;i<=9;i++)
//            D[1][i]=1;
//
//        for(int i=2;i<=n;i++){
//            for(int j=0;j<=9;j++){
//                switch(j){
//                    case 0: D[i][0] = D[i-1][1]; break;
//                    case 9: D[i][9] = D[i-1][8]; break;
//                    default: D[i][j] = (D[i-1][j-1]+D[i-1][j+1])%1000000000;
//                }
//            }
//        }
//
//        long ans = 0;
//        for(int i=0;i<=9;i++)
//            ans = (ans+D[n][i])%1000000000;
//        System.out.println(ans);
//
//
//    }
//}
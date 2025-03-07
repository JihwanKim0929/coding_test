//import java.io.*;
//import java.util.*;
//class p45{
//
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        long gcd = gcd(a,b);
//        if(c%gcd!=0)
//            System.out.println(-1);
//        else{
//            int mok = (int)(c/gcd);
//            long[] ret = excute(a,b);
//            System.out.println(ret[0]*mok+" "+ret[1]*mok);
//        }
//
//    }
//
//    static long[] excute(long a, long b){
//        long[] ret = new long[2];
//        if(b==0){
//            ret[0] = 1;
//            return ret;
//        }
//        long q = a/b;
//        long[] v = excute(b,a%b);
//        ret[0]=v[1];
//        ret[1]=v[0]-v[1]*q;
//        return ret;
//    }
//
//    static long gcd(long a, long b){
//        if(b==0)
//            return a;
//        else
//            return gcd(b,a%b);
//    }
//}
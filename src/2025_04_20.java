//import java.util.*;
//import java.io.*;
//
//class p84{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] D = new int[1000001];
//        D[1] = 0;
//        D[2] = 1;
//        for(int i=3;i<=n;i++){
//            D[i] = D[i-1]+1;
//            if(i%2==0)
//                D[i] = Math.min(D[i],D[i/2]+1);
//            if(i%3==0)
//                D[i] = Math.min(D[i],D[i/3]+1);
//        }
//        System.out.println(D[n]);
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p85{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] T = new int[n+1];
//        int[] P = new int[n+1];
//
//        for(int i=1;i<=n;i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            T[i] = Integer.parseInt(st.nextToken());
//            P[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int[] D = new int[n+1];
//
//        for(int i=n;i>=1;i--){
//            if(T[i]+i-1>n)
//                D[i] = D[i+1];
//            else{
//                D[i] = Math.max(D[i+1],D[i+T[i]]+P[i]);
//            }
//        }
//        System.out.println(D[1]);
//
//    }
//}

//import java.util.*;
//import java.io.*;
//class p86{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[] D0 = new long[n+1];
//        long[] D1 = new long[n+1];
//
//        D0[1] = 0;
//        D1[1] = 1;
//        for(int i=2;i<=n;i++){
//            D0[i] = D0[i-1]+D1[i-1];
//            D1[i] = D0[i-1];
//        }
//        System.out.println(D0[n]+D1[n]);
//    }
//}

import java.util.*;
import java.io.*;
class p87{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] D = new long[n+1];
        D[1] = 1;
        D[2] = 2;
        for(int i=3;i<=n;i++){
            D[i] = (D[i-2]+D[i-1])%10007;
        }
        System.out.println(D[n]);
    }
}
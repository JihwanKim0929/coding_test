//import java.util.*;
//import java.io.*;
//class p84{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] D = new int[n+1];
//        D[1] = 0;
//        for(int i=2;i<=n;i++){
//            D[i] = D[i-1]+1;
//            if(i%2==0) D[i] = Math.min(D[i],D[i/2]+1);
//            if(i%3==0) D[i] = Math.min(D[i],D[i/3]+1);
//        }
//        System.out.println(D[n]);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p85{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        int[][] D = new int[n+1][2];    //D[i][0]=걸리는 일 수 [1] = 이익
//        for(int i=1;i<=n;i++){
//            st = new StringTokenizer(br.readLine());
//            D[i][0] = Integer.parseInt(st.nextToken());
//            D[i][1] = Integer.parseInt(st.nextToken());
//        }
//        int[] money = new int[n+2];
//        for(int i=n;i>=1;i--){
//            if(i+D[i][0]>n+1)
//                money[i] = money[i+1];
//            else{
//                money[i] = Math.max(money[i+1],money[i+D[i][0]]+D[i][1]);
//            }
//        }
//        System.out.println(money[1]);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p86{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[][] D = new long[n+1][2];
//        D[1][0] = 0;
//        D[1][1] = 1;
//        for(int i=2;i<=n;i++){
//            D[i][0] = D[i-1][0]+D[i-1][1];
//            D[i][1] = D[i-1][0];
//        }
//        System.out.println(D[n][0]+D[n][1]);
//    }
//}

//n번째를 채우는 경우 : n-1번째의 경우들에 세로로 긴 사각형을 붙이는 경우 + n-2번째의
// 경우들에 가로로 긴 사각형 두개를 붙이는 경우
// (세로로 긴거 두개를 붙이는 경우는 n-1에 이미 있어서 제외)
//import java.util.*;
//import java.io.*;
//class p87{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[] D = new long[n+1];
//        D[1] = 1;
//        D[2] = 2;
//        for(int i=3;i<=n;i++){
//            D[i] = (D[i-2]+D[i-1])%10007;
//        }
//        System.out.println(D[n]);
//    }
//}
//import java.util.*;
//import java.io.*;
//
//class p76{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[][] D = new int[n+1][n+1];
//        for(int i=0;i<=n;i++){
//            D[i][0]=1;
//            D[i][i]=1;
//            D[i][1]=i;
//        }
//        for(int i=3;i<=n;i++){
//            for(int j=2;j<i;j++)
//                D[i][j] = D[i-1][j]+D[i-1][j-1];
//        }
//        System.out.println(D[n][k]);
//    }
//}

//import java.io.*;
//import java.util.*;
//class p77{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[][] D = new int[n+1][n+1];
//        for(int i=0;i<=n;i++){
//            D[i][0] = 1;
//            D[i][1] = i;
//            D[i][i] = 1;
//        }
//        for(int i=3;i<=n;i++){
//            for(int j = 2;j < i;j++)
//                D[i][j] = (D[i-1][j-1]+D[i-1][j])%10007;
//        }
//        System.out.println(D[n][k]);
//    }
//}

//import java.io.*;
//import java.util.*;
//class p78{
//    public static void main(String[] args)throws IOException{
//        int[][] D = new int[15][15];
//        for(int i=0;i<15;i++)
//            D[i][1] = 1;
//        for(int i=1;i<15;i++)
//            D[0][i] = i;
//        for(int i=1;i<15;i++)
//            for(int j=2;j<15;j++)
//                D[i][j]=D[i-1][j]+D[i][j-1];
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for(int z = 0; z < t; z++){
//            int k = sc.nextInt();
//            int n = sc.nextInt();
//            System.out.println(D[k][n]);
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p79{
//    public static void main(String[] args)throws IOException{
//        int[][] D = new int[31][31];
//        for(int i = 0; i < 31; i++){
//            D[i][i]=1;
//            D[i][0]=1;
//            D[i][1]=i;
//        }
//        for(int i=3;i<=30;i++){
//            for(int j=2;j<i;j++)
//                D[i][j]=D[i-1][j-1]+D[i-1][j];
//        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int t = Integer.parseInt(br.readLine());
//        for(int i=0;i<t;i++) {
//            st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            System.out.println(D[m][n]);
//        }
//    }
//}

//import java.io.*;
//import java.util.*;
//class p80{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int m = Integer.parseInt(br.readLine());
//        int[] arr = new int[m];
//        int sum = 0;
//        st = new StringTokenizer(br.readLine());
//        for(int i=0;i<m;i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//            sum+=arr[i];
//        }
//        int k = Integer.parseInt(br.readLine());
//        double result = 0;
//        for(int i=0;i<m;i++){
//            if(k>arr[i])
//                continue;
//            double tmp = 1.0;
//            for(int j=sum;j>sum-k;j--){
//                tmp*=(double)arr[i]/j;
//                arr[i]--;
//            }
//            result+=tmp;
//        }
//        System.out.println(result);
//    }
//}
//import java.util.*;
//import java.io.*;
//
//class p40{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        long min = sc.nextLong();
//        long max = sc.nextLong();
//        boolean[] isSquare  = new boolean[(int)(max-min+1)];
//        for(long i=2;i*i<=max;i++){
//            long pow = i*i;
//            long start_idx = min/pow;   //ex)12일 경우 pow가 4일때 4의 3번째 배수이므로 12/3
//            if(min%pow!=0)  //ex)13일 경우 16부터 체크해야됨. 하지만 13/4할 경우 3이 나오고 12부터 체크하는것을 방지하기 위해 나머지가 있을 경우 1을 추가해 4의 4번째 배수 16부터 체크하게 함
//                start_idx++;
//            for(long j = start_idx;j*pow<=max;j++){
//                isSquare[(int)(j*pow-min)]=true;
//            }
//        }
//        int count = 0;
//        for(int i=0;i<isSquare.length;i++){
//            if(!isSquare[i])
//                count++;
//        }
//        System.out.println(count);
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p41{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        long result = n;
//        for(int i = 2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                result -= result/i;
//                while(n%i==0){
//                    n/=i;
//                }
//            }
//        }
//        if(n>1)
//            result -= result/n;
//        System.out.println(result);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p42{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        for(int z=0;z<n;z++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(a*b/gcd(a,b));
//        }
//    }
//    static int gcd(int a, int b){
//        if(a==0)
//            return b;
//        else
//            return gcd(b%a,a);
//
//    }
//}

//import java.io.*;
//import java.util.*;
//class p43{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        long a = Long.parseLong(st.nextToken());
//        long b = Long.parseLong(st.nextToken());
//        long result = gcd(a,b);
//        for(long i=0;i<result;i++)
//            bw.write("1");
//        bw.flush();
//        bw.close();
//    }
//
//    static long gcd(long a, long b){
//        if(b == 0)
//            return a;
//        else
//            return gcd(b,a%b);  //p42함수랑 결과 같음 - a가 b보다 커도 a%b는 a가 나오기 때문에 gcd(a,b)로 바뀌게 됨
//    }
//}
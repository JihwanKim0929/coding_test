//import java.util.*;
//import java.io.*;
//class p97{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int[][] points = new int[3][2];
//        for(int i=0;i<3;i++){
//            st = new StringTokenizer(br.readLine());
//            points[i][0] = Integer.parseInt(st.nextToken());
//            points[i][1] = Integer.parseInt(st.nextToken());
//        }
//        //ccw = (x0y1+x1y2+x2y0)-(x1y0+x2y1+x0y2)
//        int ccw = (points[0][0]*points[1][1]+points[1][0]*points[2][1]+points[2][0]*points[0][1])
//                -(points[1][0]*points[0][1]+points[2][0]*points[1][1]+points[0][0]*points[2][1]);
//        int answer = 0;
//        if(ccw<0)
//            answer = -1;
//        else if(ccw>0)
//            answer = 1;
//
//        System.out.println(answer);
//
//    }
//}


//re

//import java.util.*;
//import java.io.*;
//class p98{
//    public static void main(String[] args)throws IOException{
//        long x1,x2,x3,x4;
//        long y1,y2,y3,y4;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        x1 = Long.parseLong(st.nextToken());
//        y1 = Long.parseLong(st.nextToken());
//        x2 = Long.parseLong(st.nextToken());
//        y2 = Long.parseLong(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        x3 = Long.parseLong(st.nextToken());
//        y3 = Long.parseLong(st.nextToken());
//        x4 = Long.parseLong(st.nextToken());
//        y4 = Long.parseLong(st.nextToken());
//
//        int result=0;
//        long abc = ccw(x1,y1,x2,y2,x3,y3);
//        long abd = ccw(x1,y1,x2,y2,x4,y4);
//        long cda = ccw(x3,y3,x4,y4,x1,y1);
//        long cdb = ccw(x3,y3,x4,y4,x2,y2);
//        if(abc*abd==0 && cda*cdb==0){
//            if(Math.min(x1,x2)<=Math.max(x3,x4)&&Math.min(x3,x4)<=Math.max(x1,x2)&&Math.min(y1,y2)<=Math.max(y3,y4)&&Math.min(y3,y4)<=Math.max(y1,y2))
//                System.out.println(1);
//            else
//                System.out.println(0);
//        }else if(abc*abd<=0&&cda*cdb<=0){
//            System.out.println(1);
//        }else
//            System.out.println(0);
//    }
//
//    static long ccw(long x1,long y1, long x2, long y2, long x3, long y3){
//        long result = (x1*y2+x2*y3+x3*y1)-(x2*y1+x3*y2+x1*y3);
//        if(result>0)
//            return 1;
//        else if(result<0)
//            return -1;
//        else
//            return 0;
//    }
//}


//복습 시작

//import java.util.*;
//import java.io.*;
//
//class p1{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String s = sc.next();
//        int result = 0;
//        for(int i=0;i<s.length();i++)
//            result+=s.charAt(i)-'0';
//        System.out.println(result);
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p2{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        //전체 더하고 최댓값으로 나누고 100 곱하기 / n
//        st = new StringTokenizer(br.readLine());
//        int max = 0;
//        int sum = 0;
//        for(int i=0;i<n;i++){
//            int tmp = Integer.parseInt(st.nextToken());
//            if(tmp>max)
//                max = tmp;
//            sum+=tmp;
//        }
//        System.out.println((float)sum/max*100/n);
//
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p3{
//    public static void main(String[] args)throws IOException{
//        //데이터 수, 질의 수
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int q = Integer.parseInt(st.nextToken());
//        //데이터 수만큼 입력 받아 구간합 배열 만들기
//        int[] s = new int[n+1];
//        st = new StringTokenizer(br.readLine());
//        for(int i=1;i<=n;i++){
//            int tmp = Integer.parseInt(st.nextToken());
//            s[i] = s[i-1]+tmp;
//        }
//        //질의 수만큼 받아 출력
//        for(int i=0;i<q;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(s[b]-s[a-1]);
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p4{
//    public static void main(String[] args)throws IOException{
//        //배열 크기 , 질의 개수 받기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int q = Integer.parseInt(st.nextToken());
//        //배열 생성 및 채우기
//        int[][] A = new int[n+1][n+1];
//        for(int i=1;i<=n;i++){
//            st = new StringTokenizer(br.readLine());
//            for(int j=1;j<=n;j++){
//                A[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        //구간합 배열 생성,채우기
//        int[][] D = new int[n+1][n+1];
//        D[1][1] = A[1][1];
//        for(int i=2;i<=n;i++){
//            D[1][i] = D[1][i-1]+A[1][i];
//        }
//        for(int i=2;i<=n;i++){
//            D[i][1] = D[i-1][1]+A[i][1];
//        }
//        for(int i=2;i<=n;i++){
//            for(int j=2;j<=n;j++){
//                D[i][j] = D[i][j-1]+D[i-1][j]-D[i-1][j-1]+A[i][j];
//            }
//        }
//        //질문 답변
//        for(int i=0;i<q;i++) {
//            st = new StringTokenizer(br.readLine());
//            int x1 = Integer.parseInt(st.nextToken());
//            int y1 = Integer.parseInt(st.nextToken());
//            int x2 = Integer.parseInt(st.nextToken());
//            int y2 = Integer.parseInt(st.nextToken());
//            System.out.println(D[x2][y2]-D[x2][y1-1]-D[x1-1][y2]+D[x1-1][y1-1]);
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p5{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        //수 입력받아 구간합 배열 만들기
//        st = new StringTokenizer(br.readLine());
//        long[] s = new long[n+1];
//        int[] c = new int[m];
//        for(int i=1;i<=n;i++){
//            s[i] = s[i-1]+Integer.parseInt(st.nextToken());
//        }
//        //구간합 %m 해서 0이면 +, 이후 인덱스 개수 배열 증가
//        int result = 0;
//        for(int i=1;i<=n;i++){
//            long tmp = s[i]%m;
//            if(tmp==0)
//                result++;
//            c[(int)tmp]++;
//        }
//
//        for(int i=0;i<m;i++){
//            if(c[i]>1)
//                result += (c[i]*(c[i]-1)/2);
//        }
//        System.out.println(result);
//    }
//}
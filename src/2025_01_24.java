//import java.util.Scanner;
//class p2{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int max = 0;
//        int sum = 0;
//        for(int i=0;i<n;i++){
//            int tmp = sc.nextInt();
//            sum += tmp;
//            if(tmp>max)
//                max = tmp;
//        }
//        System.out.print(sum*100.0/max/n);
//    }
//}

//import java.util.Scanner;
//class p3{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int dataNum = sc.nextInt();
//        int repeatNum = sc.nextInt();
//        int[] sumArr = new int[dataNum+1];
//        for(int i=1;i<dataNum+1;i++){
//            int tmp = sc.nextInt();
//            sumArr[i] = sumArr[i-1]+tmp;
//        }
//        for(int i=0;i<repeatNum;i++){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(sumArr[b]-sumArr[a-1]);
//        }
//    }
//}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//class p3{
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int dataNum = Integer.parseInt(st.nextToken());
//        int repeatNum = Integer.parseInt(st.nextToken());
//        long[] sumArr = new long[dataNum+1];
//        st = new StringTokenizer(br.readLine());
//        for(int i=1;i<=dataNum;i++){
//            int tmp = Integer.parseInt(st.nextToken());
//            sumArr[i]=sumArr[i-1]+tmp;
//        }
//        for(int i=0;i<repeatNum;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(sumArr[b]-sumArr[a-1]);
//        }
//    }
//}
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
//class p4{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int repeatNum = Integer.parseInt(st.nextToken());
//        int[][] arr = new int[n+1][n+1];
//        for(int i=1;i<=n;i++){
//            st = new StringTokenizer(br.readLine());
//            for(int j=1;j<=n;j++){
//                arr[i][j]=Integer.parseInt(st.nextToken());
//            }
//        }
//        long[][] sumArr = new long[n+1][n+1];
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                sumArr[i][j]=sumArr[i][j-1]+sumArr[i-1][j]-sumArr[i-1][j-1]+arr[i][j];
//            }
//        }
//        for(int i=0;i<repeatNum;i++){
//            st = new StringTokenizer(br.readLine());
//            int x1 = Integer.parseInt(st.nextToken());
//            int y1 = Integer.parseInt(st.nextToken());
//            int x2 = Integer.parseInt(st.nextToken());
//            int y2 = Integer.parseInt(st.nextToken());
//            System.out.println(sumArr[x2][y2]-sumArr[x2][y1-1]-sumArr[x1-1][y2]+sumArr[x1-1][y1-1]);
//        }
//    }
//}

//X
//import java.io.*;
//import java.util.*;
//class p1{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        long[] sumArr = new long[n];
//        sumArr[0]=Integer.parseInt(st.nextToken());
//        for(int i=1;i<n;i++){
//            sumArr[i]=sumArr[i-1]+Integer.parseInt(st.nextToken());
//        }
//        int answer = 0;
//        int[] countArr = new int[m];
//        for(int i=0;i<n;i++){
//            int remainder = (int)sumArr[i]%m;
//            if(remainder == 0)
//                answer++;
//            countArr[remainder]++;
//        }
//        for(int i=0;i<m;i++){
//            if(countArr[i]>1){
//                answer += countArr[i]*(countArr[i]-1)/2;
//            }
//        }
//        System.out.println(answer);
//    }
//}

//import java.io.*;
//import java.util.*;
//class p6{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int left = 1;
//        int right = 1;
//        int sum = 1;
//        int count = 1;
//        while(right < n){
//            if(sum == n){
//                count++;
//                sum += ++right;
//            }
//            else if(sum < n){
//                sum += ++right;
//            }
//            else{
//                sum -= left++;
//            }
//        }
//        System.out.println(count);
//    }
//}


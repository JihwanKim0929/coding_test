//import java.util.*;
//import java.io.*;
//
//class p32{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int answer = 0;
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        for(int i=n-1;i>=0;i--){
//            if(arr[i]<=m){
//              answer += m/arr[i];
//              m = m%arr[i];
//            }
//            if(m==0)
//                break;
//        }
//        System.out.println(answer);
//    }
//}
//
//import java.util.*;
//import java.io.*;
//class p33{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int i=0;i<n;i++){
//            pq.offer(Integer.parseInt(br.readLine()));
//        }
//        int sum = 0;
//        while(pq.size()>1){
//            int a = pq.poll();
//            int b = pq.poll();
//            sum += a+b;
//            pq.offer(a+b);
//        }
//        System.out.println(sum);
//    }
//}


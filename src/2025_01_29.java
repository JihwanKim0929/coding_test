
//import java.util.*;
//import java.io.*;
//class p22{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        Queue<Integer>[] queue = new LinkedList[10];
//        for(int i=0;i<10;i++){
//            queue[i] = new LinkedList<>();
//        }
//        for(int i=0;i<4;i++){
//            for(int j=0;j<n;j++){
//                queue[arr[j]/(int)Math.pow(10,i)%10].add(arr[j]);
//            }
//            int queue_idx = 0;
//            int arr_idx = 0;
//            while(arr_idx<n){
//                if(!queue[queue_idx].isEmpty())
//                    arr[arr_idx++] = queue[queue_idx].poll();
//                else
//                    arr_idx++;
//            }
//        }
//        for(int i=0;i<n;i++){
//            bw.write(arr[i]+"\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//}

//import java.util.*;
//import java.io.*;
//class p22{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//        int[] A = new int[n];
//        for(int i=0;i<n;i++)
//            A[i] = Integer.parseInt(br.readLine());
//        br.close();
//        int[] output = new int[n];
//        int digits = 1;
//        for(int i=0;i<5;i++){
//            int[] bucket = new int[10];
//            for(int j=0;j<n;j++)
//                bucket[A[j]/digits%10]++;
//            for(int j=1;j<10;j++)
//                bucket[j]+=bucket[j-1];
//            for(int j=n-1;j>=0;j--)
//                output[--bucket[A[j]/digits%10]] = A[j];
//            for(int j=0;j<n;j++){
//                A[j]=output[j];
//            }
//            digits*=10;
//        }
//        for(int i=0;i<n;i++){
//            bw.write(A[i]+"\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//}
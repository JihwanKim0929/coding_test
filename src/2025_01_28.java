//import java.util.*;
//import java.io.*;
//class p21{
//    public static long[] arr, tmp;
//    public static long result;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        arr = new long[n];
//        tmp = new long[n];
//        result = 0;
//        for(int i=0;i<n;i++)
//            arr[i]=Long.parseLong(st.nextToken());
//        mergeSort(0,n-1);
//        System.out.println(result);
//    }
//    public static void mergeSort(int s, int e){
//        if(e-s<1)
//            return;
//        int m = s+(e-s)/2;
//        mergeSort(s,m);
//        mergeSort(m+1,e);
//        for(int i = s; i <= e; i++)
//            tmp[i] = arr[i];
//        int k = s;
//        int idx1 = s;
//        int idx2 = m+1;
//        while(idx1<=m && idx2<=e){
//            if(tmp[idx1]>tmp[idx2]){
//                result  += m-idx1+1;
//                arr[k++] = tmp[idx2++];
//            }
//            else
//                arr[k++] = tmp[idx1++];
//        }
//        while(idx1<=m)
//            arr[k++] = tmp[idx1++];
//        while(idx2<=e)
//            arr[k++] = tmp[idx2++];
//    }
//}



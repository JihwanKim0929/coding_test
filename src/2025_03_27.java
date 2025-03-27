//import java.util.*;
//import java.io.*;
//
//class p50{
//    static int[] arr;
//
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        arr = new int[n+1];
//        for(int i=0;i<=n;i++)
//            arr[i]=i;
//        int q = Integer.parseInt(st.nextToken());
//        for(int z=0;z<q;z++){
//            st = new StringTokenizer(br.readLine());
//            int type = Integer.parseInt(st.nextToken());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            if(type==0){
//                union(a,b);
//            }
//            else{
//                if(find(a)==find(b))
//                    System.out.println("YES");
//                else
//                    System.out.println("NO");
//            }
//        }
//    }
//
//    static int find(int n){
//        if(arr[n]==n)
//            return n;
//        return arr[n] = find(arr[n]);
//    }
//    static void union(int a, int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b){
//            arr[b] = a;
//        }
//    }
//}
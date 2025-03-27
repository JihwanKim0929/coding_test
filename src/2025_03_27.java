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

//import java.util.*;
//import java.io.*;
//class p51{
//    static int[] arr;
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        int m = Integer.parseInt(br.readLine());
//        arr = new int[n+1];
//        for(int i=1;i<=n;i++)
//            arr[i] = i;
//        for(int i=1;i<=n;i++){
//            st = new StringTokenizer(br.readLine());
//            for(int j=1;j<=n;j++)
//                if(Integer.parseInt(st.nextToken())==1)
//                    union(i,j);
//        }
//        st = new StringTokenizer(br.readLine());
//        int boss = find(Integer.parseInt(st.nextToken()));
//        boolean flag = false;
//        for(int i=0;i<m-1;i++) {
//            if (find(Integer.parseInt(st.nextToken())) != boss) {
//                flag = true;
//                break;
//            }
//        }
//
//        if(flag)
//            System.out.println("NO");
//        else
//            System.out.println("YES");
//
//    }
//    static int find(int n){
//        if(arr[n]==n)
//            return n;
//        else
//            return arr[n] = find(arr[n]);
//    }
//
//    static void union(int a,int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b)
//            arr[b] = a;
//    }
//}
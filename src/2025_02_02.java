//import java.util.*;
//import java.io.*;
//
//class p35{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[][] A = new int[n][2];
//        for(int i=0;i<n;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            A[i][0]=Integer.parseInt(st.nextToken());
//            A[i][1]=Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(A,new Comparator<int[]>(){
//            @Override
//            public int compare(int[] a, int[] b){
//                if(a[1] == b[1])
//                    return a[0]-b[0];
//                else
//                    return a[1]-b[1];
//            }
//        });
//        int count = 0;
//        int end = -1;
//        for(int i=0;i<n;i++){
//            if(A[i][0]>=end){
//                count++;
//                end = A[i][1];
//            }
//        }
//        System.out.println(count);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p36{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        String[] arr = s.split("-");
//        int sum = 0;
//        sum+=getSum(arr[0]);
//        for(int i=1;i<arr.length;i++){
//            sum-=getSum(arr[i]);
//        }
//        System.out.println(sum);
//    }
//    static int getSum(String s){
//        int sum = 0;
//        String[] tmp = s.split("[+]");
//        for(int i=0;i<tmp.length;i++)
//            sum+=Integer.parseInt(tmp[i]);
//        return sum;
//    }
//}
//import java.util.*;
//import java.io.*;
//class p37{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int s = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        boolean[] isNotPrime = new boolean[e+1];
//        isNotPrime[1]=true;
//        for(int i=2;i<=Math.sqrt(e);i++){
//            if(!isNotPrime[i]){
//                for(int j=2*i;j<=e;j+=i){
//                    if(j%i==0)
//                        isNotPrime[j]=true;
//                }
//            }
//        }
//        for(int i=s;i<=e;i++){
//            if(!isNotPrime[i]){
//                System.out.println(i);
//            }
//        }
//    }
//}

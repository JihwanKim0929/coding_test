//import java.util.*;
//import java.io.*;
//class p29{
//    static int[] arr;
//    static int n,m;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
//        arr = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0;i<n;i++)
//            arr[i] = Integer.parseInt(st.nextToken());
//
//        Arrays.sort(arr);
//
//        m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for(int i=0;i<m;i++){
//            if(find(Integer.parseInt(st.nextToken())))
//                System.out.println(1);
//            else
//                System.out.println(0);
//        }
//    }
//    static boolean find(int num){
//        int s = 0;
//        int e = n-1;
//        int m;
//        while(s<=e){
//            m = (s+e)/2;
//            if(arr[m]>num)
//                e = m-1;
//            else if(arr[m]<num)
//                s = m+1;
//            else
//                return true;
//        }
//        return false;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p30{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[] arr = new int[n];
//        st = new StringTokenizer(br.readLine());
//        int sum = 0;
//        int max = 0;
//        for(int i=0;i<n;i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//            sum+=arr[i];
//            if(arr[i]>max)
//                max = arr[i];
//        }
//
//        int s = max;
//        int e = sum;
//        int mid;
//        while(s<=e){
//            mid = (s+e)/2;
//            int lap = 0;
//            int left = mid;
//            for(int i=0;i<n;i++){
//                if(left<arr[i]){
//                    left = mid;
//                    left-=arr[i];
//                    lap++;
//                }
//                else{
//                    left-=arr[i];
//                }
//            }
//            if(left<mid)
//                lap++;
//            if(lap>m)
//                s = mid+1;
//            else
//                e = mid-1;
//        }
//        System.out.println(s);
//    }
//}
//
//import java.util.*;
//import java.io.*;
//class p31{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int s = 1;
//        int e = k;
//        int answer=0;
//        while(s<=e){
//            int mid = (s+e)/2;
//            int smallerCount = 0;
//            for(int i=1;i<=n;i++){
//                smallerCount+=Math.min(n,mid/i);
//            }
//            if(smallerCount<k)
//                s = mid+1;
//            else {
//                e = mid - 1;
//                answer = mid;
//            }
//        }
//        System.out.println(answer);
//    }
//}
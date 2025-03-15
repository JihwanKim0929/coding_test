//import java.util.*;
//import java.io.*;
//
//class p16{
//    public static void main(String[] args)throws IOException{
//        //몇 번째에서 멈출지?
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        node[] arr = new node[n];
//        for(int i=0;i<n;i++){
//            int input = Integer.parseInt(br.readLine());
//            arr[i] = new node(i,input);
//        }
//        Arrays.sort(arr);
//        int max = 0;
//        for(int i=0;i<n;i++){
//            if(arr[i].idx - i > max)
//                max = arr[i].idx - i;
//        }
//        System.out.println(max+1);
//
//    }
//}
//
//class node implements Comparable<node>{
//    int idx;
//    int val;
//    node(int idx, int val){
//        this.idx = idx;
//        this.val = val;
//    }
//    public int compareTo(node n){
//        return val-n.val;
//    }
//}

//import java.io.*;
//import java.util.*;
//class p17{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        int n = s.length();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = s.charAt(i)-'0';
//        }
//
//        //arr을 내림차순 정렬
//        for(int i=0;i<n-1;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]<arr[j]){
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//
//        for(int i=0;i<n;i++)
//            System.out.print(arr[i]);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p18{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        for(int i=1;i<n;i++){
//            //앞에서 자기보다 작은 최초 수 찾을때까지 가기
//            int insert_point = i;
//            int now_val = arr[i];
//            for(int j=i-1;j>=0;j--){
//                if(arr[j]<now_val){
//                    insert_point = j+1;
//                    break;
//                }
//                if(j==0)
//                    insert_point = 0;
//            }
//            for(int j=i-1;j>=insert_point;j--){
//                arr[j+1] = arr[j];
//            }
//            arr[insert_point] = now_val;
//        }
//        int[] sum = new int[n];
//        sum[0] = arr[0];
//        for(int i=1;i<n;i++)
//            sum[i] = sum[i-1]+arr[i];
//
//        int answer = 0;
//        for(int i=0;i<n;i++){
//            answer+=sum[i];
//        }
//        System.out.println(answer);
//    }
//}

//19 보류

//import java.util.*;
//import java.io.*;
//class p20{
//    static int[] A,tmp;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        A = new int[n];
//        tmp  = new int[n];
//        for(int i=0;i<n;i++){
//            A[i] = Integer.parseInt(br.readLine());
//        }
//        merge_sort(0,n-1);
//        for(int i=0;i<n;i++){
//            System.out.println(A[i]);
//        }
//    }
//    static void merge_sort(int s, int e){
//        if(s==e)
//            return;
//        int m = s+(e-s)/2;
//        merge_sort(s,m);
//        merge_sort(m+1,e);
//
//        //s~m, m+1~e까지는 정렬되었음
//        //A의 s~e까지 채워야함
//        //tmp에 옮겨놓고 k(A배열에 넣을 위치), index1,2를 선언
//        for(int i=s;i<=e;i++)
//            tmp[i] = A[i];
//        int k = s;
//        int idx1 = s;
//        int idx2 = m+1;
//        while(idx1<=m && idx2<=e){
//            if(tmp[idx1]<tmp[idx2])
//                A[k++] = tmp[idx1++];
//            else
//                A[k++] = tmp[idx2++];
//        }
//        while(idx1<=m)
//            A[k++] = tmp[idx1++];
//        while(idx2<=e)
//            A[k++] = tmp[idx2++];
//    }
//}
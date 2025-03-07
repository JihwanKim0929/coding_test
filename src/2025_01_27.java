//import java.util.*;
//import java.io.*;
//class p16{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        node[] arr = new node[n];
//        for(int i=0;i<n;i++){
//            arr[i]= new node(i,Integer.parseInt(br.readLine()));
//        }
//        Arrays.sort(arr);
//        int max = 0;
//        for(int i = 0;i<n;i++){
//            if(max < arr[i].firstIndex - i){
//                max = arr[i].firstIndex - i;
//            }
//        }
//        System.out.println(max+1);
//    }
//}
//
//class node implements Comparable<node>{
//    int firstIndex;
//    int value;
//    public node(int firstIndex, int value){
//        this.firstIndex = firstIndex;
//        this.value = value;
//    }
//
//    @Override
//    public int compareTo(node o) {
//        return this.value - o.value;
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p17{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char[] charArr = br.readLine().toCharArray();
//        int[] arr = new int[charArr.length];
//        for(int i = 0; i< arr.length;i++){
//            arr[i] = charArr[i]-'0';
//        }
//        for(int i = 0; i < arr.length-1; i++){
//            int max = i;
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[j]>arr[max])
//                    max = j;
//            }
//            if(arr[max] > arr[i]){
//                int tmp = arr[i];
//                arr[i] = arr[max];
//                arr[max] = tmp;
//            }
//        }
//        for(int n:arr){
//            System.out.print(n);
//        }
//    }
//}
//import java.util.*;
//import java.io.*;
//class p18{
//    public static void main(String[] args)throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        arr[0] = Integer.parseInt(st.nextToken());
//        for (int i = 1; i < n; i++) {
//            int input = Integer.parseInt(st.nextToken());
//            int injection_idx = i;
//            for (int j = i - 1; j >= 0; j--) {
//                if (arr[j] < input) {
//                    injection_idx = j+1;
//                    break;
//                }
//                if (j == 0)
//                    injection_idx = 0;
//            }
//            for (int j = i; j > injection_idx; j--) {
//                arr[j] = arr[j - 1];
//            }
//            arr[injection_idx] = input;
//        }
//        int[] sum_arr = new int[n];
//        sum_arr[0] = arr[0];
//        for (int i = 1; i < n; i++) {
//            sum_arr[i] = sum_arr[i - 1] + arr[i];
//        }
//        int sum = 0;
//        for (int tmp : sum_arr)
//            sum += tmp;
//        System.out.println(sum);
//    }
//}
//p19 퀵정렬 보류

//import java.util.*;
//import java.io.*;
//
//class p20{
//    static int[] arr, tmp;
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//        arr = new int[n];
//        tmp = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        merge_sort(0,n-1);
//        for(int i=0;i<n;i++){
//            bw.write(arr[i]+"\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//    public static void merge_sort(int s, int e){
//        if(e-s<1)
//            return;
//        int m = s+(e-s)/2;
//        merge_sort(s,m);
//        merge_sort(m+1,e);
//        for(int i=s;i<=e;i++){
//            tmp[i] = arr[i];
//        }
//        int k = s;
//        int idx1 = s;
//        int idx2 = m+1;
//        while(idx1<=m && idx2<=e){
//            if(tmp[idx1] > tmp[idx2])
//                arr[k++] = tmp[idx2++];
//            else
//                arr[k++] = tmp[idx1++];
//        }
//        while(idx1<=m){
//            arr[k++] = tmp[idx1++];
//        }
//        while(idx2<=e){
//            arr[k++] = tmp[idx2++];
//        }
//    }
//}

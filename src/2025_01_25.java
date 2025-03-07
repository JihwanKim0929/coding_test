//import java.util.*;
//import java.io.*;
//
//class p7{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int m = Integer.parseInt(st.nextToken());
//        int[] arr = new int[n];
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0 ;i<n;i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        int a = 0;
//        int b = n-1;
//        int count = 0;
//        while(a<b){
//            int sum = arr[a]+arr[b];
//            if( sum == m){
//                count++;
//                a++;
//                b--;
//            }
//            else if(sum < m){
//                a++;
//            }
//            else{
//                b--;
//            }
//        }
//        System.out.println(count);
//    }
//}
//import java.util.*;
//import java.io.*;
//class p8{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        long[] arr = new long[n];
//        st = new StringTokenizer(br.readLine());
//        for(int i =0;i<n;i++){
//            arr[i] = Long.parseLong(st.nextToken());
//        }
//        Arrays.sort(arr);
//        int count = 0;
//        for(int i=0;i<n;i++){
//            long find = arr[i];
//            int left = 0;
//            int right = n-1;
//            while(left<right){
//                long tmp = arr[left]+arr[right];
//                if(tmp == find){
//                    if(left != i && right != i){
//                        count++;
//                        break;
//                    } else if(left == i){
//                        left++;
//                    } else{
//                        right--;
//                    }
//
//                }
//                else if(tmp<find){
//                    left++;
//                }
//                else{
//                    right--;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}
//import java.util.*;
//import java.io.*;
//class p9{
//    static int[] checker;
//    static int[] status;
//    static int checkSecret;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        String s = st.nextToken();
//        char[] A = s.toCharArray();
//        st = new StringTokenizer(br.readLine());
//        checker = new int[4];
//        checkSecret=0;
//        int answer = 0;
//        for(int i=0;i<4;i++){
//            checker[i] = Integer.parseInt(st.nextToken());
//            if(checker[i]==0)
//                checkSecret++;
//        }
//        status = new int[4];
//        for(int i=0;i<m;i++){
//            add(A[i]);
//        }
//        if(checkSecret == 4)
//            answer++;
//        for(int i=m;i<n;i++){
//            int j = i - m;
//            add(A[i]);
//            remove(A[j]);
//            if(checkSecret == 4)
//                answer++;
//        }
//        System.out.println(answer);
//    }
//
//    private static void remove(char c) {
//        switch(c){
//            case 'A':
//                if(status[0]==checker[0])
//                    checkSecret--;
//                status[0]--;
//                break;
//            case 'C':
//                if(status[1]==checker[1])
//                    checkSecret--;
//                status[1]--;
//                break;
//            case 'G':
//                if(status[2]==checker[2])
//                    checkSecret--;
//                status[2]--;
//                break;
//            case 'T':
//                if(status[3]==checker[3])
//                    checkSecret--;
//                status[3]--;
//                break;
//        }
//    }
//
//    private static void add(char c) {
//        switch(c){
//            case 'A':
//                status[0]++;
//                if(status[0] == checker[0]){
//                    checkSecret++;
//                }
//                break;
//            case 'C':
//                status[1]++;
//                if(status[1] == checker[1]){
//                    checkSecret++;
//                }
//                break;
//            case 'G':
//                status[2]++;
//                if(status[2] == checker[2]){
//                    checkSecret++;
//                }
//                break;
//            case 'T':
//                status[3]++;
//                if(status[3] == checker[3]){
//                    checkSecret++;
//                }
//                break;
//        }
//    }
//}
//import java.util.*;
//import java.io.*;
//class node{
//    int idx;
//    int val;
//    node(int idx, int val){
//        this.idx = idx;
//        this.val = val;
//    }
//}
//class p10{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int windowSize = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        Deque<node> deq = new LinkedList<>();
//        for(int i =0;i<n;i++){
//            int now_val = Integer.parseInt(st.nextToken());
//            while(!deq.isEmpty() && deq.getLast().val>now_val){
//                deq.removeLast();
//            }
//            deq.addLast(new node(i,now_val));
//            if(deq.getFirst().idx<i-windowSize+1){
//                deq.removeFirst();
//            }
//            bw.write(deq.getFirst().val+" ");
//        }
//        bw.flush();
//        bw.close();
//    }
//}
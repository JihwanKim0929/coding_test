//import java.util.*;
//import java.io.*;
//
//class p34{
//    public static void main(String[] args)throws IOException{
//        //양수 배열 -> 큰 순으로 정렬, 두개씩 타이
//        //음수 배열 -> 절댓값 큰 순으로 정렬, 두개씩 타이, 남은건 0이랑 묶기
//        //0-> 남은 음수랑 묶기
//        //1-> 따로 새서 다 더하기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
//        PriorityQueue<Integer> minus = new PriorityQueue<>();
//        int count_0 = 0;
//        int count_1 = 0;
//        for(int i=0;i<n;i++){
//            int tmp = Integer.parseInt(br.readLine());
//            if(tmp>1)
//                plus.offer(tmp);
//            else if(tmp<0)
//                minus.offer(tmp);
//            else if(tmp==0)
//                count_0++;
//            else
//                count_1++;
//        }
//        int answer = 0;
//        while(plus.size()>1){
//            int a = plus.poll();
//            int b = plus.poll();
//            answer += a*b;
//        }
//        if(!plus.isEmpty())
//            answer += plus.poll();
//        while(minus.size()>1){
//            int a = minus.poll();
//            int b = minus.poll();
//            answer += a*b;
//        }
//        if(!minus.isEmpty()&&count_0==0)
//            answer += minus.poll();
//
//        answer+=count_1;
//
//        System.out.println(answer);
//
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p35{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        PriorityQueue<Meeting> pq = new PriorityQueue<>();
//        StringTokenizer st;
//        for(int i=0;i<n;i++){
//            st = new StringTokenizer(br.readLine());
//            int s = Integer.parseInt(st.nextToken());
//            int e = Integer.parseInt(st.nextToken());
//            pq.offer(new Meeting(s,e));
//        }
//        Meeting now = pq.poll();
//        int answer = 1;
//        int endTime = now.e;
//        while(!pq.isEmpty()){
//            now = pq.poll();
//            if(now.s>=endTime){
//                answer++;
//                endTime = now.e;
//            }
//        }
//        System.out.println(answer);
//    }
//}
//
//class Meeting implements Comparable<Meeting>{
//    int s,e;
//    Meeting(int s, int e){
//        this.s=s;
//        this.e=e;
//    }
//    public int compareTo(Meeting m){
//        if(e == m.e){
//            return s-m.s;
//        }
//        return e-m.e;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p36{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        String[] chunk = s.split("-");
//        int answer = getSum(chunk[0]);
//        for(int i=1;i<chunk.length;i++){
//            answer -= getSum(chunk[i]);
//        }
//        System.out.println(answer);
//    }
//    static int getSum(String s){
//        String[] arr = s.split("[+]");
//        int answer = 0;
//        for(int i=0;i<arr.length;i++){
//            answer += Integer.parseInt(arr[i]);
//        }
//        return answer;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p37{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[] arr = new int[m+1];
//        for(int i=1;i<=m;i++)
//            arr[i] = i;
//        arr[1] = -1;
//        for(int i=2;i<=Math.sqrt(m);i++){
//            if(arr[i]==i){
//                for(int j=i*2;j<=m;j+=i){
//                    arr[j] = -1;
//                }
//            }
//        }
//        for(int i=n;i<=m;i++)
//            if(arr[i]!=-1)
//                System.out.println(arr[i]);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p38{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        long A = sc.nextLong();
//        long B = sc.nextLong();
//        int[] arr = new int[10000001];
//        for(int i=2;i<arr.length;i++)
//            arr[i] = i;
//        arr[1] = -1;
//        for(int i=2;i<=Math.sqrt(arr.length);i++){
//            if(arr[i]!=-1){
//                for(int j=i*2;j<arr.length;j+=i)
//                    arr[j] = -1;
//            }
//        }
//        int answer = 0;
//        for(int i=2;i<10000001;i++){
//            if(arr[i]!=-1){
//                long tmp = arr[i];
//                while((double)arr[i]<=(double)B/(double)tmp){
//                    if((double)arr[i]>=(double)A/(double)tmp){
//                        answer++;
//                    }
//                    tmp *= arr[i];
//                }
//            }
//        }
//        System.out.println(answer);
//    }
//}
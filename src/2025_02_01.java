//import java.util.*;
//import java.io.*;
//class p30{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int start = 0;
//        int end = 0;
//        int[] A = new int[n];
//        for(int i=0;i<n;i++){
//            int input = Integer.parseInt(st.nextToken());
//            A[i]=input;
//            if(input>start)
//                start = input;
//            end+=input;
//        }
//        while(start<=end){
//            int mid = (start+end)/2;
//            int sum = 0;
//            int count = 0;
//            for(int i=0;i<n;i++){
//                if(sum+A[i]>mid){
//                    sum = 0;
//                    count++;
//                }
//                sum+=A[i];
//            }
//            if(sum!=0){
//                count++;
//            }
//            if(count>m){
//                start = mid+1;
//            }
//            else{
//                end = mid-1;
//            }
//        }
//        System.out.println(start);
//    }
//}

//p31 보류

//import java.util.*;
//import java.io.*;
//class p32{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int target = Integer.parseInt(st.nextToken());
//        int[] coin = new int[n];
//        for(int i=0;i<n;i++){
//            coin[i] = Integer.parseInt(br.readLine());
//        }
//        int answer = 0;
//        for(int i=n-1;i>=0;i--){
//            if(target>=coin[i]){
//                answer += target/coin[i];
//                target %=coin[i];
//            }
//        }
//        System.out.println(answer);
//    }
//}
//import java.util.*;
//import java.io.*;
//class p33{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
//        for(int i=0;i<n;i++){
//            int input = Integer.parseInt(br.readLine());
//            queue.offer(input);
//        }
//        int sum = 0;
//        while(queue.size()>1){
//            int deck1 = queue.poll();
//            int deck2 = queue.poll();
//            sum+=deck1+deck2;
//            queue.offer(deck1+deck2);
//        }
//        System.out.println(sum);
//    }
//}
//import java.util.*;
//import java.io.*;
//class p34{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        PriorityQueue<Integer> positive = new PriorityQueue<>(Collections.reverseOrder());
//        PriorityQueue<Integer> negative = new PriorityQueue<>();
//        int zero=0,one=0;
//        for(int i=0;i<n;i++){
//            int input = Integer.parseInt(br.readLine());
//            if(input>1)
//                positive.offer(input);
//            else if(input<0)
//                negative.offer(input);
//            else if(input == 0)
//                zero++;
//            else
//                one++;
//        }
//        int sum = 0;
//        while(!positive.isEmpty()){
//            int n1 = positive.poll();
//            if(positive.isEmpty()){
//                sum+=n1;
//                break;
//            }
//            int n2 = positive.poll();
//            sum+=n1*n2;
//        }
//        while(!negative.isEmpty()){
//            int n1 = negative.poll();
//            if(negative.isEmpty()){
//                if(zero<1){
//                    sum+=n1;
//                }
//                break;
//            }
//            int n2 = negative.poll();
//            sum+=n1*n2;
//        }
//        sum+=one;
//        System.out.println(sum);
//    }
//}
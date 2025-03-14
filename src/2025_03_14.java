//import java.util.*;
//import java.io.*;
//class p11{
//    public static void main(String[] args)throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        Stack<Integer> stack = new Stack<>();
//
//        StringBuffer bf = new StringBuffer();
//
//        int num = 1;
//        boolean flag = true;
//        for(int i=0;i<n;i++){
//            int now = sc.nextInt();
//            if(now>=num){
//                while(now>=num){
//                    stack.push(num++);
//                    bf.append("+\n");
//                }
//                stack.pop();
//                bf.append("-\n");
//            }
//            else{
//                int popped = stack.pop();
//                if(popped>now){
//                    System.out.println("NO");
//                    flag = false;
//                    break;
//                }
//                else{
//                    bf.append("-\n");
//                }
//            }
//        }
//        if(flag)
//            System.out.println(bf.toString());
//    }
//}

//import java.util.*;
//import java.io.*;
//class p12{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0;i<n;i++)
//            arr[i] = Integer.parseInt(st.nextToken());
//        Stack<Integer> stack = new Stack<>();
//        int[] answer = new int[n];
//        for(int i=0;i<n;i++){
//            int now = arr[i];
//            while(!stack.isEmpty()){
//                if(arr[stack.peek()]<now){
//                    answer[stack.pop()] = arr[i];
//                }
//                else
//                    break;
//            }
//            stack.push(i);
//        }
//        while(!stack.isEmpty()){
//            answer[stack.pop()] = -1;
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for(int i=0;i<n;i++)
//            bw.write(answer[i]+" ");
//        bw.flush();
//        bw.close();
//    }
//}

//import java.util.*;
//import java.io.*;
//class p13{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Queue<Integer> queue = new LinkedList<>();
//        for(int i=1;i<=n;i++)
//            queue.offer(i);
//        while(queue.size()>1){
//            queue.poll();
//            queue.offer(queue.poll());
//        }
//        System.out.println(queue.poll());
//    }
//}

//import java.util.*;
//import java.io.*;
//class p14{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)->{
//            int abs1 = Math.abs(n1);
//            int abs2 = Math.abs(n2);
//            if(abs1 == abs2){
//                return n1-n2;
//            }
//            else
//                return abs1-abs2;
//        });
//        for(int i=0;i<n;i++){
//            int input = Integer.parseInt(br.readLine());
//            if(input == 0){
//                if(pq.isEmpty())
//                    System.out.println(0);
//                else
//                    System.out.println(pq.poll());
//            }
//            else{
//                pq.offer(input);
//            }
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p15{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++)
//            arr[i] = Integer.parseInt(br.readLine());
//
//        for(int i=n-2;i>=0;i--){
//            boolean flag = false;
//            for(int j=0;j<=i;j++){
//                if(arr[j]>arr[j+1]){
//                    int tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                    flag = true;
//                }
//            }
//            if(!flag)
//                break;
//        }
//        for(int i=0;i<n;i++)
//            System.out.println(arr[i]);
//    }
//}

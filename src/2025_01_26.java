//import java.util.*;
//import java.io.*;
//
//class p11{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuffer bf = new StringBuffer();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int now = 1;
//        boolean flag = true;
//        Stack<Integer> stack = new Stack<>();
//        for(int i =0;i<n;i++){
//            st = new StringTokenizer(br.readLine());
//            int input = Integer.parseInt(st.nextToken());
//            if(input>=now){
//                while(now<=input){
//                    stack.push(now++);
//                    bf.append("+\n");
//                }
//                stack.pop();
//                bf.append("-\n");
//            }
//            else{
//                if(input < stack.pop()){
//                    flag = false;
//                    System.out.println("NO");
//                    break;
//                }
//                else{
//                    bf.append("-\n");
//                }
//
//            }
//        }
//        if(flag)
//            System.out.println(bf.toString());
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p12{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int[] array = new int[n];
//        int[] answer = new int[n];
//        for(int i=0;i<n;i++){
//            array[i] = Integer.parseInt(st.nextToken());
//        }
//        Stack<Integer> stack = new Stack<>();
//        stack.push(0);
//        for(int i=1;i<n;i++){
//            while(!stack.isEmpty() && array[stack.peek()]<array[i]){
//                answer[stack.pop()] = array[i];
//            }
//            stack.push(i);
//        }
//        while(!stack.isEmpty()){
//            answer[stack.pop()] = -1;
//        }
//        for(int i=0;i<n;i++){
//            bw.write(answer[i]+" ");
//        }
//        bw.flush();
//        bw.close();
//    }
//}
//import java.util.*;
//import java.io.*;
//class p13{
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Queue<Integer> queue = new LinkedList<>();
//        for(int i = 1;i<=n;i++){
//            queue.add(i);
//        }
//        while(queue.size()>1){
//            queue.poll();
//            queue.add(queue.poll());
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
//        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->{
//            int first_abs = Math.abs(o1);
//            int second_abs = Math.abs(o2);
//            if(first_abs == second_abs)
//                return o1-o2;
//            else
//                return first_abs - second_abs;
//        });//리턴이 양수면 첫번째 매개변수가 더 큰걸로 판단
//        for(int i=0;i<n;i++){
//            int input = Integer.parseInt(br.readLine());
//            if(input==0){
//                if(queue.isEmpty()){
//                    System.out.println(0);
//                }
//                else{
//                    System.out.println(queue.poll());
//                }
//            }
//            else{
//                queue.add(input);
//            }
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p15{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=Integer.parseInt(br.readLine());
//        }
//        for(int i=0;i<n-1;i++){
//            boolean flag = false;
//            for(int j=0;j<n-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int tmp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=tmp;
//                    flag=true;
//                }
//            }
//            if(!flag)
//                break;
//        }
//        for(int i=0;i<n;i++){
//            bw.write(arr[i]+"\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//}
//import java.util.*;
//import java.io.*;
//
//class p53{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        ArrayList<Integer>[] A  = new ArrayList[n+1];
//        int[] degree = new int[n+1];
//        for(int i=1;i<n+1;i++){
//            A[i] = new ArrayList<>();
//        }
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int s = Integer.parseInt(st.nextToken());
//            int e = Integer.parseInt(st.nextToken());
//            A[s].add(e);
//            degree[e]++;
//        }
//        Queue<Integer> queue = new LinkedList<>();
//        for(int i=1;i<=n;i++){
//            if(degree[i]==0)
//                queue.offer(i);
//        }
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            for(int i:A[now]){
//                degree[i]--;
//                if(degree[i]==0)
//                    queue.offer(i);
//            }
//            System.out.print(now+" ");
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p54{
//    public static void main(String[] args)throws IOException{
//        ArrayList<Integer>[] A;
//        int[] time;
//        int[] degree;
//        int[] answer;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        A = new ArrayList[n+1];
//        for(int i=1;i<=n;i++){
//            A[i] = new ArrayList<>();
//        }
//        time = new int[n+1];
//        degree = new int[n+1];
//        answer = new int[n+1];
//        for(int i=1;i<=n;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            time[i]= Integer.parseInt(st.nextToken());
//            while(true){
//                int pre = Integer.parseInt(st.nextToken());
//                if(pre==-1)
//                    break;
//                A[pre].add(i);
//                degree[i]++;
//            }
//        }
//        Queue<Integer> queue = new LinkedList<>();
//        for(int i=1;i<=n;i++){
//            if(degree[i]==0)
//                queue.offer(i);
//        }
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            for(int i:A[now]){
//                degree[i]--;
//                answer[i] = Math.max(answer[i],answer[now]+time[now]);
//                if(degree[i]==0)
//                    queue.add(i);
//            }
//        }
//
//        for(int i=1;i<=n;i++){
//            System.out.println(answer[i]+time[i]);
//        }
//    }
//
//}

//import java.util.*;
//import java.io.*;
//
//class p55{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int m = Integer.parseInt(br.readLine());
//        ArrayList<int[]>[] A = new ArrayList[n+1];
//        ArrayList<int[]>[] B = new ArrayList[n+1];
//        for(int i=1;i<=n;i++) {
//            A[i] = new ArrayList<>();
//            B[i] = new ArrayList<>();
//        }
//        int[] degree = new int[n+1];
//        int[] timeToPath = new int[n+1];
//        for(int i=0;i<m;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int s = Integer.parseInt(st.nextToken());
//            int e = Integer.parseInt(st.nextToken());
//            int t= Integer.parseInt(st.nextToken());
//            A[s].add(new int[]{e,t});
//            B[e].add(new int[]{s,t});
//            degree[e]++;
//        }
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int startCity = Integer.parseInt(st.nextToken());
//        int endCity = Integer.parseInt(st.nextToken());
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(startCity);
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            for(int[] next:A[now]){
//                degree[next[0]]--;
//                timeToPath[next[0]] = Math.max(timeToPath[next[0]],timeToPath[now]+next[1]);
//                if(degree[next[0]]==0)
//                    queue.offer(next[0]);
//            }
//        }
//
//        int result = 0;
//        queue.offer(endCity);
//        boolean[] visited = new boolean[n+1];
//        visited[endCity] = true;
//
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            for(int[] next:B[now]){
//                if(timeToPath[now] == timeToPath[next[0]]+next[1]){
//                    result++;
//                    if(!visited[next[0]]){
//                        visited[next[0]]=true;
//                        queue.offer(next[0]);
//                    }
//                }
//            }
//        }
//        System.out.println(timeToPath[endCity]);
//        System.out.println(result);
//    }
//}
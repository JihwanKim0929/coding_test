//import java.util.*;
//import java.io.*;
//class p28{
//    static ArrayList<Edge>[] A;
//    static int[] distance;
//    static boolean[] visited;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        A = new ArrayList[n+1];
//        for(int i=1;i<=n;i++){
//            A[i] = new ArrayList<Edge>();
//        }
//
//        for(int i=1;i<=n;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int now = Integer.parseInt(st.nextToken());
//            while(true){
//                int adjacent_node = Integer.parseInt(st.nextToken());
//                if(adjacent_node == -1){
//                    break;
//                }
//                int distance = Integer.parseInt(st.nextToken());
//                A[now].add(new Edge(adjacent_node,distance));
//            }
//        }
//
//        distance = new int[n+1];
//        visited = new boolean[n+1];
//        BFS(1);
//        int most_far_node = 1;
//        for(int i=2;i<=n;i++){
//            if(distance[i]>distance[most_far_node])
//                most_far_node = i;
//        }
//
//        distance = new int[n+1];
//        visited = new boolean[n+1];
//        BFS(most_far_node);
//
//        int diameter = distance[1];
//        for(int i=2;i<=n;i++){
//            if(diameter<distance[i])
//                diameter = distance[i];
//        }
//
//        System.out.println(diameter);
//    }
//    static void BFS(int start_idx){
//        Queue<Integer> queue = new LinkedList<Integer>();
//        visited[start_idx] = true;
//        queue.offer(start_idx);
//        while(!queue.isEmpty()){
//            int now_idx = queue.poll();
//            for(Edge e:A[now_idx]){
//                if(!visited[e.e]){
//                    visited[e.e]=true;
//                    queue.add(e.e);
//                    distance[e.e]=distance[now_idx]+e.value;
//                }
//            }
//        }
//    }
//}
//
//class Edge{
//    int e;
//    int value;
//    public Edge(int e, int value){
//        this.e=e;
//        this.value=value;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p29{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        int repeat = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for(int i=0;i<repeat;i++){
//            int target = Integer.parseInt(st.nextToken());
//            int start = 0;
//            int end = arr.length-1;
//            boolean find = false;
//            while(start<=end){
//                int mid = (start+end)/2;
//                if(arr[mid]>target)
//                    end = mid-1;
//                else if(arr[mid]<target)
//                    start = mid+1;
//                else{
//                    find = true;
//                    break;
//                }
//            }
//            if(find)
//                System.out.println(1);
//            else
//                System.out.println(0);
//        }
//    }
//}
//import java.util.*;
//import java.io.*;
//class p56{
//    public static void main(String[] args)throws IOException{
//        //시작만0 나머지 무한
//        //시작부터 연결된 애들 업데이트 후 방문처리
//        //가장 가까운 방문처리 안된거 반복
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        int startNode = Integer.parseInt(br.readLine());
//        ArrayList<Node>[] graph = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            graph[i] = new ArrayList<>();
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            int dis = Integer.parseInt(st.nextToken());
//            graph[orig].add(new Node(dest,dis));
//        }
//
//        int[] answer = new int[n+1];
//        Arrays.fill(answer,Integer.MAX_VALUE);
//        answer[startNode] = 0;
//        boolean[] visited = new boolean[n+1];
//        PriorityQueue<Node> pq = new PriorityQueue<>();
//        pq.offer(new Node(startNode,0));
//
//        while(!pq.isEmpty()){
//            Node now = pq.poll();
//            int now_num = now.num;
//            int now_answer = now.distance;
//            if(visited[now_num])
//                continue;
//            visited[now_num]=true;
//            for(Node next:graph[now_num]){
//                int next_num = next.num;
//                int next_dis = next.distance;
//                if(answer[next_num]>now_answer+next_dis){
//                    answer[next_num] = now_answer+next_dis;
//                    pq.offer(new Node(next_num,answer[next_num]));
//                }
//            }
//        }
//
//        for(int i=1;i<=n;i++){
//            int result = answer[i];
//            if(result==Integer.MAX_VALUE)
//                System.out.println("INF");
//            else
//                System.out.println(result);
//        }
//    }
//}
//
//class Node implements Comparable<Node> {
//    int num;
//    int distance;
//    Node(int num, int distance){
//        this.num=num;
//        this.distance=distance;
//    }
//    public int compareTo(Node node){
//        return this.distance-node.distance;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p57{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        int e = Integer.parseInt(br.readLine());
//        ArrayList<Node>[] graph = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            graph[i] = new ArrayList<>();
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            int dis = Integer.parseInt(st.nextToken());
//            graph[orig].add(new Node(dest,dis));
//        }
//        st = new StringTokenizer(br.readLine());
//        int startNode = Integer.parseInt(st.nextToken());
//        int endNode = Integer.parseInt(st.nextToken());
//        int[] answer = new int[n+1];
//        Arrays.fill(answer,Integer.MAX_VALUE);
//        answer[startNode] = 0;
//        boolean[] visited = new boolean[n+1];
//        PriorityQueue<Node> pq = new PriorityQueue<>();
//        pq.offer(new Node(startNode,0));
//
//        while(!pq.isEmpty()){
//            Node now = pq.poll();
//            int now_num = now.num;
//            int now_answer = now.distance;
//            if(visited[now_num])
//                continue;
//            visited[now_num]=true;
//            for(Node next:graph[now_num]){
//                int next_num = next.num;
//                int next_dis = next.distance;
//                if(answer[next_num]>now_answer+next_dis){
//                    answer[next_num] = now_answer+next_dis;
//                    pq.offer(new Node(next_num,answer[next_num]));
//                }
//            }
//        }
//
//        System.out.println(answer[endNode]);
//    }
//}
//
//class Node implements Comparable<Node> {
//    int num;
//    int distance;
//    Node(int num, int distance){
//        this.num=num;
//        this.distance=distance;
//    }
//    public int compareTo(Node node){
//        return this.distance-node.distance;
//    }
//}
//

//import java.util.*;
//import java.io.*;
//class p58{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        ArrayList<Node>[] graph = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            graph[i] = new ArrayList<>();
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            int dis = Integer.parseInt(st.nextToken());
//            graph[orig].add(new Node(dest,dis));
//        }
//        int startNode = 1;
//        PriorityQueue<Integer>[] answer = new PriorityQueue[n+1];
//
//        Comparator<Integer> cp = new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2){
//                return o2-o1;
//            }
//        };
//
//        for(int i=1;i<=n;i++)
//            answer[i] = new PriorityQueue<>(k,cp);
//
//
//        PriorityQueue<Node> pq = new PriorityQueue<>();
//        pq.offer(new Node(startNode,0));
//        answer[1].add(0);
//
//        while(!pq.isEmpty()){
//            Node now = pq.poll();
//            int now_num = now.num;
//            int now_answer = now.distance;
//            for(Node next:graph[now_num]){
//                if(answer[next.num].size()<k){
//                    answer[next.num].offer(now_answer+next.distance);
//                    pq.offer(new Node(next.num,now_answer+next.distance));
//                }
//                else if(answer[next.num].peek()>now_answer+next.distance){
//                    answer[next.num].poll();
//                    answer[next.num].offer(now_answer+next.distance);
//                    pq.offer(new Node(next.num,now_answer+next.distance));
//                }
//            }
//        }
//
//        for(int i=1;i<=n;i++){
//            if(answer[i].size()<k)
//                System.out.println(-1);
//            else
//                System.out.println(answer[i].peek());
//        }
//    }
//}
//
//class Node implements Comparable<Node> {
//    int num;
//    int distance;
//    Node(int num, int distance){
//        this.num=num;
//        this.distance=distance;
//    }
//    public int compareTo(Node node){
//        return this.distance-node.distance;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p59{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        //orig/dest/val
//        int[][] edges = new int[e][3];
//
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            edges[i][0] =Integer.parseInt(st.nextToken());
//            edges[i][1] = Integer.parseInt(st.nextToken());
//            edges[i][2] = Integer.parseInt(st.nextToken());
//        }
//
//        long[] dist = new long[n+1];
//        Arrays.fill(dist,Long.MAX_VALUE);
//        dist[1] = 0;
//        //n-1번 edges돌아서 업데이트
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<e;j++){
//                int orig = edges[j][0];
//                int dest = edges[j][1];
//                int val = edges[j][2];
//                if(dist[orig]!=Long.MAX_VALUE && dist[dest]>dist[orig]+val){
//                    dist[dest] = dist[orig]+val;
//                }
//            }
//        }
//
//        //1번 더 돌아서 또 업데이트 되면 음수 사이클 있는거임
//        boolean flag = false;
//        for(int i=0;i<e;i++){
//            int orig = edges[i][0];
//            int dest = edges[i][1];
//            int val = edges[i][2];
//            if(dist[orig]!=Long.MAX_VALUE && dist[dest]>dist[orig]+val){
//                flag=true;
//                break;
//            }
//        }
//
//        if(flag)
//            System.out.println(-1);
//        else{
//            for(int i=2;i<=n;i++){
//                if(dist[i]==Long.MAX_VALUE)
//                    System.out.println(-1);
//                else
//                    System.out.println(dist[i]);
//            }
//        }
//
//    }
//}
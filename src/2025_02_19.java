//import java.util.*;
//import java.io.*;
//
//class p59{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int v = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        Edge[] edgeList = new Edge[e];
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            int val = Integer.parseInt(st.nextToken());
//            edgeList[i]=new Edge(orig,dest,val);
//        }
//        long[] distance = new long[v+1];
//        for(int i=2;i<v+1;i++)
//            distance[i] = Long.MAX_VALUE;
//
//        for(int i=0;i<v-1;i++){
//            for(Edge edge:edgeList){
//                if(distance[edge.s]!=Long.MAX_VALUE && distance[edge.e]>distance[edge.s]+edge.val){
//                    distance[edge.e] = distance[edge.s]+edge.val;
//                }
//            }
//        }
//
//        boolean flag = false;
//        for(Edge edge: edgeList){
//            if(distance[edge.s]!=Long.MAX_VALUE && distance[edge.e]>distance[edge.s]+edge.val){
//                flag = true;
//                break;
//            }
//        }
//
//        if(flag){
//            System.out.println(-1);
//        }
//        else{
//            for(int i=2;i<v+1;i++){
//                if(distance[i]==Long.MAX_VALUE)
//                    System.out.println(-1);
//                else
//                    System.out.println(distance[i]);
//            }
//        }
//    }
//}
//class Edge{
//    int s;
//    int e;
//    int val;
//    Edge(int s, int e, int val){
//        this.s = s;
//        this.e = e;
//        this.val = val;
//    }
//}

//import java.io.*;
//import java.util.*;
//class p60{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int v = Integer.parseInt(st.nextToken());
//        int startNode = Integer.parseInt(st.nextToken());
//        int endNode = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        Edge[] edgeList = new Edge[e];  //엣지
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            int val = Integer.parseInt(st.nextToken());
//            edgeList[i] = new Edge(orig,dest,val);
//        }
//        st = new StringTokenizer(br.readLine());
//        int[] cityMoney = new int[v];   //도시 별 월급
//        for(int i=0;i<v;i++){
//            cityMoney[i] = Integer.parseInt(st.nextToken());
//        }
//        long[] cost = new long[v];  //누적 배열
//        Arrays.fill(cost,Long.MIN_VALUE);
//        cost[startNode] = cityMoney[startNode];
//
//        for(int i=0;i<=v+100;i++){
//            for(Edge edge:edgeList){
//                if(cost[edge.s]==Long.MIN_VALUE)
//                    continue;
//                else if(cost[edge.s]==Long.MAX_VALUE)
//                    cost[edge.e]=Long.MAX_VALUE;
//                else if(cost[edge.e]<cost[edge.s]-edge.val+cityMoney[edge.e]){
//                    cost[edge.e] = cost[edge.s]-edge.val+cityMoney[edge.e];
//                    if(i>=v-1)
//                        cost[edge.e] = Long.MAX_VALUE;
//                }
//            }
//        }
//
//        long result = cost[endNode];
//        if(result==Long.MIN_VALUE)
//            System.out.println("gg");
//        else if(result==Long.MAX_VALUE)
//            System.out.println("Gee");
//        else
//            System.out.println(result);
//    }
//}
//
//class Edge{
//    int s;
//    int e;
//    int val;
//    Edge(int s, int e, int val){
//        this.s = s;
//        this.e = e;
//        this.val = val;
//    }
//}
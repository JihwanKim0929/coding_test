//import java.util.*;
//import java.io.*;
//
//class p60{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int startNode = Integer.parseInt(st.nextToken());
//        int endNode = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//
//        //엣지리스트, 남은 돈 배열, 도시 도착금 배열
//        ArrayList<Edge> edgeList = new ArrayList<>();
//        long[] result = new long[n];
//        long[] money = new long[n];
//
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int o = Integer.parseInt(st.nextToken());
//            int d = Integer.parseInt(st.nextToken());
//            int v = Integer.parseInt(st.nextToken());
//            edgeList.add(new Edge(o,d,v));
//        }
//
//        st = new StringTokenizer(br.readLine());
//        for(int i=0;i<n;i++){
//            money[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Arrays.fill(result, Long.MIN_VALUE);
//        result[startNode] = money[startNode];
//
//        for(int i=0;i<n+100;i++){
//            //n-1회 넘어가서 업데이트가 일어나면 해당 엣지에서 갈수있는
//            //다른 노드들도 전염
//            for(Edge edge:edgeList){
//                if(result[edge.orig]==Long.MAX_VALUE){
//                    result[edge.dest] = Long.MAX_VALUE;
//                }
//                else if(result[edge.orig]!=Long.MIN_VALUE && result[edge.dest]<result[edge.orig]-edge.val+money[edge.dest]){
//                    if(i>=n-1){
//                        result[edge.dest] = Long.MAX_VALUE;
//                    }
//                    else
//                        result[edge.dest]=result[edge.orig]-edge.val+money[edge.dest];
//                }
//            }
//        }
//
//        long answer = result[endNode];
//        if(answer==Long.MAX_VALUE)
//            System.out.println("Gee");
//        else if(answer == Long.MIN_VALUE)
//            System.out.println("gg");
//        else
//            System.out.println(answer);
//    }
//}
//
//class Edge{
//    int orig , dest, val;
//    Edge(int orig, int dest, int val){
//        this.orig = orig;
//        this.dest = dest;
//        this.val = val;
//    }
//}
//

//import java.util.*;
//import java.io.*;
//
//class p66{
//    static int[] parent;
//    static PriorityQueue<Edge> edgeList;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        //모든 랜선 합에서 꼭 필요한 랜선들 길이 빼주면 됨
//        //크루스칼
//        //n을 받는다
//        int n = Integer.parseInt(br.readLine());
//        //문자열 n번 받아서
//        //i번째 문자열 j번째 열이 i->j까지 거리 엣지 . 생성. 우선순위큐에 넣기
//        //합에 각 길이 모두 더하기
//        edgeList = new PriorityQueue<>();
//        int sum = 0;
//        for(int i=0;i<n;i++){
//            String s = br.readLine();
//            for(int j=0;j<n;j++){
//                char c = s.charAt(j);
//                int leng;
//                if(c=='0')
//                    continue;
//                if(c>='a'&&c<='z'){
//                    leng = c-'a'+1;
//                }
//                else{
//                    leng = c-'A'+ 27;
//                }
//                edgeList.offer(new Edge(i,j,leng));
//                sum+=leng;
//            }
//        }
//
//        //parent 배열 초기화
//        parent = new int[n];
//        for(int i=0;i<n;i++)
//            parent[i]=i;
//
//
//        // 엣지 리스트에서 하나씩 빼서 n-1개 선택할때까지.
//        //합에서 선택된 엣지 길이 뺴주기
//        int selectedEdges = 0;
//        while(!edgeList.isEmpty()){
//            Edge now = edgeList.poll();
//            if(find(now.orig)!=find(now.dest)){
//                union(now.orig,now.dest);
//                selectedEdges++;
//                sum-=now.val;
//            }
//        }
//
//        //남은 합 출력
//        if(selectedEdges == n-1)
//            System.out.println(sum);
//        else
//            System.out.println(-1);
//    }
//    static int find(int n){
//        if(parent[n] == n)
//            return n;
//        return parent[n] = find(parent[n]);
//    }
//    static void union(int a, int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b)
//            parent[b] = a;
//    }
//}
//
//class Edge implements Comparable<Edge>{
//    int orig, dest, val;
//    Edge(int orig, int dest, int val){
//        this.orig =orig;
//        this.dest=dest;
//        this.val=val;
//    }
//    public int compareTo(Edge o){
//        return val-o.val;
//    }
//}
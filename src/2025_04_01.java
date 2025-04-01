//import java.util.*;
//import java.io.*;
//
//class Wifi{
//    public static void main(String[] args)throws IOException{
//        int[][] grid =
//                {{0,0,0},
//                        {0,1,0},
//                        {0,0,0}
//        };
//        int n = grid.length;
//        int m = grid[0].length;
//        int k = 2;
//        int [] wifi = {0,0,5};
//        int[] dx = {0,0,1,-1};
//        int[] dy = {1,-1,0,0};
//
//        //신호 배열 -> 와이파이 위치만 5로 초기화
//        //우선순위 큐(거꾸로)에 시작 위치 삽입
//        //{
//        //  큐에서 꺼냄
//        //  만약 이전에 꺼낸적 있으면 넘어감(왜냐하면 이미 이전에 꺼낸 시점에 최댓값임)
//        //  꺼낸 노드에서 갈수있는 노드들 모두 체크(nx,ny)
//        //  {
//        //      nx,ny가 각각 0이랑 n, 0이랑 m사이인지 체크
//        //          원래 값보다 꺼낸 노드-1(벽이면 추가로 -k)한게 더 크면 업데이트
//        //          이후 큐에 삽입
//        //  }
//        //}
//        int[][] signal = new int[n][m];
//        for(int i=0;i<n;i++){
//            Arrays.fill(signal[i],Integer.MIN_VALUE);
//        }
//        signal[wifi[0]][wifi[1]] = wifi[2];
//        Comparator<int[]> cp = (o1,o2)-> o2[2]-o1[2];
//        PriorityQueue<int[]> pq = new PriorityQueue<>(cp);
//        boolean[][] visited = new boolean[n][m];
//        pq.offer(new int[]{wifi[0],wifi[1],wifi[2]});
//        while(!pq.isEmpty()){
//            int[] now = pq.poll();
//            int now_x = now[0];
//            int now_y = now[1];
//            int now_signal = now[2];
//            if(visited[now_x][now_y])
//                continue;
//            visited[now_x][now_y]=true;
//            for(int i=0;i<4;i++){
//                int next_x = now_x+dx[i];
//                int next_y = now_y+dy[i];
//                if(next_x>=0 && next_x<n && next_y>=0 && next_y<m){
//                    int decrease = -1;
//                    if(grid[next_x][next_y]==1)
//                        decrease-=k;
//                    if(signal[next_x][next_y]<now_signal+decrease){
//                        signal[next_x][next_y] = now_signal+decrease;
//                        pq.offer(new int[]{next_x,next_y,signal[next_x][next_y]});
//                    }
//                }
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                    System.out.print(Math.max(signal[i][j],0)+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p61{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        int e = Integer.parseInt(br.readLine());
//        int[][] distance = new int[n+1][n+1];
//        for(int i=1;i<=n;i++){
//            Arrays.fill(distance[i],10000001);
//            distance[i][i] = 0;
//        }
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            int val = Integer.parseInt(st.nextToken());
//            if(val<distance[orig][dest])
//                distance[orig][dest] = val;
//        }
//        for(int k=1;k<=n;k++){
//            for(int i=1;i<=n;i++){
//                for(int j=1;j<=n;j++){
//                    if(distance[i][j]>distance[i][k]+distance[k][j]){
//                        distance[i][j]=distance[i][k]+distance[k][j];
//                    }
//                }
//            }
//        }//i->j로 가는 최단거리가 한방에 확정되는게 아님. 모든 중간경로 다 고려해서 가장 짧은걸로 확정됨
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                int ans = distance[i][j];
//                if(ans==10000001)
//                    System.out.print(0+" ");
//                else System.out.print(ans+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p62{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        int[][] ans = new int[n][n];
//        for(int i=0;i<n;i++){
//            st = new StringTokenizer(br.readLine());
//            for(int j=0;j<n;j++){
//                ans[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        for(int k=0;k<n;k++){
//            for(int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    if(ans[i][k]==1 && ans[k][j]==1)
//                        ans[i][j]=1;
//                }
//            }
//        }
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(ans[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p63{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        int[][] ans = new int[n+1][n+1];
//        for(int i=1;i<=n;i++){
//            Arrays.fill(ans[i],100000000);
//            ans[i][i] = 0;
//        }
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            ans[orig][dest]=1;
//            ans[dest][orig]=1;
//        }
//        for(int k=1;k<=n;k++){
//            for(int i=1;i<=n;i++){
//                for(int j=1;j<=n;j++){
//                    if(ans[i][j]>ans[i][k]+ans[k][j]){
//                        ans[i][j] = ans[i][k]+ans[k][j];
//                    }
//                }
//            }
//        }
//        int[] sum = new int[n+1];
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                sum[i]+=ans[i][j];
//            }
//        }
//        int min = 1;
//        for(int i=2;i<=n;i++){
//            if(sum[i]<sum[min])
//                min = i;
//        }
//        System.out.println(min);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p64{
//    static int[] parent;
//    public static void main(String[] args)throws IOException {
//        //노드,엣지 수 입력 받기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        //엣지 리스트 생성(우선순위 큐)
//        PriorityQueue<Edge> edgeList = new PriorityQueue<>();
//        //엣지 입력 받기
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int o = Integer.parseInt(st.nextToken());
//            int d = Integer.parseInt(st.nextToken());
//            int v = Integer.parseInt(st.nextToken());
//            edgeList.add(new Edge(o,d,v));
//        }
//        //유니온 파인드 배열 생성
//        parent = new int[n+1];
//        for(int i=1;i<=n;i++)
//            parent[i] = i;
//        //총합, 선택 엣지 수 변수 생성
//        int sum = 0 , selected = 0;
//        //엣지들 하나씩 꺼내서 find해서 사이클 생성 안되면 유니온
//        //n-1이면 종료
//        while(selected<n-1){
//            Edge now = edgeList.poll();
//            if(find(now.orig)!=find(now.dest)){
//                union(now.orig,now.dest);
//                sum+=now.val;
//                selected++;
//            }
//        }
//        System.out.println(sum);
//    }
//    static int find(int n){
//        if(parent[n] == n){
//            return n;
//        }
//        return parent[n] = find(parent[n]);
//    }
//
//    static void union(int a, int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b){
//            parent[b] = a;
//        }
//    }
//}
//
//class Edge implements Comparable<Edge>{
//
//    int orig;
//    int dest;
//    int val;
//    Edge(int orig, int dest, int val){
//        this.orig = orig;
//        this.dest = dest;
//        this.val = val;
//    }
//
//    @Override
//    public int compareTo(Edge o) {
//        return this.val-o.val;
//    }
//}
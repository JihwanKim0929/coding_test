//import java.util.*;
//import java.io.*;
//class p52{
//
//    static int[] arr;
//    static int[] honestPeople;
//    static int[] partyFirstPerson;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        int p = Integer.parseInt(st.nextToken());
//
//        arr = new int[n+1];
//        for(int i=1;i<=n;i++)
//            arr[i] = i;
//        partyFirstPerson = new int[p];
//
//        st = new StringTokenizer(br.readLine());
//        int honestPeopleNum = Integer.parseInt(st.nextToken());
//        honestPeople = new int[honestPeopleNum];
//        for(int i=0;i<honestPeopleNum;i++){
//            honestPeople[i] = Integer.parseInt(st.nextToken());
//        }
//
//
//        //각 파티에 있는 사람들 모두 파티 첫번째 멤버 집합으로 병합
//        for(int i=0;i<p;i++) {
//            st = new StringTokenizer(br.readLine());
//            int howManyPeople = Integer.parseInt(st.nextToken());
//            partyFirstPerson[i] = Integer.parseInt(st.nextToken());
//            for(int j=0;j<howManyPeople-1;j++){
//                int tmp = Integer.parseInt(st.nextToken());
//                union(partyFirstPerson[i],tmp);
//            }
//        }
//
//        int answer = 0;
//        //진실 아는 사람들과 모든 파티 첫번째 멤버 집합 비교
//        for(int i=0;i<p;i++){
//            boolean flag = false;
//            for(int j=0;j<honestPeopleNum;j++){
//                if(find(partyFirstPerson[i])==find(honestPeople[j])) {
//                    flag = true;
//                    break;
//                }
//            }
//            if(!flag)
//                answer++;
//        }
//        System.out.println(answer);
//    }
//
//    static int find(int n){
//        if(arr[n] == n)
//            return n;
//        return arr[n] = find(arr[n]);
//    }
//
//    static void union(int a, int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b)
//            arr[b] = a;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p53{
//    public static void main(String[] args)throws IOException{
//        //그래프 받기 & 들어오는 엣지 수 배열 초기화
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        ArrayList<Integer>[] graph = new ArrayList[n+1];
//        int[] inDegree = new int[n+1];
//        for(int i=0;i<n+1;i++){
//            graph[i] = new ArrayList<>();
//        }
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            graph[orig].add(dest);
//            inDegree[dest]++;
//        }
//        //들어오는 엣지 수 0인 노드들 큐에 추가
//        Queue<Integer> queue = new LinkedList<>();
//        for(int i=1;i<inDegree.length;i++)
//            if(inDegree[i]==0)
//                queue.offer(i);
//        //큐에서 하나씩 뽑으면서 결과에 추가, 뽑은 노드가 가리키는 노드들 들어오는 엣지 수 -1->0이 되면 큐에 추가
//        while(!queue.isEmpty()){
//            int polled = queue.poll();
//            System.out.print(polled+" ");
//            for(int i:graph[polled]){
//                inDegree[i]--;
//                if(inDegree[i]==0)
//                    queue.offer(i);
//            }
//        }
//    }
//}


//import java.util.*;
//import java.io.*;
//class p54{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer>[] graph = new ArrayList[n+1];
//        int[] inDegree = new int[n+1];
//        int[] generatedTime = new int[n+1];
//        int[] totalTime = new int[n+1];
//        for(int i=1;i<=n;i++)
//            graph[i] = new ArrayList<>();
//
//        for(int i=1;i<=n;i++){
//            st = new StringTokenizer(br.readLine());
//            int time = Integer.parseInt(st.nextToken());
//            generatedTime[i] = time;
//            while(true){
//                int orig = Integer.parseInt(st.nextToken());
//                if(orig==-1)
//                    break;
//                graph[orig].add(i);
//                inDegree[i]++;
//            }
//        }
//
//        Queue<Integer> queue = new LinkedList<>();
//        for(int i=1;i<=n;i++)
//            if(inDegree[i]==0) {
//                queue.offer(i);
//            }
//
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            for(int i:graph[now]){
//                inDegree[i]--;
//                totalTime[i]=Math.max(totalTime[i],generatedTime[now]+totalTime[now]);
//                if(inDegree[i]==0)
//                    queue.offer(i);
//            }
//        }
//
//        for(int i=1;i<=n;i++)
//            System.out.println(totalTime[i]+generatedTime[i]);
//
//    }
//}


//보류
//import java.util.*;
//import java.io.*;
//
//class p55{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        int e = Integer.parseInt(br.readLine());
//
//        int[] totalTime = new int[n+1];
//        int[] inDegree = new int[n+1];
//        ArrayList<Edge>[] graph = new ArrayList[n+1];
//        ArrayList<Edge>[] reverseGraph = new ArrayList[n+1];
//        for(int i=1;i<=n;i++)
//            graph[i] = new ArrayList<>();
//
//        for(int i=1;i<=n;i++)
//            reverseGraph[i] = new ArrayList<>();
//
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int val = Integer.parseInt(st.nextToken());
//            graph[a].add(new Edge(b,val));
//            reverseGraph[b].add(new Edge(a,val));
//            inDegree[b]++;
//        }
//
//        st = new StringTokenizer(br.readLine());
//        int startNode = Integer.parseInt(st.nextToken());
//        int endNode = Integer.parseInt(st.nextToken());
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(startNode);
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            for(Edge edge:graph[now]){
//                totalTime[edge.dest] = Math.max(totalTime[edge.dest],totalTime[now]+edge.val);
//                inDegree[edge.dest]--;
//                if(inDegree[edge.dest]==0)
//                    queue.offer(edge.dest);
//            }
//        }
//
//        int count = 0;
//
//        queue.offer(endNode);
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            for(Edge edge:reverseGraph[now]){
//                if(totalTime[edge.dest] == totalTime[now]-edge.val){
//                    count++;
//                    queue.offer(edge.dest);
//                }
//            }
//        }
//
//        System.out.println(totalTime[endNode]);
//        System.out.println(count);
//    }
//}
//
//class Edge {
//    int dest;
//    int val;
//    Edge(int dest, int val){
//        this.dest = dest;
//        this.val = val;
//    }
//}
//import java.util.*;
//import java.io.*;
//
//class p46{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());   //node num
//        int m = Integer.parseInt(st.nextToken());   //edge num
//        int k = Integer.parseInt(st.nextToken());   //distance
//        int x = Integer.parseInt(st.nextToken());   //start
//        ArrayList<Integer>[] A = new ArrayList[n+1];
//        ArrayList<Integer> answer = new ArrayList<>();
//        for(int i=1;i<=n;i++){
//            A[i] = new ArrayList<>();
//        }
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int s = Integer.parseInt(st.nextToken());
//            int e = Integer.parseInt(st.nextToken());
//            A[s].add(e);
//        }
//        int[] visited = new int[n+1];
//        for(int i=1;i<=n;i++){
//            visited[i]=-1;
//        }
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(x);
//        visited[x]=0;
//        while(!queue.isEmpty()){
//            int now = queue.poll();
//            for(int i:A[now]){
//                if(visited[i]==-1){
//                    visited[i]=visited[now]+1;
//                    queue.add(i);
//                }
//            }
//        }
//        for(int i=1;i<=n;i++){
//            if(visited[i]==k)
//                answer.add(i);
//        }
//        Collections.sort(answer);
//        if(answer.isEmpty())
//            System.out.println(-1);
//        else{
//            for(int i:answer)
//                System.out.println(i);
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//class p47{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        ArrayList<Integer>[] A = new ArrayList[n+1];
//        for(int i=1;i<=n;i++){
//            A[i] = new ArrayList<>();
//        }
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int s = Integer.parseInt(st.nextToken());
//            int e = Integer.parseInt(st.nextToken());
//            A[s].add(e);
//        }
//        int[] reliability = new int[n+1];
//
//        for(int i=1;i<=n;i++){
//            boolean[] visited = new boolean[n+1];
//            Queue<Integer> queue = new LinkedList<>();
//            visited[i]=true;
//            queue.add(i);
//            while(!queue.isEmpty()){
//                int now = queue.poll();
//                for(int j:A[now]){
//                    if(!visited[j]){
//                        visited[j]=true;
//                        reliability[j]++;
//                        queue.add(j);
//                    }
//                }
//            }
//        }
//
//        int max = reliability[1];
//        for(int i=2;i<=n;i++)
//            if(reliability[i]>max)
//                max=reliability[i];
//
//        ArrayList<Integer> answer = new ArrayList<>();
//        for(int i=1;i<=n;i++)
//            if(reliability[i]==max)
//                answer.add(i);
//
//        Collections.sort(answer);
//
//        for(int i:answer)
//            System.out.print(i+" ");
//
//    }
//}
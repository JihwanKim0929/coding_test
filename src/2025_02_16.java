//import java.util.*;
//import java.io.*;
//
//class p51{
//    static int[] A;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        A = new int[n+1];
//        for(int i = 1;i<=n;i++){
//            A[i] = i;
//        }
//        int m = Integer.parseInt(br.readLine());
//        for(int i=1;i<=n;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for(int j=1;j<=n;j++){
//                int tmp = Integer.parseInt(st.nextToken());
//                if(tmp==1)
//                    union(i,j);
//            }
//        }
//        boolean answer = true;
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int firstCity = Integer.parseInt(st.nextToken());
//        int rootOfFirstCity = find(A[firstCity]);
//        for(int i=1;i<m;i++){
//            int tmp = Integer.parseInt(st.nextToken());
//            if(rootOfFirstCity != find(tmp)){
//                answer = false;
//                break;
//            }
//        }
//        if(answer)
//            System.out.println("YES");
//        else
//            System.out.println("NO");
//
//
//    }
//    static int find(int a){
//        if(A[a]==a)
//            return a;
//        A[a]=find(A[a]);
//        return A[a];
//    }
//
//    static void union(int a, int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b)
//            A[b] = a;
//    }
//}


//import java.util.*;
//import java.io.*;
//class p52{
//    static int[] A;
//    static int[] party_first;
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        A = new int[n+1];
//        for(int i=1;i<n+1;i++)
//            A[i] = i;
//        int m = Integer.parseInt(st.nextToken());
//        party_first = new int[m];
//        st = new StringTokenizer(br.readLine());
//        int t = Integer.parseInt(st.nextToken());
//        int firstTruthMan = -1;
//        if(t!=0) {
//            firstTruthMan = Integer.parseInt(st.nextToken());
//            for(int i=1;i<t;i++)
//                union(firstTruthMan,Integer.parseInt(st.nextToken()));
//        }
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int partyNum = Integer.parseInt(st.nextToken());
//            int firstPartyMan = Integer.parseInt(st.nextToken());
//            party_first[i] = firstPartyMan;
//            for(int j=1;j<partyNum;j++){
//                union(firstPartyMan,Integer.parseInt(st.nextToken()));
//            }
//        }
//        int result = 0;
//        if(t==0)
//            result+=m;
//        else{
//            for (int i = 0; i < m; i++) {
//                if (!checkSame(firstTruthMan,party_first[i]))
//                    result++;
//            }
//        }
//        System.out.println(result);
//    }
//    static void union(int a, int b){
//        a = find(a);
//        b = find(b);
//        if(a!=b)
//            A[b] = a;
//    }
//    static int find(int a){
//        if(A[a]==a)
//            return a;
//        A[a] = find(A[a]);
//        return A[a];
//    }
//    static boolean checkSame(int a, int b){
//        a = find(a);
//        b = find(b);
//        return a==b;
//    }
//
//}


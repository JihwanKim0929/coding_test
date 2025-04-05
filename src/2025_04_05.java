//import java.util.*;
//import java.io.*;
//
//class p71{
//    static int[] tree;
//    static int leafSize;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        //리프 노드 사이즈 정하기
//        leafSize = 1;
//        while(leafSize<=n){
//            leafSize*=2;
//        }
//
//        //리프노드 *2 만큼 배열 생성
//        int treeSize = leafSize*2;
//        tree = new int[treeSize];
//        Arrays.fill(tree,Integer.MAX_VALUE);
//
//
//        //데이터 입력받아 리프부터 채우기
//        for(int i=getIdx(1);i<=getIdx(n);i++){
//            int tmp = Integer.parseInt(br.readLine());
//            tree[i] = tmp;
//        }
//        setTree();
//
//        for(int i=0;i<m;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            System.out.println(cal(a,b));
//        }
//
//    }
//
//    static int getIdx(int n){
//        return leafSize+n-1;
//    }
//
//    static void setTree(){
//        int idx = leafSize-1;
//        while(idx>=1){
//            tree[idx] = Math.min(tree[idx*2],tree[idx*2+1]);
//            idx--;
//        }
//    }
//
//    static int cal(int a, int b){
//        int l = getIdx(a);
//        int r = getIdx(b);
//        int min = Integer.MAX_VALUE;
//
//        while(l<=r){
//            if(l%2==1)
//                min = Math.min(min,tree[l]);
//            if(r%2==0)
//                min = Math.min(min,tree[r]);
//            l = (l+1)/2;
//            r = (r-1)/2;
//        }
//
//        return min;
//    }
//}

//import java.util.*;
//import java.io.*;
//class p73{
//    static long[] tree;
//    static int leafSize;
//    static final long divisor = 1000000007;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int s = Integer.parseInt(st.nextToken());
//        setLeafSize(n);
//        tree = new long[leafSize*2];
//        Arrays.fill(tree,1);
//        for(int i=getIdx(1);i<=getIdx(n);i++)
//            tree[i] = Long.parseLong(br.readLine());
//        setTree();
//        for(int i=0;i<c+s;i++){
//            st = new StringTokenizer(br.readLine());
//            int menu = Integer.parseInt(st.nextToken());
//            long a = Long.parseLong(st.nextToken());
//            long b = Long.parseLong(st.nextToken());
//            if(menu==1)
//                changeVal((int)a,b);
//            else
//                System.out.println(cal((int)a,(int)b));
//        }
//
//
//    }
//    static int getIdx(int n){
//        return leafSize+n-1;
//    }
//    static void setLeafSize(int n){
//        int tmp = 1;
//        while(tmp<n){
//            tmp*=2;
//        }
//        leafSize = tmp;
//    }
//    static void setTree(){
//        int idx = leafSize-1;
//        while(idx>=1){
//            tree[idx] = tree[idx*2]*tree[idx*2+1]%divisor;
//            idx--;
//        }
//    }
//    static long cal(int a, int b){
//        long ans = 1;
//        int l = getIdx(a);
//        int r = getIdx(b);
//        while(l<=r){
//            if(l%2==1)
//                ans=ans*tree[l]%divisor;
//            if(r%2==0)
//                ans=ans*tree[r]%divisor;
//            l = (l+1)/2;
//            r = (r-1)/2;
//        }
//        return ans;
//    }
//
//    static void changeVal(int n, long val){
//        int idx = getIdx(n);
//        tree[idx] = val;
//        while(idx>1){
//            idx/=2;
//            tree[idx] = tree[idx*2]*tree[idx*2+1]%divisor;
//        }
//    }
//}
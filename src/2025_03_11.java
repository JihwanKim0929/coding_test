//import java.util.*;
//import java.io.*;
//class p95{
//    static final int INF = 1000000*16+1;
//    static int n;
//    static int[][] W; //노드간 거리
//    static int[][] D; //i에 있을 때 j(비트마스킹)는 이미 방문했을 때 남은 최소 거리
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        n = Integer.parseInt(br.readLine());
//        D = new int[n][1<<n];
//        W = new int[n][n];
//        for(int i=0;i<n;i++){
//            st = new StringTokenizer(br.readLine());
//            for(int j =0;j<n;j++){
//                int val = Integer.parseInt(st.nextToken());
//                W[i][j] = val;
//            }
//        }
//        System.out.println(tsp(0,1));
//    }
//
//    //현재 a에 있고 b를 이진수로 풀었을때 노드들은 다 방문함
//    public static int tsp(int a, int b){
//        if(b==(1<<n)-1){
//            return W[a][0]==0? INF:W[a][0];
//        }
//        if(D[a][b]!=0){
//            return D[a][b];
//        }
//        int min_val = INF;
//        for(int i=0;i<n;i++){
//            if((b&(1<<i))==0 && W[a][i]!=0){
//                min_val = Math.min(min_val,tsp(i,(b|(1<<i)))+W[a][i]);
//            }
//        }
//        D[a][b] = min_val;
//        return D[a][b];
//    }
//}

//import java.util.*;
//import java.io.*;
//class p96{
//    static int[] A,D,B;
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        A = new int[n+1];
//        D = new int[n+1];
//        B = new int[n+1];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=1;i<=n;i++){
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        //A를 하나씩 읽으면서 B의 마지막 보다 크면 B의 마지막에 추가 , 아니면 이진탐색해서
//        //위치 찾아서 (B에서 A[i]보다 크면서 제일 작은 값) 대체 하기
//        //해당 인덱스 D에 추가
//        int maxLength=0;
//        B[++maxLength] = A[1];
//        D[1] = 1;
//        for(int i=2;i<=n;i++){
//             if(A[i]>B[maxLength]){
//                 B[++maxLength] = A[i];
//                 D[i] = maxLength;
//             }
//             else{
//                 int idx = binarySearch(A[i],maxLength);
//                 B[idx] = A[i];
//                 D[i] = idx;
//             }
//        }
//        System.out.println(maxLength);
//        int[] answer = new int[maxLength+1];
//        for(int i=n;i>0;i--){
//            if(D[i]==maxLength) {
//                answer[maxLength] = A[i];
//                maxLength--;
//            }
//        }
//        for(int i=1;i<answer.length;i++){
//            System.out.print(answer[i]+" ");
//        }
//    }
//    static int binarySearch(int a, int maxLength){
//        int left = 1;
//        int right = maxLength;
//        int mid;
//        while(left<right){
//            mid = (left+right)/2;
//            if(a>B[mid])
//                left=mid+1;
//            else
//                right=mid;
//        }
//        return left;
//    }
//}
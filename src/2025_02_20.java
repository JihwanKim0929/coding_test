//import java.io.*;
//import java.util.*;
//
//class p61{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int v = Integer.parseInt(br.readLine());
//        int e = Integer.parseInt(br.readLine());
//        int[][] distance = new int[v+1][v+1];
//        for(int i=1;i<=v;i++){
//            for(int j=1;j<=v;j++){
//                if(i==j)
//                    distance[i][j]=0;
//                else
//                    distance[i][j]=10000001;
//            }
//        }
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            int val = Integer.parseInt(st.nextToken());
//            if(distance[orig][dest] > val) distance[orig][dest]= val;
//        }
//
//        for(int k=1;k<=v;k++){
//            for(int i=1;i<=v;i++){
//                for(int j=1;j<=v;j++){
//                    if(distance[i][j]>distance[i][k]+distance[k][j])
//                        distance[i][j]=distance[i][k]+distance[k][j];
//                }
//            }
//        }
//
//        for(int i=1;i<=v;i++){
//            for(int j=1;j<=v;j++){
//                if(distance[i][j]==10000001)
//                    System.out.print("0 ");
//                else
//                    System.out.print(distance[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//import java.util.*;
//import java.io.*;
//class p62{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int v = Integer.parseInt(br.readLine());
//        int[][] A = new int[v][v];
//        for(int i=0;i<v;i++){
//            st = new StringTokenizer(br.readLine());
//            for(int j=0;j<v;j++){
//                A[i][j]=Integer.parseInt(st.nextToken());
//            }
//        }
//
//        for(int k=0;k<v;k++){
//            for(int i=0;i<v;i++){
//                for(int j=0;j<v;j++){
//                    if(A[i][k]==1&&A[k][j]==1)
//                        A[i][j]=1;
//                }
//            }
//        }
//
//        for(int i=0;i<v;i++){
//            for(int j=0;j<v;j++){
//                System.out.print(A[i][j]+" ");
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
//        int v = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//        int[][] A = new int[v+1][v+1];
//        for(int i=1;i<=v;i++){
//            for(int j=1;j<=v;j++){
//                A[i][j] = (i==j)?0:10000001;
//            }
//        }
//        for(int i=0;i<e;i++){
//            st = new StringTokenizer(br.readLine());
//            int orig = Integer.parseInt(st.nextToken());
//            int dest = Integer.parseInt(st.nextToken());
//            A[orig][dest]=1;
//            A[dest][orig]=1;
//        }
//
//        for(int k=1;k<=v;k++){
//            for(int i=1;i<=v;i++){
//                for(int j=1;j<=v;j++){
//                    if(A[i][j]>A[i][k]+A[k][j])
//                        A[i][j]=A[i][k]+A[k][j];
//                }
//            }
//        }
//
//        int idx = -1;
//        int baconSum = Integer.MAX_VALUE;
//        for(int i=1;i<=v;i++){
//            int tmp = 0;
//            for(int j:A[i])
//                tmp+=j;
//            if(baconSum>tmp){
//                idx=i;
//                baconSum=tmp;
//            }
//        }
//        System.out.println(idx);
//    }
//}


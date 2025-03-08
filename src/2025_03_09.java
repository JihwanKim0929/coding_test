//import java.util.*;
//import java.io.*;
//class p91{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] arr = new int[n+1][m+1];
//        for(int i=1;i<=n;i++){
//            String s = br.readLine();
//            for(int j=1;j<=m;j++){
//                arr[i][j] = s.charAt(j-1)-'0';
//            }
//        }
//        int answer = 0;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(arr[i][j]!=0){
//                    arr[i][j] = Math.min(arr[i][j-1],Math.min(arr[i-1][j-1],arr[i-1][j]))+1;
//                    if(arr[i][j]>answer)
//                        answer = arr[i][j];
//                }
//            }
//        }
//
//        System.out.println(answer*answer);
//    }
//}
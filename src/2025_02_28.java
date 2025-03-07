//import java.util.*;
//import java.io.*;
//class p81{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        long[] p = new long[n];
//        long tmp = 1;
//        for(int i=n-1;i>=0;i--){
//            p[i] = tmp;
//            tmp *= n-i+1;
//        }
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int menu = Integer.parseInt(st.nextToken());
//        if(menu==1){
//            long k = Long.parseLong(st.nextToken());
//            ArrayList<Integer> list = new ArrayList<>();
//            for(int i=1;i<=n;i++)
//                list.add(i);
//            int[] answer = new int[n];
//            //k번째 순열 출력
//            for(int i=0;i<n;i++){
//                //k에서 다음 자릿수 몇번 뺄수있나 체크
//                if(i==n-1) {
//                    answer[i] = list.get(0);
//                    break;
//                }
//                int lap = 1;
//                while(k>lap*p[i+1]){
//                    lap++;
//                }
//                //answer에 답 추가 및 k 업데이트
//                answer[i] = list.get(lap-1);
//                list.remove(lap-1);
//                k = k - p[i+1]*(lap-1);
//            }
//            for(int i:answer)
//                System.out.print(i+" ");
//        }
//        else{
//            int[] smaller_num = new int[n+1];
//            for(int i=1;i<=n;i++){
//                smaller_num[i] = i-1;
//            }
//            long k = 1;
//            for(int i=0;i<n-1;i++){
//                int now = Integer.parseInt(st.nextToken());
//                k+=smaller_num[now]*p[i+1];
//                for(int j=now+1;j<=n;j++){
//                    smaller_num[j]--;
//                }
//            }
//            System.out.println(k);
//        }
//
//    }
//}
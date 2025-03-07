//2,2개일때 첫번째 자리를 a를 선택했다고 하자
//그러면 자리 3개에 a 1개, z 2개를 배치할 방법을 생각해야한다
//그런데 z입장에서 생각해보면 1,2,3 3개의 자리중에 2개를 뽑는것이다
//즉 3C2 인것이다
//import java.util.*;
//import java.io.*;
//class p82{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        long[][] D = new long[n+m+1][n+m+1];
//        for(int i=0;i<=n+m;i++){
//            D[i][i] = 1;
//            D[i][0] = 1;
//            D[i][1] = i;
//        }
//        for(int i=3;i<=n+m;i++){
//            for(int j=2;j<i;j++){
//                D[i][j] = D[i-1][j]+D[i-1][j-1];
//                if(D[i][j]>1000000000)
//                    D[i][j] = 1000000001;
//            }
//        }
//        if(D[m+n][m]<k){
//            System.out.println(-1);
//        }
//        else {
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//            while(!(m==0&&n==0)) {
//                if (k > D[n - 1 + m][m]) {
//                    bw.write('z');
//                    k -= D[n - 1 + m][m];
//                    m--;
//                } else {
//                    bw.write('a');
//                    n--;
//                }
//            }
//            bw.flush();
//            bw.close();
//        }
//    }
//}

//완전순열
//숫자쌍이 두개 있을때 서로 자신과 같은 수를 뽑지 않는 경우
//D는 n개의 숫자가 있을때 자기 자신을 뽑지 않을 경우
//만약 첫번째 사람이 두번째 사람을 선택했다고 해보자
//이 경우 두가지로 나뉘는데 먼저 두번째 사람이 첫번째 사람을 선택한 경우이다
//이럴 경우 나머지 숫자들 n-2개들은 서로 자기 자신을 뽑지 말아야하는 경우이다.D[n-2]
//또 한가지 경우는 두번째 사람이 첫번째 사람을 뽑지 않는것이다. 이 경우 첫번째 사람을 두번째 사람으로 가정하면 n-1개들이 자기 자신을 뽑지 않는 경우이다.D[n-1]
//첫번쨰 사람이 사람을 고를 수 있는 경우는 n-1개이므로 D[n] = (n-1)*(D[n-2]+D[n-1])로 점화식을 세울 수 있다.
//import java.util.*;
//import java.io.*;
//class p82{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[] D = new long[10000001];
//        D[1] = 0;
//        D[2] = 1;
//        for(int i=3;i<=n;i++){
//            D[i] = (i-1)*(D[i-2]+D[i-1])%1000000000;
//        }
//        System.out.println(D[n]);
//    }
//}
//import java.util.*;
//import java.io.*;
//class p88{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [][] arr = new int[n+1][10];
//        for(int i=1;i<=9;i++)
//            arr[1][i]=1;
//        for(int i=2;i<=n;i++){
//            for(int j=0;j<=9;j++){
//                if(j==0)
//                    arr[i][j]=arr[i-1][j+1];
//                else if(j==9){
//                    arr[i][j] = arr[i-1][j-1];
//                }
//                else{
//                    arr[i][j] = (arr[i-1][j-1]+arr[i-1][j+1])%1000000000;
//                }
//            }
//        }
//        int result = 0;
//        for(int i=0;i<=9;i++)
//            result=(result+arr[n][i])%1000000000;
//        System.out.println(result);
//    }
//}
//import java.util.*;
//import java.io.*;
//class p89{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++)
//            arr[i] = Integer.parseInt(st.nextToken());
//        int[] L = new int[n];
//        int[] R = new int[n];
//        L[0] = arr[0];
//        int max = L[0];
//        for(int i=1;i<n;i++){
//            L[i] = Math.max(arr[i],L[i-1]+arr[i]);
//            max = Math.max(max,L[i]);
//        }
//        R[n-1] = arr[n-1];
//        for(int i=n-2;i>=0;i--){
//            R[i] = Math.max(arr[i],R[i+1]+arr[i]);
//        }
//
//        for(int i=1;i<n-1;i++){
//            max = Math.max(max,L[i-1]+R[i+1]);
//        }
//        System.out.println(max);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p90{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        String s2 = sc.next();
//        int n = s1.length();
//        int m = s2.length();
//        int[][] D = new int[n+1][m+1];
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(s1.charAt(i-1)==s2.charAt(j-1))
//                    D[i][j] = D[i-1][j-1]+1;
//                else
//                    D[i][j] = Math.max(D[i-1][j],D[i][j-1]);
//            }
//        }
//        int i = n;
//        int j = m;
//        System.out.println(D[i][j]);
//        char[] result = new char[D[i][j]];
//        int tmp = D[i][j]-1;
//        while(i>0&&j>0){
//            if(s1.charAt(i-1)==s2.charAt(j-1)){
//                result[tmp--]=(s1.charAt(i-1));
//                i--;
//                j--;
//            }
//            else{
//                if(D[i-1][j]>D[i][j-1])
//                    i--;
//                else
//                    j--;
//            }
//        }
//        for(i=0;i<D[n][m];i++){
//            System.out.print(result[i]);
//        }
//    }
//}
//import java.util.*;
//import java.io.*;
//
//class p88{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[][] D = new long[n+1][10];
//        for(int i=1;i<=9;i++)
//            D[1][i]=1;
//
//        for(int i=2;i<=n;i++){
//            for(int j=0;j<=9;j++){
//                switch(j){
//                    case 0: D[i][0] = D[i-1][1]; break;
//                    case 9: D[i][9] = D[i-1][8]; break;
//                    default: D[i][j] = (D[i-1][j-1]+D[i-1][j+1])%1000000000;
//                }
//            }
//        }
//
//        long ans = 0;
//        for(int i=0;i<=9;i++)
//            ans = (ans+D[n][i])%1000000000;
//        System.out.println(ans);
//
//
//    }
//}

//import java.util.*;
//import java.io.*;
//class p89{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0;i<n;i++)
//            arr[i] = Integer.parseInt(st.nextToken());
//
//        int[] fromLeft = new int[n];
//        int[] fromRight = new int[n];
//
//        fromLeft[0] = arr[0];
//        int max = fromLeft[0];
//        for(int i=1;i<n;i++){
//            fromLeft[i] = Math.max(arr[i],fromLeft[i-1]+arr[i]);
//            max = Math.max(fromLeft[i],max);
//        }
//
//        fromRight[n-1] = arr[n-1];
//        for(int i=n-2;i>=0;i--){
//            fromRight[i] = Math.max(arr[i],fromRight[i+1]+arr[i]);
//        }
//
//        for(int i=1;i<n-1;i++){
//            if(max< fromLeft[i-1]+fromRight[i+1]){
//                max = fromLeft[i-1]+fromRight[i+1];
//            }
//        }
//
//        System.out.println(max);
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p90{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        String s1 =sc.next();
//        String s2 = sc.next();
//
//        int[][] D = new int[s1.length()+1][s2.length()+1];
//
//        for(int i=1;i<=s1.length();i++){
//            for(int j=1;j<=s2.length();j++){
//                if(s1.charAt(i-1)==s2.charAt(j-1))
//                    D[i][j] = D[i-1][j-1]+1;
//                else
//                    D[i][j] = Math.max(D[i-1][j],D[i][j-1]);
//            }
//        }
//
//        System.out.println(D[s1.length()][s2.length()]);
//
//        ArrayList<Character> ans = new ArrayList<>();
//        int r = s1.length();
//        int c = s2.length();
//
//        while(r>0 && c>0){
//            if(s1.charAt(r-1)==s2.charAt(c-1)){
//                ans.add(s1.charAt(r-1));
//                r--; c--;
//            }
//            else{
//                if(D[r-1][c]>D[r][c-1])
//                    r--;
//                else
//                    c--;
//            }
//        }
//
//        for(int i=ans.size()-1;i>=0;i--)
//            System.out.print(ans.get(i));
//    }
//}

//import java.util.*;
//import java.io.*;
//class p91{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st=  new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        long max = 0;
//
//        long[][] D = new long[n][m];
//        for(int i=0;i<n;i++){
//            String s = br.readLine();
//            for(int j=0;j<m;j++){
//                D[i][j] = s.charAt(j)-'0';
//                if(D[i][j]==1&&i>0&&j>0){
//                    D[i][j] = Math.min(D[i-1][j],Math.min(D[i-1][j-1],D[i][j-1]))+1;
//                }
//                if(max<D[i][j])
//                    max = D[i][j];
//            }
//        }
//
//        System.out.println(max*max);
//    }
//}
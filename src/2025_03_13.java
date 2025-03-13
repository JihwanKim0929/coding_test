//import java.io.*;
//import java.util.*;
//class p6{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int answer = 1;
//        int l = 1;
//        int r = 1;
//        int sum = 1;
//        while(r<n){
//            if(sum==n){
//                answer++;
//                r++;
//                sum+=r;
//            }
//            else if(sum<n){
//                r++;
//                sum+=r;
//            }
//            else{
//                sum-=l;
//                l++;
//            }
//        }
//        System.out.println(answer);
//
//    }
//}

//import java.util.*;
//import java.io.*;
//class p7{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int m = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0;i<n;i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//
//        int l = 0;
//        int r = n-1;
//        int answer = 0;
//        while(l<r){
//            int sum = arr[l]+arr[r];
//            if(sum==m){
//                answer++;
//                l++;
//                r--;
//            }else if(sum<m){
//                l++;
//            }else{
//                r--;
//            }
//        }
//        System.out.println(answer);
//    }
//}

//import java.util.*;
//import java.io.*;
//
//class p8{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        int n =Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        st = new StringTokenizer(br.readLine());
//        for(int i=0;i<n;i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        int answer = 0;
//        for(int k=0;k<n;k++){
//            int l = 0;
//            int r = n-1;
//            while(l<r){
//                int sum = arr[l]+arr[r];
//                if(sum==arr[k]){
//                    if(l!=k && r!=k){
//                    answer++;
//                    break;
//                    }else if(l==k){
//                        l++;
//                    }else {
//                        r--;
//                    }
//                }else if(sum>arr[k]){
//                    r--;
//                }else
//                    l++;
//            }
//        }
//        System.out.println(answer);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p9{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        String s = br.readLine();
//        int[] counter = new int[4]; //A,C,G,T
//        int[] standard = new int[4];
//        st = new StringTokenizer(br.readLine());
//        for(int i=0;i<4;i++){
//            standard[i] = Integer.parseInt(st.nextToken());
//        }
//        int answer = 0;
//        //우선 0부터 m길이 만큼의 부분 문자열에서 각각 글자 몇개 있나 확인 후
//        //counter에 저장, 기준 만족시 answer++
//        for(int i=0;i<m;i++){
//            char c = s.charAt(i);
//            switch(c){
//                case 'A': counter[0]++;
//                    break;
//                case 'C': counter[1]++;
//                    break;
//                case 'G': counter[2]++;
//                    break;
//                default : counter[3]++;
//            }
//        }
//        boolean flag1 = true;
//        for(int i=0;i<4;i++){
//            if (counter[i] < standard[i]){
//                flag1 = false;
//                break;
//            }
//        }
//        if(flag1)
//            answer++;
//        //한칸씩 밀며 빠지는 문자 counter에서 뺴주고 들어오는거는 ++ 만족시 answer++
//        for(int i=1;i<=n-m;i++){
//            char c1 = s.charAt(i-1);  //빠지는 문자
//            switch(c1){
//                case 'A': counter[0]--;
//                    break;
//                case 'C': counter[1]--;
//                    break;
//                case 'G': counter[2]--;
//                    break;
//                default : counter[3]--;
//            }
//            char c2 = s.charAt(i+m-1);
//            switch(c2){
//                case 'A': counter[0]++;
//                    break;
//                case 'C': counter[1]++;
//                    break;
//                case 'G': counter[2]++;
//                    break;
//                default : counter[3]++;
//            }
//            boolean flag2 = true;
//            for(int j=0;j<4;j++){
//                if (counter[j] < standard[j]){
//                    flag2 = false;
//                    break;
//                }
//            }
//            if(flag2)
//                answer++;
//        }
//        System.out.println(answer);
//    }
//}


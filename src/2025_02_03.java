//import java.util.*;
//import java.io.*;
//class p38{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        long s = sc.nextLong();
//        long e = sc.nextLong();
//
//        boolean[] isNotPrime = new boolean[10000001];
//        isNotPrime[1] = true;
//        for(int i=2;i<Math.sqrt(isNotPrime.length);i++){
//            if(!isNotPrime[i]){
//                for(int j=2*i;j<isNotPrime.length;j+=i){
//                    isNotPrime[j]=true;
//                }
//            }
//        }
//        int count = 0;
//        for(int i=2;i<10000001;i++){
//            if(!isNotPrime[i]){
//                long tmp = i;
//                while((double)i<=(double)e/(double)tmp){
//                    if((double)i>=(double)s/(double)tmp)
//                        count++;
//                    tmp*=i;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}

//import java.util.*;
//import java.io.*;
//class p39{
//    public static void main(String[] args)throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean[] isNotPrime = new boolean[10000001];
//        isNotPrime[1]=true;
//        for(int i=2;i<=Math.sqrt(10000000);i++){
//            if(!isNotPrime[i]){
//                for(int j=2*i;j<isNotPrime.length;j+=i){
//                    isNotPrime[j]=true;
//                }
//            }
//        }
//        for(int i=n;i<10000001;i++){
//            if(!isNotPrime[i]){
//                char[] arr = Integer.toString(i).toCharArray();
//                int s = 0;
//                int e = arr.length-1;
//                boolean flag = false;
//                while(s < e) {
//                    if (arr[s] != arr[e]) {
//                        flag = true;
//                        break;
//                    }
//                    s++;
//                    e--;
//                }
//                if(!flag) {
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }
//    }
//}


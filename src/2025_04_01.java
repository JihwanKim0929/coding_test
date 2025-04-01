//import java.util.*;
//import java.io.*;
//
//class Wifi{
//    public static void main(String[] args)throws IOException{
//        int[][] grid =
//                {{0,0,0},
//                        {0,1,0},
//                        {0,0,0}
//        };
//        int n = grid.length;
//        int m = grid[0].length;
//        int k = 2;
//        int [] wifi = {0,0,5};
//        int[] dx = {0,0,1,-1};
//        int[] dy = {1,-1,0,0};
//
//        //신호 배열 -> 와이파이 위치만 5로 초기화
//        //우선순위 큐(거꾸로)에 시작 위치 삽입
//        //{
//        //  큐에서 꺼냄
//        //  만약 이전에 꺼낸적 있으면 넘어감(왜냐하면 이미 이전에 꺼낸 시점에 최댓값임)
//        //  꺼낸 노드에서 갈수있는 노드들 모두 체크(nx,ny)
//        //  {
//        //      nx,ny가 각각 0이랑 n, 0이랑 m사이인지 체크
//        //          원래 값보다 꺼낸 노드-1(벽이면 추가로 -k)한게 더 크면 업데이트
//        //          이후 큐에 삽입
//        //  }
//        //}
//        int[][] signal = new int[n][m];
//        for(int i=0;i<n;i++){
//            Arrays.fill(signal[i],Integer.MIN_VALUE);
//        }
//        signal[wifi[0]][wifi[1]] = wifi[2];
//        Comparator<int[]> cp = (o1,o2)-> o2[2]-o1[2];
//        PriorityQueue<int[]> pq = new PriorityQueue<>(cp);
//        boolean[][] visited = new boolean[n][m];
//        pq.offer(new int[]{wifi[0],wifi[1],wifi[2]});
//        while(!pq.isEmpty()){
//            int[] now = pq.poll();
//            int now_x = now[0];
//            int now_y = now[1];
//            int now_signal = now[2];
//            if(visited[now_x][now_y])
//                continue;
//            visited[now_x][now_y]=true;
//            for(int i=0;i<4;i++){
//                int next_x = now_x+dx[i];
//                int next_y = now_y+dy[i];
//                if(next_x>=0 && next_x<n && next_y>=0 && next_y<m){
//                    int decrease = -1;
//                    if(grid[next_x][next_y]==1)
//                        decrease-=k;
//                    if(signal[next_x][next_y]<now_signal+decrease){
//                        signal[next_x][next_y] = now_signal+decrease;
//                        pq.offer(new int[]{next_x,next_y,signal[next_x][next_y]});
//                    }
//                }
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                    System.out.print(Math.max(signal[i][j],0)+" ");
//            }
//            System.out.println();
//        }
//    }
//}
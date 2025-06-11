package baekjoon.basic._2178;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int[][] arr = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int i = 0; i < arr.length; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '1')
                    arr[i][j] = -1;
            }
        }

        boolean[][] visited = new boolean[arr.length][arr[0].length];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0,0});

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        visited[0][0] = true;

        arr[0][0] = 1;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length){
                    if(!visited[nx][ny] && arr[nx][ny] == -1){
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                        arr[nx][ny] = arr[cur[0]][cur[1]] + 1;
                    }
                }
            }
        }

        bw.write(String.valueOf(arr[arr.length - 1][arr[0].length - 1]));

        br.close();
        bw.flush();
        bw.close();
    }
}

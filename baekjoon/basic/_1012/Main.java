package baekjoon.basic._1012;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for(int i = 0; i < testCase; i++){
            String[] input = br.readLine().split(" ");

            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            int num = Integer.parseInt(input[2]);

            boolean visited[][] = new boolean[n+1][m+1];
            boolean arr[][] = new boolean[n+1][m+1];

            for(int j = 0; j < num; j++){
                input = br.readLine().split(" ");
                arr[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = true;
            }

            int result = 0;
            for(int j = 0; j < arr.length; j++){
                for (int k = 0; k < arr[0].length; k++) {
                    if(!visited[j][k] && arr[j][k]){
                        bfs(dx, dy, arr, visited, j, k);
                        result++;
                    }
                }
            }

            bw.write(result + "\n");

        }


        br.close();
        bw.flush();
        bw.close();

    }

    public static void bfs(int[] dx, int[] dy, boolean[][] arr, boolean[][] visited, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = cur[0] + dx[k];
                int ny = cur[1] + dy[k];

                if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if (arr[nx][ny] == true && visited[nx][ny] == false) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}

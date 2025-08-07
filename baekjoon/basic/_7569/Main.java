package baekjoon.basic._7569;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int m = Integer.parseInt(input[0]), n = Integer.parseInt(input[1]), h = Integer.parseInt(input[2]);

        int[][][] arr = new int[m][n][h];

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                String[] line = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    arr[k][j][i] = Integer.parseInt(line[k]);
                    if(arr[k][j][i] == 1){
                        queue.offer(new int[]{k,j,i});
                    }
                }
            }
        }

        int[] dx = {1, -1, 0, 0, 0, 0};
        int[] dy = {0, 0, 1, -1, 0, 0};
        int[] dz = {0, 0, 0, 0, 1, -1};

        bfs(queue, dx, dy ,dz, arr);

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0][0].length; k++) {
                    if (arr[i][j][k] == 0) {
                        bw.write("-1");
                        bw.flush();
                        return;
                    }
                    max = Math.max(max, arr[i][j][k]);
                }
            }
        }

        bw.write(String.valueOf(max - 1));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs(Queue<int[]> queue, int[] dx, int[] dy, int[] dz, int[][][] arr){

        while(!queue.isEmpty()){
            int[] cur = queue.poll();

            for (int i = 0; i < 6; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                int nz = cur[2] + dz[i];

                if(nx >= 0 && ny >= 0 && nz >= 0 && nx < arr.length && ny < arr[0].length && nz < arr[0][0].length){
                    if(arr[nx][ny][nz] == 0){
                        queue.offer(new int[]{nx, ny, nz});
                        arr[nx][ny][nz] = arr[cur[0]][cur[1]][cur[2]] + 1;
                    }
                }
            }

        }
    }
}

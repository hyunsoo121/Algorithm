package baekjoon.basic._7576;

import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] size = br.readLine().split(" ");
        int[][] arr = new int[Integer.parseInt(size[1])][Integer.parseInt(size[0])];

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
                if (arr[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        bfs(queue, arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    bw.write("-1");
                    bw.flush();
                    return;
                }
                max = Math.max(max, arr[i][j]);
            }
        }

        bw.write(String.valueOf(max - 1));
        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs(Queue<int[]> queue, int[][] arr) {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if (arr[nx][ny] == 0) {
                        arr[nx][ny] = arr[cur[0]][cur[1]] + 1;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}

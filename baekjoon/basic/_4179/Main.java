package baekjoon.basic._4179;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int R = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);

        char[][] arr = new char[R][C];
        int[][] fireTime = new int[R][C];
        int[][] jihoonTime = new int[R][C];

        Queue<int[]> fireQueue = new LinkedList<>();
        Queue<int[]> jihoonQueue = new LinkedList<>();

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = s.charAt(j);
                fireTime[i][j] = -1;
                jihoonTime[i][j] = -1;

                if (arr[i][j] == 'F') {
                    fireQueue.offer(new int[]{i, j});
                    fireTime[i][j] = 0;
                }
                if (arr[i][j] == 'J') {
                    jihoonQueue.offer(new int[]{i, j});
                    jihoonTime[i][j] = 0;
                }
            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!fireQueue.isEmpty()) {
            int[] cur = fireQueue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                if (arr[nx][ny] == '#' || fireTime[nx][ny] != -1) continue;

                fireTime[nx][ny] = fireTime[cur[0]][cur[1]] + 1;
                fireQueue.offer(new int[]{nx, ny});
            }
        }

        while (!jihoonQueue.isEmpty()) {
            int[] cur = jihoonQueue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                    bw.write(String.valueOf(jihoonTime[cur[0]][cur[1]] + 1));
                    bw.flush();
                    return;
                }

                if (arr[nx][ny] == '#' || jihoonTime[nx][ny] != -1) continue;

                if (fireTime[nx][ny] != -1 && fireTime[nx][ny] <= jihoonTime[cur[0]][cur[1]] + 1) continue;

                jihoonTime[nx][ny] = jihoonTime[cur[0]][cur[1]] + 1;
                jihoonQueue.offer(new int[]{nx, ny});
            }
        }

        bw.write("IMPOSSIBLE");
        bw.flush();
    }
}

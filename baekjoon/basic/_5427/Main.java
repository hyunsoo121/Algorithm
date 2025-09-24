package baekjoon.basic._5427;
import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int w = Integer.parseInt(line[0]);
            int h = Integer.parseInt(line[1]);

            char[][] arr = new char[h][w];
            int[][] fireTime = new int[h][w];
            int[][] playerTime = new int[h][w];

            Queue<int[]> fireQueue = new LinkedList<>();
            Queue<int[]> playerQueue = new LinkedList<>();

            for (int j = 0; j < h; j++) {
                String line2 = br.readLine();
                for (int k = 0; k < w; k++) {
                    arr[j][k] = line2.charAt(k);
                    fireTime[j][k] = -1;
                    playerTime[j][k] = -1;

                    if (arr[j][k] == '*') {
                        fireQueue.offer(new int[]{j, k});
                        fireTime[j][k] = 0;
                    } else if (arr[j][k] == '@') {
                        playerQueue.offer(new int[]{j, k});
                        playerTime[j][k] = 0;
                    }
                }
            }

            while (!fireQueue.isEmpty()) {
                int[] cur = fireQueue.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = cur[0] + dx[j];
                    int ny = cur[1] + dy[j];

                    if (nx >= 0 && nx < h && ny >= 0 && ny < w) {
                        if (fireTime[nx][ny] == -1 && (arr[nx][ny] == '.' || arr[nx][ny] == '@')) {
                            fireTime[nx][ny] = fireTime[cur[0]][cur[1]] + 1;
                            fireQueue.offer(new int[]{nx, ny});
                        }
                    }
                }
            }

            boolean possible = false;

            while (!playerQueue.isEmpty()) {
                int[] cur = playerQueue.poll();

                if (cur[0] == 0 || cur[0] == h - 1 || cur[1] == 0 || cur[1] == w - 1) {
                    bw.write(playerTime[cur[0]][cur[1]] + 1 + "\n");
                    possible = true;
                    break;
                }

                for (int j = 0; j < 4; j++) {
                    int nx = cur[0] + dx[j];
                    int ny = cur[1] + dy[j];

                    if (nx >= 0 && nx < h && ny >= 0 && ny < w) {
                        if (playerTime[nx][ny] == -1 && (arr[nx][ny] == '.')) {
                            if (fireTime[nx][ny] == -1 || playerTime[cur[0]][cur[1]] + 1 < fireTime[nx][ny]) {
                                playerTime[nx][ny] = playerTime[cur[0]][cur[1]] + 1;
                                playerQueue.offer(new int[]{nx, ny});
                            }
                        }
                    }
                }
            }

            if (!possible) {
                bw.write("IMPOSSIBLE\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
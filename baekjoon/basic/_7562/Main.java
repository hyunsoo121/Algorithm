package baekjoon.basic._7562;

import java.util.*;
import java.io.*;
public class Main {

    static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    static int goal[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(br.readLine());
            String[] line1 = br.readLine().split(" ");
            int[] cur = new int[]{Integer.parseInt(line1[0]), Integer.parseInt(line1[1])};

            String[] line2 = br.readLine().split(" ");
            goal = new int[]{Integer.parseInt(line2[0]), Integer.parseInt(line2[1])};

            boolean visited[][] = new boolean[size][size];

            if (cur[0] == goal[0] && cur[1] == goal[1]) {
                bw.write("0\n");
                continue;
            }

            bw.write(bfs(cur, visited) + "\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

    public static int bfs(int[] first, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{first[0], first[1], 0});

        visited[first[0]][first[1]] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int i = 0; i < 8; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < visited.length && ny < visited[0].length && !visited[nx][ny]) {
                    if (nx == goal[0] && ny == goal[1]) {
                        return cur[2] + 1;
                    }
                    if (!visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny, cur[2] + 1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }

        return 0;
    }


}

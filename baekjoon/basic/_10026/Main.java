package baekjoon.basic._10026;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        String[][] arr = new String[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = String.valueOf(line.charAt(j));
            }
        }

        boolean[][] visited = new boolean[n][n];
        boolean[][] visited2 = new boolean[n][n];

        int count = 0, count2 = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j]) {
                    bfs(dx, dy, arr, visited, i, j, 1);
                    count++;
                }
                if(!visited2[i][j]){
                    bfs(dx, dy, arr, visited2, i, j, 2);
                    count2++;
                }
            }
        }

        bw.write(count + " " + count2);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs(int[] dx, int[] dy, String[][] arr, boolean[][] visited, int x, int y, int num){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});

        visited[x][y] = true;
        while(!queue.isEmpty()){
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length){
                    if(!visited[nx][ny] && num == 2)
                        if(arr[cur[0]][cur[1]].equals(arr[nx][ny]) || (arr[cur[0]][cur[1]].equals("R") && arr[nx][ny].equals("G")) ||
                                (arr[cur[0]][cur[1]].equals("G") && arr[nx][ny].equals("R"))){
                            visited[nx][ny] = true;
                            queue.offer(new int[]{nx, ny});
                        }
                    if(!visited[nx][ny] && num == 1){
                        if(arr[cur[0]][cur[1]].equals(arr[nx][ny])) {
                            visited[nx][ny] = true;
                            queue.offer(new int[]{nx, ny});
                        }
                    }
                }
            }
        }
    }


}

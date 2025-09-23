package baekjoon.basic._2583;

import java.util.*;
import java.io.*;
public class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");

        boolean[][] arr = new boolean[Integer.parseInt(line[0])][Integer.parseInt(line[1])];
        boolean[][] visited = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < Integer.parseInt(line[2]); i++) {
            String[] input = br.readLine().split(" ");

            int y1 = Integer.parseInt(input[0]);
            int x1 = Integer.parseInt(input[1]);
            int y2 = Integer.parseInt(input[2]);
            int x2 = Integer.parseInt(input[3]);

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    arr[j][k] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(!arr[i][j] && !visited[i][j]){
                    bfs(arr, visited, i, j);
                    count++;
                }
            }
        }

        Collections.sort(list);

        bw.write(count + "\n");
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs(boolean[][] arr, boolean[][] visitied, int x, int y){

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{x, y});
        int count = 1;
        visitied[x][y] = true;

        while (!queue.isEmpty()){
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length){
                    if (!visitied[nx][ny] && !arr[nx][ny]){
                        visitied[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                        count++;
                    }
                }
            }
        }
        list.add(count);
    }
}

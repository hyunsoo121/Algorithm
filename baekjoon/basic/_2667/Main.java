package baekjoon.basic._2667;
import java.io.*;
import java.util.*;
public class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[n][n];
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < arr.length; i++) {
            String line = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                if(line.charAt(j) == '1')
                    arr[i][j] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (!visited[i][j] && arr[i][j]){
                    bfs(arr, visited, i, j);
                    count++;
                }
            }
        }

        Collections.sort(list);

        bw.write(count + "\n");

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs(boolean[][] arr, boolean[][] visited, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        int count = 1;
        queue.offer(new int[]{x, y});

        visited[x][y] = true;

        while (!queue.isEmpty()){

            int[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {

                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length){
                    if(!visited[nx][ny] && arr[nx][ny]){
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                        count++;
                    }
                }
            }
        }

        list.add(count);
    }
}

package baekjoon.basic._1926;
import java.io.*;
import java.util.*;
public class Main {
    static int n = 0;
    static int max = 0;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] size = br.readLine().split(" ");

        boolean[][] arr = new boolean[Integer.parseInt(size[0])][Integer.parseInt(size[1])];

        for(int i = 0; i < arr.length; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < input.length; j++){
                if(input[j].equals("1"))
                    arr[i][j] = true;
            }
        }

        boolean[][] visited = new boolean[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] && !visited[i][j]){
                    max = Math.max(max, bfs(i, j, arr, visited));
                    n++;
                }
            }
        }

        bw.write(n + "\n" + max);

        br.close();
        bw.flush();
        bw.close();
    }

    public static int bfs(int x, int y, boolean[][] arr, boolean[][] visited){
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        int size = 1;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();

            for(int i = 0; i < 4; i ++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                    if (!visited[nx][ny] && arr[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                        size++;
                    }
                }
            }
        }
        return size;
    }
}

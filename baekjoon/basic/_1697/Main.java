package baekjoon.basic._1697;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int time = 0;

        boolean[] arr = new boolean[100001];

        arr[n] = true;

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{n, 0});

        while(!queue.isEmpty()){
            int cur[] = queue.poll();

            if(cur[0] == k){
                time = cur[1];
                break;
            }

            int[] moves = {cur[0] + 1, cur[0] - 1, cur[0] * 2};

            for(int i : moves){
                if(i >= 0 && i <= 100000 && !arr[i]){
                    arr[i] = true;
                    queue.offer(new int[]{i, cur[1] + 1});
                }
            }
        }

        bw.write(String.valueOf(time));

        br.close();
        bw.flush();
        bw.close();
    }
}

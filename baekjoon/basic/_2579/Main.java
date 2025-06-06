package baekjoon.basic._2579;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            bw.write(String.valueOf(arr[0]));
        } else {
            int[][] dp = new int[n + 1][3];

            dp[1][1] = arr[0];
            dp[2][1] = arr[1];
            dp[2][2] = arr[0] + arr[1];

            for(int i = 3; i <= n; i++){
                dp[i][1] = Math.max(dp[i - 2][1], dp[i - 2][2]) + arr[i - 1];
                dp[i][2] = dp[i - 1][1] + arr[i - 1];
            }

            bw.write(String.valueOf(Math.max(dp[n][1], dp[n][2])));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

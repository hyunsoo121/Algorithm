package baekjoon.basic._1149;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n + 1][3];
        int[][] color = new int[n + 1][3];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                color[i][j] = Integer.parseInt(line[j]);
            }
        }

        dp[0][0] = color[0][0];
        dp[0][1] = color[0][1];
        dp[0][2] = color[0][2];

        for (int i = 1; i < n; i++) {

            dp[i][0] = color[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = color[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = color[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);

        }

        bw.write(String.valueOf(Math.min(Math.min(dp[n - 1][0], dp[n-1][1]), dp[n-1][2])));

        br.close();
        bw.flush();
        bw.close();

    }
}

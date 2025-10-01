package baekjoon.basic._1932;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int arr[][] = new int[n][n];
        int dp[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }

        dp[0][0] = arr[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    dp[i][j] = dp[i - 1][j] + arr[i][j];
                else if (j == i)
                    dp[i][j] = dp[i - 1][j - 1] + arr[i][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(dp[n-1][i], result);
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }
}

package baekjoon.basic._12852;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n + 3][2];

        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            int result = dp[i - 1][0] + 1;
            dp[i][1] = i - 1;

            if(i % 3 == 0 && dp[i / 3][0] + 1 < result){
                result = dp[i / 3][0] + 1;
                dp[i][1] = i / 3;
            }

            if(i % 2 == 0 && dp[i / 2][0] + 1 < result){
                result = dp[i / 2][0] + 1;
                dp[i][1] = i / 2;
            }

            dp[i][0] = result;
        }

        bw.write(dp[n][0] + "\n");
        for (int i = n; ;) {
            if (i == 1){
                bw.write(String.valueOf(1));
                break;
            }
            bw.write(i + " ");
            i = dp[i][1];
        }

        br.close();
        bw.flush();
        bw.close();

    }
}

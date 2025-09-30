package baekjoon.basic._11659;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");

        int[] arr = new int[Integer.parseInt(line[0]) + 1];
        int[] dp = new int[arr.length];

        String[] line2 = br.readLine().split(" ");
        for (int i = 0; i < Integer.parseInt(line[0]); i++) {
            arr[i] = Integer.parseInt(line2[i]);
        }

        int max = 1;

        dp[0] = 0;
        dp[1] = arr[0];
        for (int i = 0; i < Integer.parseInt(line[1]); i++) {
            String[] line3 = br.readLine().split(" ");

            int num = Integer.parseInt(line3[1]);
            if (num > max) {
                for (int j = max; j < num; j++) {
                    dp[j + 1] = dp[j] + arr[j];
                }
                max = num - 1;
            }

            bw.write(dp[num] - dp[Integer.parseInt(line3[0]) - 1] + "\n");

        }


        br.close();
        bw.flush();
        bw.close();
    }
}

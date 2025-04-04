package baekjoon.basic._2309;

import java.io.*;
import java.util.*;

public class Main {
    static int[] arr = new int[9];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] result = new int[7];
        combination(0, 0, result);

        br.close();
        bw.close();
    }

    static void combination(int count, int start, int[] result) throws IOException{
        if (count == 7) {
            int sum = 0;
            for (int i : result)
                sum += i;

            if (sum == 100) {
                Arrays.sort(result);
                for (int i : result)
                    bw.write(i + "\n");
                bw.flush();
                System.exit(0);
            }
            return;
        }

        for (int i = start; i < 9; i++) {
            result[count] = arr[i];
            combination(count + 1, i + 1, result);
        }
    }
}

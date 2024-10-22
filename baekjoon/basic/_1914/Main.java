package baekjoon.basic._1914;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger res = new BigInteger("1");

        int N = Integer.parseInt(br.readLine());

        if (N <= 20) {
            hanoi(N, 1, 3, 2);
            sb.insert(0, (int) (Math.pow(2, N) - 1) + "\n");
            System.out.print(sb);
        } else {
            for (int i = 0; i < N; i++) {
                res = res.multiply(new BigInteger("2"));
            }
            res = res.subtract(new BigInteger("1"));
            System.out.println(res);
        }
        br.close();
        bw.flush();
        bw.close();

    }

    public static void move(int n, int start, int end) throws IOException {
        sb.append(start + " " + end + "\n");
    }

    public static void hanoi(int n, int start, int end, int via) throws IOException {
        if (n == 1)
            move(1, start, end);
        else {
            hanoi(n - 1, start, via, end);
            move(n, start, end);
            hanoi(n - 1, via, end, start);
        }
    }
}
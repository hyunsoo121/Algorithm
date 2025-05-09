package baekjoon.basic._2588;

import java.io.*;
// import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int c = a * (b % 10); // 1의 자리
        int d = a * ((b % 100) / 10); // 10의 자리
        int e = a * (b / 100); // 100의자리

        bw.write(String.valueOf(c));
        bw.newLine();
        bw.write(String.valueOf(d));
        bw.newLine();
        bw.write(String.valueOf(e));
        bw.newLine();
        bw.write(String.valueOf(c + (d * 10) + (e * 100))); // 결과값

        bw.close();
        br.close();

    }

}

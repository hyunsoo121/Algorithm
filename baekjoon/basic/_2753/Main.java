package baekjoon.basic._2753;

import java.io.*;
// import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) // 4로 나눠지고 100으로 나눠지지 않거나 400으로 나눠지는 수 조건문
            bw.write(String.valueOf(1));
        else
            bw.write(String.valueOf(0));

        bw.close();
        br.close();

    }
}

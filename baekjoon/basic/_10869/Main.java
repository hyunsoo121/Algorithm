package baekjoon.basic._10869;

import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // input
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // output
        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백구분 (매개변수로 구분 값을 무엇으로 할지 지정 가능. 기본값은 공백)

        int a = Integer.parseInt(st.nextToken()); // 문자열을 정수로 반환
        int b = Integer.parseInt(st.nextToken());
        
        bw.write(String.valueOf(a+b)); // 문자열로 반환
        bw.newLine();
        bw.write(String.valueOf(a-b));
        bw.newLine();
        bw.write(String.valueOf(a*b));
        bw.newLine();
        bw.write(String.valueOf(a/b));
        bw.newLine();
        bw.write(String.valueOf(a%b));


        bw.close();
        br.close();

    }
}

package baekjoon.basic._2557;

import java.io.*;
// import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        bw.write("Hello World!"); // 괄호안의 값 출력

        bw.flush(); // 버퍼안에 남아있는 데이터 비우고 출력
        bw.close(); // 버퍼안에 데이터 비우고 출력한 뒤 스트림 닫힘
    }
}

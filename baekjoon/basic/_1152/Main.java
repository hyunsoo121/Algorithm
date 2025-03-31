package baekjoon.basic._1152;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        String s = br.readLine();
//
//        String[] arr = s.split(" ");
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (!arr[i].equals("")) {
//                count++;
//            }
//        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = st.countTokens();

        bw.write(String.valueOf(count));

        bw.close();
        br.close();
    }
}

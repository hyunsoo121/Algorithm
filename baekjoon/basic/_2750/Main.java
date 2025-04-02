package baekjoon.basic._2750;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr); // dual-pivot Quicksort, 시간복잡도는 O(nlogn) 최악의 경우 O(n^2)

        for (int i : arr) {
            bw.write(i + "\n");
        }

        br.close();
        bw.close();
    }
}

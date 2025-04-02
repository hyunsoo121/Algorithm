package baekjoon.basic._2751;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arrayList); // Timsort(합병정렬 + 삽입정렬), 시간복잡도는 O(nlogn) 최악의 경우도 O(nlogn)

        for (int i : arrayList) {
            bw.write(i + "\n");
        }

        br.close();
        bw.close();
    }
}

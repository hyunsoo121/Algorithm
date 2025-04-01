package baekjoon.basic._15649;

import java.io.*;
import java.util.*;
public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int arr[];
    static boolean visit[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n];

        backTracking(0);

        br.close();
        bw.close();
    }

    static void backTracking(int count) throws IOException{
        if (count == arr.length){
            for(int i : arr)
                bw.write(i + " ");
            bw.newLine();
            return;
        }

        for (int i = 0; i < visit.length; i++){
            if (!visit[i]) {
                visit[i] = true;
                arr[count] = i + 1;
                backTracking(count + 1);
                visit[i] = false;
            }
        }
    }
}

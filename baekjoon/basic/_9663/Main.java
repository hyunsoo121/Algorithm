package baekjoon.basic._9663;

import java.io.*;
import java.util.*;
public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n]; // 퀸의 위치 저장하는 배열
        backTracking(0, arr);

        bw.write(String.valueOf(count));

        br.close();
        bw.close();
    }

    public static void backTracking(int n, int arr[]){
        // n이 현재 배치하려는 행
        if (n >= arr.length) {
            count++; // 경우의 수를 찾으면 카운트
            return;
        }
        for (int i = 0; i < arr.length; i++){
            boolean legal = true;
            for (int j = 0; j < n; j++){
                if (arr[j] == i || arr[j] == i + (n - j) || arr[j] == i - (n - j)) { // arr[j] = i -> j번째 행 i번째 열에 위치함을 의미
                    legal = false;
                    break;
                }
            }
            if (legal) {
                arr[n] = i; // 조건에 부합하면 위치 저장 후 백트래킹
                backTracking(n+1, arr);
            }
        }
    }
}
package baekjoon.basic._10989;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[10001]; // 계수정렬. 입력받은 숫자에 해당하는 인덱스를 ++. 미리 메모리를 할당해서 하는 정렬방법

        for (int i = 0; i < n; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i =1; i < arr.length; i++){
            for (int j = 0; j < arr[i]; j++)
                bw.write(i + "\n");
        }

        br.close();
        bw.close();
    }
}

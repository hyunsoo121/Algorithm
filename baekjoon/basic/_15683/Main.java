package baekjoon.basic._15683;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int[][] arr = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int i = 0; i <arr.length ; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0 && arr[i][j] != 6){
                    if(arr[i][j] == 1){

                    }
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

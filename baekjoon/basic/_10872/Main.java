package baekjoon.basic._10872;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(factorial(N)));

        bw.close();
        br.close();
    }

    public static int factorial(int k){

        if (k < 2) {
            return 1; 
        }
        return k * factorial(k-1);
    }
}

package baekjoon.basic._1978;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            
            if (num == 1) {
                count++;
                continue;
            }

            for(int j = 2; j < num; j++){
                if(num % j == 0){
                    count++;
                    break;
                } 
            }
        }

        bw.write(String.valueOf(N - count));

        bw.close();
        br.close();
        
    }
}

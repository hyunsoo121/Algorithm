package baekjoon.basic._8958;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        
        for (int i=0; i<n; i++){
            String s = br.readLine();
            int count = 0, score = 0;
            for (int j=0; j<s.length(); j++){
                if (s.charAt(j) == 'O'){
                    count++;
                    score += count;
                }
                else
                    count = 0;
            }
            bw.write(String.valueOf(score));
            bw.newLine();
        }


        bw.flush();
        bw.close();
        br.close();

        
    }    
}

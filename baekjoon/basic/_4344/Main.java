package baekjoon.basic._4344;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            ArrayList<Integer> array = new ArrayList<>();
            int avg = 0;
            for (int j=0; j<n; j++){
                int input = Integer.parseInt(st.nextToken());
                array.add(input);
                avg += input;
            }
            avg /= n;
            int count = 0;
            for (int j : array){
                if (j > avg)
                    count++;
            }
            double result = ((double)count/n) * 100 ;
            bw.write(String.format("%.3f", result) + "%");
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }    
}

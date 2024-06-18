package baekjoon.basic._10871;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            int c = Integer.parseInt(st.nextToken());
            if (c<b)
                bw.write(String.valueOf(c) + " ");
        }

        bw.flush();
        bw.close();
        br.close();

        
    }
}

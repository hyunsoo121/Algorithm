package baekjoon.basic._1152;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String[] arr = s.split(" ");
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if (!arr[i].equals("")) {
                count++;
            }    
        }
        
        bw.write(String.valueOf(count));
        
        bw.flush();
        bw.close();
        br.close();
    }
}

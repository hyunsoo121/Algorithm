package baekjoon.basic._11654;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String c = br.readLine();
        
        bw.write(String.valueOf((int)c.charAt(0)));

        br.close();
        bw.flush();
        bw.close();

    }
}

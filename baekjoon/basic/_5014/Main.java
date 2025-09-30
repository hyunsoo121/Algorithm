package baekjoon.basic._5014;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");

        int floor = Integer.parseInt(line[0]);
        int cur = Integer.parseInt(line[1]);
        int goal = Integer.parseInt(line[2]);
        int up = Integer.parseInt(line[3]);
        int down = Integer.parseInt(line[4]);

        if(cur == goal)
            bw.write(String.valueOf(0));
        else if(cur > goal){

        }

        br.close();
        bw.flush();
        bw.close();
    }
}

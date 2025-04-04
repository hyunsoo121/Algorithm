package baekjoon.basic._2309;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr.add(Integer.valueOf(br.readLine()));
            sum += arr.get(i);
        }

        Collections.sort(arr);

        for (int i = 0; i < 9; i++) {
            for (int j = i; j < 9; j++) {
                if (sum - arr.get(i) - arr.get(j) == 100){

                    for (int k = 0; k < arr.size(); k++) {
                        if (k != i && k != j)
                            bw.write(arr.get(k) + "\n");
                    }

                    bw.flush();
                    bw.close();
                    br.close();

                    return;
                }
            }
        }
    }

}

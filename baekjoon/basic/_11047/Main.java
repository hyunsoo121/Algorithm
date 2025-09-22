package baekjoon.basic._11047;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int price = Integer.parseInt(input[1]);
        int count = 0;

        int[] coin = new int[Integer.parseInt(input[0])];

        for (int i = 0; i < coin.length; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for (int i = coin.length - 1; i >= 0; i--) {
            if (price == 0)
                break;
            if (price / coin[i] != 0){
                count += price / coin[i];
                price %= coin[i];
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }
}

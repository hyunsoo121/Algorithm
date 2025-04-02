package baekjoon.basic._1181;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>(); // 중복 제거

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> arr = new ArrayList<>(set);

        Collections.sort(arr, (s1, s2) -> { // 직접 비교 만들기(comparator) 반환값이 양수면 바꾸고 음수면 그대로
            if (s1.length() == s2.length())
                return s1.compareTo(s2); // 정렬 순서 알려주는 함수. s1이 뒤로 가야 되면 양수 반환. s1이 앞으로 와야되면 음수 반환
            return s1.length() - s2.length();
        });


        for (String s : arr){
            bw.write(s + "\n");
        }

        br.close();
        bw.close();
    }
}

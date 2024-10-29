package infren.chapter1._7;

import java.util.Scanner;

public class Main {
    public static String solution(String s) {

        s = s.toUpperCase();

        char[] arr = s.toCharArray();
        int idx = arr.length-1;

        for (int i = 0; i<arr.length/2; i++){
            if (arr[i] != arr[idx-i]){
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(solution(s));
    }
}

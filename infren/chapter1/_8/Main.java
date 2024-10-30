package infren.chapter1._8;

import java.util.Scanner;

public class Main {
    public static String solution(String s) {

        int start = 0, end = s.length()-1;

        char[] arr = s.toCharArray();

        for (;start >= end; ){

        }
        return "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(solution(s));
    }
}

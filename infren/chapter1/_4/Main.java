package infren.chapter1._4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static char[] solution(String s){

        int idx = s.length()-1;
        char[] arr = s.toCharArray();
        for (int i = 0; i <s.length()/2; i++) {
            char temp = arr[i];
            arr[i] = arr[idx-i];
            arr[idx-i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            String s = sc.next();
            System.out.println(solution(s));
        }

    }
}

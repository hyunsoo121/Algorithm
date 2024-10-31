package infren.chapter1._8;

import java.util.Scanner;

public class Main {
    public static String solution(String s) {



        char[] arr = s.toCharArray();

        System.out.println(arr[14]);

        for (int start = 0, end = arr.length-1; start >= end; ){
            if (Character.isAlphabetic(arr[start]) && Character.isAlphabetic(arr[end])){
                System.out.println("1");
                if (!(arr[start] == arr[end])){
                    return "NO";
                }
            }
            else if (!Character.isAlphabetic(arr[start]))
                start++;
            else if (!Character.isAlphabetic(arr[end]))
                end++;

            start++;
            end++;

        }

        return "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(solution(s));
    }
}

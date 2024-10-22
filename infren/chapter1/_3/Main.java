package infren.chapter1._3;

import java.util.Scanner;

public class Main {
    public static String solution(String str){

        String[] arr = str.split(" ");

        String result = "";

        for(String s: arr){
            if (s.length() > result.length())
                result = s;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(solution(str));
    }
}

package infren.chapter1._2;

import java.util.Scanner;

public class Main {
    public static String solution(String str){

        String result = "";
        for (char c : str.toCharArray()){
            if (Character.isUpperCase(c)){
                result = result +  Character.toLowerCase(c);
            }
            else
                result = result +  Character.toUpperCase(c);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print(solution(str));
    }
}
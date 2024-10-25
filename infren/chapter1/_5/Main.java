package infren.chapter1._5;

import java.util.Scanner;

public class Main {
    public static char[] solution(String s){

        int end = s.length()-1;
        char[] arr = s.toCharArray();
        for (int start = 0; start < end;) {

            if(!Character.isAlphabetic(arr[start])){
                start++;
            }
            else if(!Character.isAlphabetic(arr[end])) {
                end--;
            }
            else{
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++; end--;
            }

        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(solution(s));

    }
}

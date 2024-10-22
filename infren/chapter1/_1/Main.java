package infren.chapter1._1;

import java.util.*;

public class Main {
    public static int solution(String str, char t){
        int answer = 0;

        String sentence = str.toLowerCase();
        t = Character.toLowerCase(t);
        for (int i=0; i<sentence.length(); i++){
            if (sentence.charAt(i) == t){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char c = sc.next().charAt(0);

        System.out.print(solution(str, c));
    }
}

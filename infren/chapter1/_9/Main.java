package infren.chapter1._9;
import java.util.Scanner;

public class Main {
    public static int solution(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c);
            }
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solution(s));
    }
}

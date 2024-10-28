package infren.chapter1._6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Character> solution(String s){

        ArrayList<Character> arrayList = new ArrayList<>();
        char[] result = s.toCharArray();
        for(char c : result){
            if (!arrayList.contains(c)){
                arrayList.add(c);
            }
        }

        return arrayList;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (char c : solution(s)){
            System.out.print(c);
        }
    }
}

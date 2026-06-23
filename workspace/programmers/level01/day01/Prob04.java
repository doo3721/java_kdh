package level01.day01;

import java.util.Scanner;

public class Prob04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            int c = (int)a.charAt(i);
            if (c > 96)
                c = c - 32;
            else
                c = c + 32;
            System.out.print((char)c);
        }
    }
}

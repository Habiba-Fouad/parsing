package parsing;

import java.util.Scanner;

public class NumberOnly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            sum += Integer.parseInt(a);
        }
        /*
        for (int i = 0; i < s.length(); i++)
        {
            //s.substring(i, i + 1);
            sum += Integer.parseInt(a);
        }
        */
        System.out.println(sum);
    }
}
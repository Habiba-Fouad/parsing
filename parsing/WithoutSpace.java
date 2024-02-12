package parsing;

import java.util.Scanner;

public class WithoutSpace {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hany2000ahmed3000wael2450");
        int sum=0;
        String a ="";
        for (int i = 0; i < s.length(); i++) {
            if(i==s.length()-1){
                a+=s.charAt(i);
                sum+=Integer.parseInt(a);
            }
            else {
            if (Character.isDigit(s.charAt(i))&&Character.isDigit(s.charAt(i+1)))
            {
                a+=s.charAt(i);
            }
            else if (Character.isDigit(s.charAt(i))&&(!Character.isDigit(s.charAt(i+1))))
            {
                    a+=s.charAt(i);
                    sum+=Integer.parseInt(a);
                    a="";
                }
            }}

        System.out.println(sum);
        }
}

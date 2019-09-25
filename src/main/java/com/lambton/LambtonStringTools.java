package com.lambton;
import java.lang.String;
public class LambtonStringTools {

    public static String reverse(String  s) {
        String rString = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            rString = rString + s.charAt(i);
        }


        return(rString);
    }

public static int binaryToDecimal(String s) {
    {
        int decimalNumber = Integer.parseInt(s, 2);

        return (decimalNumber);

    }
public static String initials(String s){
        s = s.trim();
        String initial = "";
        String nstr = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                continue;
            } else {
                initial = initial + ch;
                initial = initial + ".";
            }
            return(initial);

        }


    }}}

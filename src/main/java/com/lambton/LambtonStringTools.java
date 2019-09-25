package com.lambton;

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


}
}

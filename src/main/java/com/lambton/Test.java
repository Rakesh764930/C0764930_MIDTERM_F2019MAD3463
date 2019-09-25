package com.lambton;

public class Test {


    public static void main(String[] args) {

        LambtonStringTools rev=new LambtonStringTools();
        String res=rev.reverse("Lambton");
        System.out.println("the reverse string is "+res);

        int real=rev.binaryToDecimal("1010");
        System.out.println("the decimal number is :"+real);

        String initialName=rev.initials("Rahul Kumar Sinha");

    }
}

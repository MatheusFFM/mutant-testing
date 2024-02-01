package com.factorial;

public class Factorial {
    public static long calculate(int num) throws  IllegalArgumentException{
        if(num < 0) {
            String errorMessage = "Factorial of negative numbers can not exist.";
            System.out.println(errorMessage);
            throw new IllegalArgumentException(errorMessage);
        } else if(num <= 1) {
            return 1;
        } else {
            return num * calculate(num - 1);
        }
    }
}

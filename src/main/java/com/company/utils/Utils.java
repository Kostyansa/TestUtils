package com.company.utils;

public class Utils {

    public int computeFactorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return n == 0 ? 1 : n * computeFactorial(n - 1);
    }

    public String concatenateStrings(String a, String b){
        if ((a == null) || (b == null)){
            throw new IllegalArgumentException("One of the arguments is Null");
        }
        return new StringBuilder().append(a).append(b).toString();
    }
}

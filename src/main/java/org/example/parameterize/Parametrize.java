package org.example.parameterize;

public class Parametrize {
    public static boolean isPalindrome(String str){
        return new StringBuffer(str).reverse().toString().equals(str);
    }
}

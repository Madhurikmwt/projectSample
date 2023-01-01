package org.example;

public class IntegerPalindrome {

    public static void resultIsPalindrome(int x){
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x){
        if(x==0){
            return true;
        }
        if(x<0 || x%10==0){
            return false;
        }

        int reversed_int = 0;

        while(x > reversed_int){
            int temp = x%10;
            x /= 10;
            reversed_int *= 10;
            reversed_int += temp;
            reversed_int /= 10;
        }

        if(x==reversed_int){
            return true;
        }else{
            return false;
        }
    }
}

package org.example;

public class ReverseInteger {
    int reversInt = 0;

    public void reverse(int x) {
        int temp = x % 10;
        x /= 10;
    }
}
package com.company;

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while (start <= end) {
            swap(s, start++, end--);
        }
    }

    private void swap(char[] s, int start, int end) {
        char temp = s[end];
        s[end] = s[start];
        s[start] = temp;
    }
}

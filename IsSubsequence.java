package com.company;

import java.util.HashMap;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        } else if (t.isEmpty()) {
            return false;
        }
        int sIndex = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(sIndex)) {
                if (++sIndex == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}

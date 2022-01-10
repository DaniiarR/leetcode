package com.company;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        int index = 0;
        int endIndex = s.length() - 2;
        do {
            switch (s.charAt(index)) {
                case '(':
                    if (s.charAt(index + 1) != ')')
                        return false;
                    else
                        break;
                case '{':
                    if (s.charAt(index + 1) != '}')
                        return false;
                    else
                        break;
                case '[':
                    if (s.charAt(index + 1) != ']')
                        return false;
                    else
                        break;
            }
            index += 2;
        } while (index < endIndex);
        return true;
    }
}

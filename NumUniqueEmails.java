package com.company;

import java.util.HashMap;
import java.util.Map;

public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < emails.length; i++) {
            String s = emails[i];
            int plusIndex = s.indexOf('+');
            if (plusIndex != -1) {
                s = s.substring(0, plusIndex) + s.substring(s.indexOf('@'));
            }
            int dotIndex = s.indexOf('.');
            while (dotIndex > -1 && dotIndex < s.indexOf('@')) {
                s = s.substring(0, dotIndex) + s.substring(dotIndex + 1);
                dotIndex = s.indexOf('.');
            }
//            if (dotIndex > -1 && dotIndex < s.indexOf('@')) {
//                s = s.substring(0, dotIndex) + s.substring(dotIndex + 1);
//            }
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map.size();
    }
}

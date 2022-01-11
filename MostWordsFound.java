package com.company;

public class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String str:sentences){
            int len = str.split(" ").length;
            max = Integer.max(max,len);
        }
        return max;
    }
}

package com.CK;

public class Main {

    public static void main(String[] args) {
        String s = "     the sky   is blue   ";
        Solution solution = new Solution();
        System.out.println(solution.reverseWords(s));
    }
}

class Solution {
    public String reverseWords(String s) {
        if (s.length() == 0) return "";
        String[] sArr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = sArr.length - 1; i >= 0; i--) {
            if (sArr[i].length() == 0) continue;
            res.append(sArr[i]).append(" ");
        }
        return res.toString().trim();
    }
}
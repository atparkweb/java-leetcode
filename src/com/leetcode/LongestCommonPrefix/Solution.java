package com.leetcode.LongestCommonPrefix;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
public class Solution {
    /**
     * Takes a list of strings and returns the longest substring that is included in all
     * @param strs a list of strings
     * @return a substring that is in all strings in the list
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        Arrays.sort(strs);

        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        int index = 0;

        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return str1.substring(0, index);
    }
}

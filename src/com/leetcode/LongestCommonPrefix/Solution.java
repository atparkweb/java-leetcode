package com.leetcode.LongestCommonPrefix;

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
        int max = 0;
        int count;

        String firstWord = strs[0];

        for (int i = 0; i < firstWord.length(); i++) {
            count = 0;
            for (int j = 1; j < strs.length; j++) {
                String currentWord = strs[j];
                if (i < currentWord.length()) {
                    if (letterMatchAt(i, firstWord, currentWord)) {
                        count = count + 1;
                    }
                }
            }

            if (count == strs.length - 1) {
                max += 1;
            } else {
                break;
            }
        }

        return firstWord.substring(0, max);
    }

    private boolean letterMatchAt(int index, String str1, String str2) {
        return str1.charAt(index) == str2.charAt(index);
    }
}

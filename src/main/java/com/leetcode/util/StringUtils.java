package com.leetcode.util;

public class StringUtils {
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
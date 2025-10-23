package com.leetcode.problems;

public class ReduceToZero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                num = num >> 2;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }
}
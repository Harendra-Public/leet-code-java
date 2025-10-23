package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for(int i = 1; i <= n; i++) {
            String currentStr = "";
            if(i % 3 == 0) {
                currentStr = "Fizz";
            }
            if(i % 5 == 0) {
                currentStr += "Buzz";
            }
            if(currentStr.isEmpty()) {
                currentStr = String.valueOf(i);
            }
            answer.add(currentStr);
        }
        return answer;
    }
}
package com.leetcode.service;

import com.leetcode.problems.FizzBuzz;
import com.leetcode.problems.ReduceToZero;
import com.leetcode.model.ProblemExecutionRequest;
import com.leetcode.model.ProblemExecutionResponse;
import org.springframework.stereotype.Service;

@Service
public class ProblemExecutionService {
    
    public ProblemExecutionResponse executeProblem(ProblemExecutionRequest request) {
        Long problemId = request.getProblemId();
        Object input = request.getInput();
        Object result = null;
        String message = "Success";

        try {
            switch (problemId.intValue()) {
                case 412:  // FizzBuzz
                    if (input instanceof Integer) {
                        FizzBuzz fizzBuzz = new FizzBuzz();
                        result = fizzBuzz.fizzBuzz((Integer) input);
                    } else {
                        throw new IllegalArgumentException("Input must be an integer for FizzBuzz");
                    }
                    break;
                    
                case 1342:  // Number of Steps to Reduce a Number to Zero
                    if (input instanceof Integer) {
                        ReduceToZero reduceToZero = new ReduceToZero();
                        result = reduceToZero.numberOfSteps((Integer) input);
                    } else {
                        throw new IllegalArgumentException("Input must be an integer for Reduce to Zero");
                    }
                    break;
                    
                default:
                    throw new IllegalArgumentException("Problem ID not found: " + problemId);
            }
            
            return new ProblemExecutionResponse(problemId, result, message);
        } catch (Exception e) {
            return new ProblemExecutionResponse(problemId, null, "Error: " + e.getMessage());
        }
    }
}
package com.leetcode.service;

import com.leetcode.problems.FizzBuzz;
import com.leetcode.problems.MiddleOfLinkeList;
import com.leetcode.problems.ReduceToZero;
import com.leetcode.model.ProblemExecutionRequest;
import com.leetcode.model.ProblemExecutionResponse;
import org.springframework.stereotype.Service;
import com.leetcode.model.ListNodeInput;
import com.leetcode.util.ListNodeUtil;

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
                case 876:  // Middle of the Linked List
                    // Accept input as ListNodeInput or List<Integer>
                    ListNodeInput listNodeInput = null;
                    if (input instanceof ListNodeInput) {
                        listNodeInput = (ListNodeInput) input;
                    } else if (input instanceof java.util.Map) {
                        // If deserialized as Map, try to extract values
                        Object valuesObj = ((java.util.Map<?,?>)input).get("values");
                        if (valuesObj instanceof java.util.List) {
                            listNodeInput = new ListNodeInput((java.util.List<Integer>) valuesObj);
                        }
                    }
                    if (listNodeInput != null) {
                        MiddleOfLinkeList middleOfLinkeList = new MiddleOfLinkeList();
                        result = middleOfLinkeList.middleNode(ListNodeUtil.fromInput(listNodeInput));
                    } else {
                        throw new IllegalArgumentException("Input must be a ListNodeInput or a map with 'values' for Middle of the Linked List");
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
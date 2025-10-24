package com.leetcode.service;

import com.leetcode.problems.FizzBuzz;
import com.leetcode.problems.MiddleOfLinkeList;
import com.leetcode.problems.RansomNote;
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
                case 383:  // Ransom Note
                    if (input instanceof java.util.Map) {
                        java.util.Map<?,?> inputMap = (java.util.Map<?,?>) input;
                        Object ransomNoteObj = inputMap.get("ransomNote");
                        Object magazineObj = inputMap.get("magazine");
                        
                        // Validate both inputs are present
                        if (ransomNoteObj == null || magazineObj == null) {
                            throw new IllegalArgumentException("Both 'ransomNote' and 'magazine' must be provided");
                        }
                        
                        // Validate input types
                        if (!(ransomNoteObj instanceof String) || !(magazineObj instanceof String)) {
                            throw new IllegalArgumentException("Both 'ransomNote' and 'magazine' must be strings");
                        }
                        
                        // Convert and validate input contains only lowercase letters
                        String ransomNote = (String) ransomNoteObj;
                        String magazine = (String) magazineObj;
                        if (!ransomNote.matches("[a-z]*") || !magazine.matches("[a-z]*")) {
                            throw new IllegalArgumentException("Both strings must contain only lowercase letters");
                        }
                        
                        RansomNote ransomNoteSolver = new RansomNote();
                        result = ransomNoteSolver.canConstruct(ransomNote, magazine);
                    } else {
                        throw new IllegalArgumentException("Input must be a map containing 'ransomNote' and 'magazine' strings");
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
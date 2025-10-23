package com.leetcode.model;

public class ProblemExecutionRequest {
    private Long problemId;
    private Object input;

    // Constructors
    public ProblemExecutionRequest() {}

    public ProblemExecutionRequest(Long problemId, Object input) {
        this.problemId = problemId;
        this.input = input;
    }

    // Getters and Setters
    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }

    public Object getInput() {
        return input;
    }

    public void setInput(Object input) {
        this.input = input;
    }
}
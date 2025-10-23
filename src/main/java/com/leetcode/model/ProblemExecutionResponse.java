package com.leetcode.model;

public class ProblemExecutionResponse {
    private Long problemId;
    private Object result;
    private String message;

    // Constructors
    public ProblemExecutionResponse() {}

    public ProblemExecutionResponse(Long problemId, Object result, String message) {
        this.problemId = problemId;
        this.result = result;
        this.message = message;
    }

    // Getters and Setters
    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
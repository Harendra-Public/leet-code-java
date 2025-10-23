package com.leetcode.model;

public class Problem {
    private Long id;
    private String title;
    private String description;
    private String difficulty;

    // Constructors
    public Problem() {}

    public Problem(Long id, String title, String description, String difficulty) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.difficulty = difficulty;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
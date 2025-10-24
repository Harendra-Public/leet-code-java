package com.leetcode.model;

import java.util.List;

public class ListNodeInput {
    private List<Integer> values;

    public ListNodeInput() {}
    public ListNodeInput(List<Integer> values) {
        this.values = values;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }
}
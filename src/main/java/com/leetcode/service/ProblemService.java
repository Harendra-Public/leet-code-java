package com.leetcode.service;

import com.leetcode.model.Problem;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProblemService {
    private final List<Problem> problems = new ArrayList<>();

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public List<Problem> getAllProblems() {
        return problems;
    }

    public Problem getProblemById(Long id) {
        return problems.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
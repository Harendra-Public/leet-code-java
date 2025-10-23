package com.leetcode.controller;

import com.leetcode.model.Problem;
import com.leetcode.model.ProblemExecutionRequest;
import com.leetcode.model.ProblemExecutionResponse;
import com.leetcode.service.ProblemService;
import com.leetcode.service.ProblemExecutionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/problems")
public class ProblemController {
    private final ProblemService problemService;
    private final ProblemExecutionService executionService;

    public ProblemController(ProblemService problemService, ProblemExecutionService executionService) {
        this.problemService = problemService;
        this.executionService = executionService;
    }

    @PostMapping
    public void addProblem(@RequestBody Problem problem) {
        problemService.addProblem(problem);
    }

    @GetMapping("/{id}")
    public Problem getProblem(@PathVariable Long id) {
        return problemService.getProblemById(id);
    }

    @GetMapping
    public List<Problem> getAllProblems() {
        return problemService.getAllProblems();
    }

    @PostMapping("/execute")
    public ProblemExecutionResponse executeProblem(@RequestBody ProblemExecutionRequest request) {
        return executionService.executeProblem(request);
    }
}
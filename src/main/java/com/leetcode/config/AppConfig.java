package com.leetcode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.leetcode.service.ProblemService;
import com.leetcode.service.ProblemExecutionService;
import com.leetcode.controller.ProblemController;

@Configuration
public class AppConfig {
    
    @Bean
    public ProblemService problemService() {
        return new ProblemService();
    }

    @Bean
    public ProblemExecutionService problemExecutionService() {
        return new ProblemExecutionService();
    }

    @Bean
    public ProblemController problemController(ProblemService problemService, ProblemExecutionService executionService) {
        return new ProblemController(problemService, executionService);
    }
}
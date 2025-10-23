package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.leetcode.controller.ProblemController;
import com.leetcode.model.Problem;

/**
 * LeetCode Spring Boot Application
 */
@SpringBootApplication
public class LeetCodeApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LeetCodeApp.class, args);
        
        // Get our controller bean
        ProblemController problemController = context.getBean(ProblemController.class);
        
        // Add some sample problems
        problemController.addProblem(new Problem(412L, "Fizz Buzz", 
            "Write Fizz Buzz for a number", "Easy"));
        problemController.addProblem(new Problem(1342L, "Reduce Number to Zero", 
            "Reduce number to zero by /2 if even or -1", "Medium"));
        
        System.out.println("Spring Boot application is running!");
        System.out.println("Access the REST API at http://localhost:8080/api/problems");
    }
}

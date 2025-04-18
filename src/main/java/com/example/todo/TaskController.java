package com.example.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return List.of(
                new Task(1L, "Einkaufen gehen", false),
                new Task(2L, "Hausaufgaben machen", true)
        );
    }
}

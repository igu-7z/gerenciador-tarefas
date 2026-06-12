package com.github.igu_7z.gerenciador_tarefas.controllers;

import com.github.igu_7z.gerenciador_tarefas.models.Task;
import com.github.igu_7z.gerenciador_tarefas.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping
    public Task criar(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}

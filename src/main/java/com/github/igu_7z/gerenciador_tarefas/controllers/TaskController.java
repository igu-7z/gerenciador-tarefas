package com.github.igu_7z.gerenciador_tarefas.controllers;

import com.github.igu_7z.gerenciador_tarefas.models.Task;
import com.github.igu_7z.gerenciador_tarefas.repositories.TaskRepository;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping
    public Task criar(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping
    public List<Task> listar() {
        return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Task> buscarPorId(@PathVariable Long id) {
        return taskRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Task atualizar(@PathVariable Long id, @RequestBody Task taskAtualizada) {
        Optional<Task> taskOptional = taskRepository.findById(id);

        if (taskOptional.isPresent()) {
            Task taskExistente = taskOptional.get();

            taskExistente.setTitle(taskAtualizada.getTitle());
            taskExistente.setDescription(taskAtualizada.getDescription());

            return taskRepository.save(taskExistente);

        } else {
            return null;
        }
    }
}

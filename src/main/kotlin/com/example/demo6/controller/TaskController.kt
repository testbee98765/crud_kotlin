package com.example.demo6.controller

import com.example.demo6.model.Task
import com.example.demo6.repository.TaskRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController("/tasks")
class TaskController (val taskRepository: TaskRepository){

    @GetMapping
    fun getTasks() = taskRepository.findAll()

    @RequestMapping(path = [("/{taskId}")], method = [(RequestMethod.GET)])
    fun getTodo(@PathVariable("taskId") taskId: Long?): Optional<Task>? {
        return taskRepository.findById(taskId)
    }

    @PostMapping
    fun newTodo(@RequestBody task: Task): Task {
        taskRepository.save(task)
        return task
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    fun updateTodo(task: Task) {
        taskRepository.save(task)
    }

    @RequestMapping(path = [("/{taskId}")], method = [(RequestMethod.DELETE)])
    fun deleteTodo(@PathVariable("taskId") taskId: Long?) {
        taskRepository.deleteById(taskId)
    }
}
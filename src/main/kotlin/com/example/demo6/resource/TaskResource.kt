package com.example.demo6.resource

import com.example.demo6.model.Task
import com.example.demo6.service.TaskService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/v1/api/tasks")
class TaskResource(private val taskService: TaskService) {

    @GetMapping
    fun getTasks(): List<Task> =
            taskService.getTasks()

    @PostMapping
    fun addTask(@RequestBody task: Task): ResponseEntity<Task> =
            taskService.addTask(task)

    @GetMapping("/{id}")
    fun getTaskById(@PathVariable(value="id") taskId: Long): ResponseEntity<Task> =
            taskService.getTaskById(taskId)

    @PutMapping("/{id}")
    fun updateTaskById(
            @PathVariable(value = "id") taskId: Long,
            @RequestBody newTask: Task): ResponseEntity<Task> =
            taskService.putTask(taskId, newTask)

    @DeleteMapping("/{id}")
    fun deleteTask(@PathVariable(value = "id") taskId: Long): ResponseEntity<Void> =
            taskService.deleteTask(taskId)
}
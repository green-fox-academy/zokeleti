package connetctionwithmysql.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import connetctionwithmysql.exercise.model.Todo;
import connetctionwithmysql.exercise.repository.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Controller("/todo")
public class TodoController {

    Repository todoRepository;

    @Autowired
    public TodoController(Repository repository){
        this.todoRepository = repository;
    }

    @GetMapping(value = {"/list", "/"})
    public String list(Model model, @RequestParam(required = false) Boolean activetodo){
        List<Todo> reply = ((List<Todo>) todoRepository.findAll());
        if(activetodo == null){
            reply = ((List<Todo>) todoRepository.findAll());
        } else if(activetodo == true){
            reply = ((List<Todo>) todoRepository.findAll()).stream().filter(i -> !i.isDone()).collect(Collectors.toList());
        }
        model.addAttribute("todos", reply);
        return "todolist";
    }

    @GetMapping("/create")
    public String getCreateTodo(){
        return "create";
    }

    @PostMapping("/create")
    public String postCreateTodo(String todo){
        todoRepository.save(new Todo(todo));
        return "redirect:list";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable Long id){
            todoRepository.deleteById(id);
            return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String getEdit(@PathVariable Long id){
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String postEdit(@PathVariable Long id){
        return "redirect:/";
    }






}

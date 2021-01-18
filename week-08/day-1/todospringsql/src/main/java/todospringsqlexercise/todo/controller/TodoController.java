package todospringsqlexercise.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import todospringsqlexercise.todo.model.Todo;
import todospringsqlexercise.todo.repository.Repository;

import java.util.List;

@Controller("/todo")
public class TodoController {

    Repository todoRepository;

    @Autowired
    public TodoController(Repository repository){
        this.todoRepository = repository;
    }

    @GetMapping(value = {"/list", "/"})
    public String list(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }


}

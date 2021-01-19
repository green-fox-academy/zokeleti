package todospringsqlexercise.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import todospringsqlexercise.todo.model.Todo;
import todospringsqlexercise.todo.repository.Repository;

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
    public String listActive(@RequestParam(required = false) Boolean isActive, Model model){
        if(isActive == null){
            model.addAttribute("todos", todoRepository.findAll());
            return "todolist";
        }
        model.addAttribute("todos", ((List<Todo>) todoRepository.findAll()).stream().filter(i -> i.isDone() == !isActive).collect(Collectors.toList()));
        return "todolist";
    }

    @GetMapping("/create")
    public String getCreate(){
        return "create";
    }

    @PostMapping("/create")
    public String postCreate(String todo){
        todoRepository.save(new Todo(todo));
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        if(todoRepository.existsById(id)) {
            todoRepository.delete(todoRepository.findById(id).get());
        }
        return "redirect:/";
    }

    /*@GetMapping("/edit/{id}")
    public String getEdit(@PathVariable Long id, Model model){
        model.addAttribute()
        return "edit";
    }*/



}

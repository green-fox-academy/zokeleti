package restproject.rest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restproject.rest.model.*;
import restproject.rest.model.Error;
import restproject.rest.service.LogService;
import restproject.rest.service.SithService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MainRestController {

    private LogService logService;
    private ObjectMapper mapper;
    private SithService sithService;

    @Autowired
    public MainRestController(LogService logService, ObjectMapper mapper){
        this.logService = logService;
        this.mapper = mapper;
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> doubling(@RequestParam(required = false) Long input){
        logService.saveLog("/doubling", String.valueOf(input));
        if(input == null){
            Error error = new Error("Please provide an input!");
            return ResponseEntity.ok(error);
        }
        Doubling doubling = new Doubling(input);
        return ResponseEntity.ok(doubling);
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title){
        logService.saveLog("/greeter", "?name=" + name + "&title=" + title);
        if(name == null && title == null){
            return ResponseEntity.badRequest().body(new Error("Please provide a name and a title!"));
        } else if(title == null){
            return ResponseEntity.badRequest().body(new Error("Please provide a title!"));
        } else {
            return ResponseEntity.ok(new Welcome(name, title));
        }
    }

    @GetMapping("/appenda/{toAppend}")
    public ResponseEntity<?> appendA(@PathVariable String toAppend){
        logService.saveLog("/appenda/" + toAppend, toAppend);
        return ResponseEntity.ok(new AppendA(toAppend));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@RequestBody(required = false) Until until, @PathVariable String action) throws Exception{
        logService.saveLog("/dountil/" + action, mapper.writeValueAsString(until));
        Integer result = 0;
        if(action.equals("sum")){
            for(int i = 1; until.getUntil() >= i; i++){
                result += i;
            }
            return ResponseEntity.ok(new Result(result));
        } else if(action.equals("factor")){
            result = 1;
            for(int i = 1; until.getUntil() >= i; i++){
                result *= i;
            }
            return ResponseEntity.ok(new Result(result));
        } else if (until == null){
            return ResponseEntity.badRequest().body(new Error("Please provide a number!"));
        }
        return null;
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arrays(@RequestBody Input input) throws Exception {
        logService.saveLog("/arrays", mapper.writeValueAsString(input));
        if (input.getNumbers().size() == 0){
            return ResponseEntity.badRequest().body(new Error("Please enter numbers so they can be" + input.getWhat()));
        } else if(input.getWhat().equals("sum")){
            return ResponseEntity.ok(new Result(input.getNumbers().stream().mapToInt(Integer::intValue).sum()));
        } else if(input.getWhat().equals("multiply")){
            return ResponseEntity.ok(new Result(input.getNumbers().stream().reduce(1,  (a , b) -> a * b)));
        } else if(input.getWhat().equals("double")){
            return ResponseEntity.ok(new ArrayResult(input.getNumbers().stream().map(i -> i * 2).collect(Collectors.toList())));
        } else {
            return ResponseEntity.badRequest().body(new Error("Please provide what to do with the numbers!"));
        }
    }

    @GetMapping("/log")
    public Entries getEntries(){
        logService.saveLog("/log", "");
        List<Log> logs =logService.listAll();
        return new Entries(logs);
    }

    @PostMapping("/sith")
    public ResponseEntity<?> sithText(@RequestBody InputText text){
        if (text != null){
            return ResponseEntity.ok(new OutputText(sithService.yodiFy(text.getText())));
        } else {
            return ResponseEntity.badRequest().body(new Error("Feed me some text you have to, padawan young you are. Hmmm."));
        }
    }
}

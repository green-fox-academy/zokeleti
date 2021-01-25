package restproject.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restproject.rest.model.*;
import restproject.rest.model.Error;

import java.util.stream.Collectors;

@RestController
public class MainRestController {

    @GetMapping("/doubling")
    public ResponseEntity<?> doubling(@RequestParam(required = false) Long input){
        if(input == null){
            Error error = new Error("Please provide an input!");
            return ResponseEntity.ok(error);
        }
        Doubling doubling = new Doubling(input);
        return ResponseEntity.ok(doubling);
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title){
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
        return ResponseEntity.ok(new AppendA(toAppend));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@RequestBody(required = false) Until until, @PathVariable String action){
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
    public ResponseEntity<?> arrays(@RequestBody Input input) {
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
}
    /*Create a POST /arrays endpoint
        what can be 3 things: sum, multiply, double
        and responds with sum or multiplication of all elements in the numbers or with another array with the doubled elements:
        eg. /arrays with {"what": "sum", "numbers": [1,2,5,10]} will respond {"result": 18}
        eg. /arrays with {"what": "multiply", "numbers": [1,2,5,10]} will respond {"result": 100}
        eg. /arrays with {"what": "double", "numbers": [1,2,5,10]} will respond {"result": [2,4,10,20]}
        if no what (or numbers) is provided:
        {
        "error": "Please provide what to do with the numbers!"
        }*/
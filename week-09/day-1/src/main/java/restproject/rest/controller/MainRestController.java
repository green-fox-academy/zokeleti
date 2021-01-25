package restproject.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import restproject.rest.model.AppendA;
import restproject.rest.model.Doubling;
import org.springframework.web.bind.annotation.RestController;
import restproject.rest.model.Error;
import restproject.rest.model.Welcome;

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
}

package project.first_week.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.first_week.dto.Genre;
import project.first_week.service.MainService;



import java.util.List;

@RestController
public class MainRestController {


    MainService mainService;

    @Autowired
    public MainRestController(MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping("/api/genres")
    public ResponseEntity<List<Genre>> getGenres(@RequestParam String apiKey){
        return ResponseEntity.ok(mainService.getListOfGenres(apiKey));
    }
}

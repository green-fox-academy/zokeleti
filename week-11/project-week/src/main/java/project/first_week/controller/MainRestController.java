package project.first_week.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.first_week.dto.GenreDTO;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainRestController {

    @GetMapping("/api/genres")
    public ResponseEntity<List<GenreDTO>> getGenres(){
        return ResponseEntity.ok(new ArrayList<>());
    }
}

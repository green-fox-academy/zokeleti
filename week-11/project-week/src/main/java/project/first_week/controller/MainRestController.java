package project.first_week.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import project.first_week.JwtUtil;
import project.first_week.dto.Genre;
import project.first_week.model.AuthenticationRequest;
import project.first_week.model.AuthenticationResponse;
import project.first_week.service.MainService;
import project.first_week.service.MyUserDetailsService;


import java.util.List;

@RestController
public class MainRestController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    private MainService mainService;



    @GetMapping("/api/genres")
    public ResponseEntity<List<Genre>> getGenres(@RequestParam String apiKey){
        return ResponseEntity.ok(mainService.getListOfGenres(apiKey));
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Szevasz b*szd meg!";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUserName());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}

package com.bmd.bookMyDay.Controller;

import com.bmd.bookMyDay.SignUp.SignUpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class SignUpController {

    @GetMapping("/sampleProgram")
    public String sampleProgram() {
        return "Hello From Backend";
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody SignUpRequest signupRequest) {
        String password = signupRequest.getPassword();
        
        if (!isValidPassword(password)) {
            return new ResponseEntity<>("Need Strong Password", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(signupRequest.getUsername() + " registered successfully", HttpStatus.OK);
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[@#$%^&+=!].*");
    }
}

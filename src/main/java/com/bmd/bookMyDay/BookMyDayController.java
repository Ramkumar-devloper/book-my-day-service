package com.bmd.bookMyDay;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class BookMyDayController {
    
    @RequestMapping("/sampleProgram")
    public String sampleProgram() {
        return "Hello From Backend";
    }
}



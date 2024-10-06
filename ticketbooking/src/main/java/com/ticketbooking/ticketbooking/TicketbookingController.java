package main.java.com.ticketbooking.ticketbooking;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TicketbookingController {
    
    @RequestMapping("/sample")
    public String sample() {
        return "Hello From Backend";
    }
}

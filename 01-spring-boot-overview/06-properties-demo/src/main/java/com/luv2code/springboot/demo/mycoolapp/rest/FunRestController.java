package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Injecting properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;
    // expose team info
    @GetMapping("/teaminfo")
    public String getTeamName(){
        return "Coach: " + coachName + " Team Name: " + teamName;
    }
    @GetMapping("/")
    public String sayHello(){
        return "Hello, World!";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Run a hard 5km!";
    }

    @GetMapping("/fortune")
    public String fortune(){
        return "Today is your lucky day!";
    }
}
